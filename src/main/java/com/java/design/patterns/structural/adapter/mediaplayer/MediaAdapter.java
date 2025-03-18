package com.java.design.patterns.structural.adapter.mediaplayer;

public class MediaAdapter implements MediaPlayer{
    VideoPlayer videoPlayer;

    public MediaAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}
