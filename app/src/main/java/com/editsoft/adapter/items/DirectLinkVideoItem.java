package com.editsoft.adapter.items;

import android.view.View;

import com.editsoft.adapter.holder.VideoViewHolder;
import com.editsoft.adapter.visibilityutils.CurrentItemMetaData;
import com.editsoft.player.manager.VideoPlayerManager;
import com.editsoft.ui.VideoPlayerView;
import com.squareup.picasso.Picasso;


public class DirectLinkVideoItem extends BaseVideoItem {

    private final String mDirectUrl;
    private final String mTitle;

    private final Picasso mImageLoader;
    private final int mImageResource;

    public DirectLinkVideoItem(String title, String directUr, VideoPlayerManager videoPlayerManager, Picasso imageLoader, int imageResource) {
        super(videoPlayerManager);
        mDirectUrl = directUr;
        mTitle = title;
        mImageLoader = imageLoader;
        mImageResource = imageResource;

    }

    @Override
    public void update(int position, VideoViewHolder viewHolder, VideoPlayerManager videoPlayerManager) {
        viewHolder.mTitle.setText(mTitle);
        viewHolder.mCover.setVisibility(View.VISIBLE);
        mImageLoader.load(mImageResource).into(viewHolder.mCover);
    }

    @Override
    protected void playNewVideo(CurrentItemMetaData currentItemMetaData, VideoPlayerView player, VideoPlayerManager videoPlayerManager, View view) {
        videoPlayerManager.playNewVideo(currentItemMetaData, player, mDirectUrl, view);
    }

    @Override
    protected void stopPlayback(VideoPlayerManager videoPlayerManager) {
        videoPlayerManager.stopAnyPlayback();
    }
}
