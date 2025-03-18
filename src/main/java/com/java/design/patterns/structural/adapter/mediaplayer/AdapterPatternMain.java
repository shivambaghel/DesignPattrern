package com.java.design.patterns.structural.adapter.mediaplayer;

/*
Scenario
  Imagine you have a MediaPlayer interface that plays audio files, and a VideoPlayer class that plays video files.
  You want to use the VideoPlayer class to play audio files without modifying its code.
 */

public class AdapterPatternMain {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("audio", "song.mp3");
        audioPlayer.play("video", "movie.mp4");
        audioPlayer.play("audio", "podcast.mp3");
    }
}
