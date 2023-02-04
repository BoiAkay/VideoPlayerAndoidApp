package com.example.akaytube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // my code
        VideoView myClip = findViewById(R.id.videoView);
        myClip.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.clip2);
        MediaController mediaController = new MediaController(this);
        myClip.setMediaController(mediaController);
        mediaController.setAnchorView(myClip);
        myClip.setMediaController(mediaController);
        myClip.start();
    }
}