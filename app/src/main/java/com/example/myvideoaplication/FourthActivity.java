package com.example.myvideoaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class FourthActivity extends AppCompatActivity {
    VideoView v;

    MediaController m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        v =findViewById(R.id.videoView2);
        m = new MediaController(this);
        v.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video4);
        m.setAnchorView(v);
        v.setMediaController(m);
        v.start();

    }
}