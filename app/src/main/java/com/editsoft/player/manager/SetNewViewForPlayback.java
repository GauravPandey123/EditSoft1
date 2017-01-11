package com.editsoft.player.manager;

import android.view.View;

import com.editsoft.adapter.visibilityutils.CurrentItemMetaData;
import com.editsoft.ui.VideoPlayerView;


public class SetNewViewForPlayback extends PlayerMessage {

    private final CurrentItemMetaData mCurrentItemMetaData;
    private final VideoPlayerView mCurrentPlayer;
    private final View mListItemView;
    private final VideoPlayerManagerCallback mCallback;

    public SetNewViewForPlayback(CurrentItemMetaData currentItemMetaData, VideoPlayerView videoPlayerView, View listItemView, VideoPlayerManagerCallback callback) {
        super(videoPlayerView, callback);
        mCurrentItemMetaData = currentItemMetaData;
        mCurrentPlayer = videoPlayerView;
        mListItemView = listItemView;
        mCallback = callback;
    }

    @Override
    public String toString() {
        return SetNewViewForPlayback.class.getSimpleName() + ", mCurrentPlayer " + mCurrentPlayer;
    }

    @Override
    protected void performAction(VideoPlayerView currentPlayer) {
        mCallback.setCurrentItem(mCurrentItemMetaData, mCurrentPlayer, mListItemView);
    }

    @Override
    protected PlayerMessageState stateBefore() {
        return PlayerMessageState.SETTING_NEW_PLAYER;
    }

    @Override
    protected PlayerMessageState stateAfter() {
        return PlayerMessageState.IDLE;
    }
}
