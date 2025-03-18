package com.java.design.patterns.structural.adapter.mediaplayer;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("audio")) {
            System.out.println("Playing audio: " + fileName);
        } else if (audioType.equalsIgnoreCase("video")) {
            mediaAdapter = new MediaAdapter(new VideoPlayer());
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}
