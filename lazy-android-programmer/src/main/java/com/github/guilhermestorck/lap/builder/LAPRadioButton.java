package com.github.guilhermestorck.lap.builder;

/**
 * Created by gstorck on 17/12/2015.
 */
public final class LAPRadioButton extends ALAPCompoundButton<LAPRadioButton> {

    public LAPRadioButton(CharSequence label) {
        this(label, false);
    }

    public LAPRadioButton(CharSequence label, Boolean checked) {
        text(label);
        checked(checked);
    }

    public LAPRadioButton(Integer labelRes) {
        this(labelRes, false);
    }

    public LAPRadioButton(Integer labelRes, Boolean checked) {
        textRes(labelRes);
        checked(checked);
    }

    @Override
    LAPRadioButton self() {
        return this;
    }

}
