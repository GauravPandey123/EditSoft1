package com.editsoft.player.manager;

import android.content.res.AssetFileDescriptor;
import android.view.View;

import com.editsoft.adapter.visibilityutils.MetaData;
import com.editsoft.ui.VideoPlayerView;


public interface VideoPlayerManager<T extends MetaData> {
    void playNewVideo(T currentItemMetaData, VideoPlayerView videoPlayerView, String videoUrl, View listItemView);
    void playNewVideo(T metaData, VideoPlayerView videoPlayerView, AssetFileDescriptor assetFileDescriptor, View listItemView);
    void stopAnyPlayback();
    void resetMediaPlayer();
}
