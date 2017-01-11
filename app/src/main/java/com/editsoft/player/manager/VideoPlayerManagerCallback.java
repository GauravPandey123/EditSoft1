package com.editsoft.player.manager;


import com.editsoft.adapter.interfaces.SetViewCallback;
import com.editsoft.ui.VideoPlayerView;

public interface VideoPlayerManagerCallback extends SetViewCallback<VideoPlayerView> {

    void setVideoPlayerState(VideoPlayerView videoPlayerView, PlayerMessageState playerMessageState);

    PlayerMessageState getCurrentPlayerState();
}
