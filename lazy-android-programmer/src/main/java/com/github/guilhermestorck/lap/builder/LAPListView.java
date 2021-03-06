package com.github.guilhermestorck.lap.builder;

import android.widget.ListAdapter;

import com.github.guilhermestorck.lap.util.LAPBindableViewMaker;
import com.github.guilhermestorck.lap.util.LAPViewMaker;

import java.util.List;

/**
 * Created by gstorck on 30/11/2015.
 */
public final class LAPListView<I> extends ALAPListView<LAPListView<I>, I> {

    public LAPListView(ListAdapter adapter) {
        adapter(adapter);
    }

    public LAPListView(List<I> items) {
        adapter(items);
    }

    public LAPListView(List<I> items, LAPViewMaker<I> viewMaker) {
        adapter(items, viewMaker);
    }

    public LAPListView(List<I> items, LAPBindableViewMaker<I> viewMaker) {
        adapter(items, viewMaker);
    }

    @Override
    LAPListView<I> self() {
        return this;
    }
}
