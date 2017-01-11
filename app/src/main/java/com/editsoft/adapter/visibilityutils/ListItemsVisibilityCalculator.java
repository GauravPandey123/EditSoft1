package com.editsoft.adapter.visibilityutils;

import android.view.View;

import com.editsoft.adapter.interfaces.SetViewCallback;


public interface ListItemsVisibilityCalculator extends SetViewCallback<View> {
    void onScrollStateIdle(ItemsPositionGetter itemsPositionGetter, int firstVisiblePosition, int lastVisiblePosition);
    void onScroll(ItemsPositionGetter itemsPositionGetter, int firstVisibleItem, int visibleItemCount, int scrollState);
}
