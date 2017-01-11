package com.editsoft.adapter.visibilityutils;

public class CurrentItemMetaData implements MetaData {
    public final int indexOfCurrentItem;

    public CurrentItemMetaData(int indexOfCurrentItem) {
        this.indexOfCurrentItem = indexOfCurrentItem;
    }

    @Override
    public String toString() {
        return "CurrentItemMetaData{" +
                "indexOfCurrentItem=" + indexOfCurrentItem +
                '}';
    }
}
