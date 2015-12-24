package com.github.guilhermestorck.lap.builder;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by gstorck on 09/12/2015.
 */
abstract class ALAPTextView<T> extends ALAPLayoutedView<T> {

    ALAPTextView() { }

    public TextView build(Context ctx) {
        TextView view = new TextView(ctx);
        return fill(view, ctx);
    }

    protected TextView fill(TextView v, Context ctx) {
        v = (TextView) super.fill(v, ctx);
        if(text != null) v.setText(text);
        if(textRes != null) v.setText(textRes);
        if(allCaps != null) v.setAllCaps(allCaps);
        if(autoLinkMask != null) v.setAutoLinkMask(autoLinkMask);
        //TODO if(breakStrategy != null) v.setBreakStrategy(breakStrategy);
        if(ems != null) v.setEms(ems);
        if(gravity != null) v.setGravity(gravity);
        if(height != null) v.setHeight(height);
        return v;
    }

    private CharSequence text;
    private Integer textRes;
    private Boolean allCaps = null;
    private Integer autoLinkMask = null;
    private Integer breakStrategy = null;
    private Integer ems = null;
    private Integer gravity = null;
    private Integer height = null;

    public T text(CharSequence text) {
        this.text = text;
        this.textRes = null;
        return self();
    }

    public T textRes(Integer res) {
        this.text = null;
        this.textRes = res;
        return self();
    }

    public T allCaps(Boolean allCaps) {
        this.allCaps = allCaps;
        return self();
    }

    public T autoLinkMask(Integer autoLinkMask) {
        this.autoLinkMask = autoLinkMask;
        return self();
    }

    public T breakStrategy(Integer breakStrategy) {
        this.breakStrategy = breakStrategy;
        return self();
    }

    public T ems(Integer ems) {
        this.ems = ems;
        return self();
    }

    public T gravity(Integer gravity) {
        this.gravity = gravity;
        return self();
    }

    public T height(Integer height) {
        this.height = height;
        return self();
    }

}
