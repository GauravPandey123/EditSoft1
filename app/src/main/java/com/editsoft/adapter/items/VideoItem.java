package com.editsoft.adapter.items;

import android.view.View;
import android.view.ViewGroup;

import com.editsoft.adapter.holder.VideoViewHolder;
import com.editsoft.player.manager.VideoPlayerManager;


public interface VideoItem extends ListItem{
    View createView(ViewGroup parent, int screenWidth);
    void update(int position, VideoViewHolder view, VideoPlayerManager videoPlayerManager);
}
