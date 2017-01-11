package com.editsoft.adapter.interfaces;

import android.view.View;

import com.editsoft.adapter.visibilityutils.CurrentItemMetaData;


public interface SetViewCallback<T extends View> {
    void setCurrentItem(CurrentItemMetaData currentItemMetaData, T view, View listItemView);
}
