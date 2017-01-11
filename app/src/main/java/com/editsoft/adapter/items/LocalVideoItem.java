package com.editsoft.adapter.items;

import android.content.res.AssetFileDescriptor;
import android.view.View;

import com.editsoft.adapter.holder.VideoViewHolder;
import com.editsoft.adapter.visibilityutils.CurrentItemMetaData;
import com.editsoft.player.manager.VideoPlayerManager;
import com.editsoft.ui.VideoPlayerView;
import com.squareup.picasso.Picasso;

public class LocalVideoItem extends BaseVideoItem{

    private final AssetFileDescriptor mAssetFileDescriptor;
    private final String mTitle;

    private final Picasso mImageLoader;
    private final int mImageResource;

    public LocalVideoItem(String title, AssetFileDescriptor assetFileDescriptor, VideoPlayerManager videoPlayerManager, Picasso imageLoader, int imageResource) {
        super(videoPlayerManager);
        mTitle = title;
        mAssetFileDescriptor = assetFileDescriptor;
        mImageLoader = imageLoader;
        mImageResource = imageResource;
    }

    @Override
    public void update(int position, final VideoViewHolder viewHolder, VideoPlayerManager videoPlayerManager) {
        viewHolder.mTitle.setText(mTitle);
        viewHolder.mCover.setVisibility(View.VISIBLE);
        mImageLoader.load(mImageResource).into(viewHolder.mCover);
    }


    @Override
    protected void playNewVideo(CurrentItemMetaData currentItemMetaData, VideoPlayerView player, VideoPlayerManager<CurrentItemMetaData> videoPlayerManager, View view) {
        videoPlayerManager.playNewVideo(currentItemMetaData, player, mAssetFileDescriptor, view);
    }

    @Override
    protected void stopPlayback(VideoPlayerManager videoPlayerManager) {
        videoPlayerManager.stopAnyPlayback();
    }

    @Override
    public String toString() {
        return getClass() + ", mTitle[" + mTitle + "]";
    }
}
