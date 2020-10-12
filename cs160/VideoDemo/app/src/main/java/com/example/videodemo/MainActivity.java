package com.example.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.electricsweep);
        VideoView video = (VideoView) findViewById(R.id.videoView);
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.skater);
        MediaController controller = new MediaController(this);
        controller.setAnchorView(video);
        video.setMediaController(controller);
        mPlayer.start();
        video.start();

    }
}