package com.example.myvideoaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.myvideoaplication.ThirdActivity;

public class ThirdActivity extends AppCompatActivity {
    VideoView v;
    Button b;
    MediaController m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        v =   findViewById(R.id.videoView1);
        m = new MediaController(this);
        v.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video3);
        m.setAnchorView(v);
        v.setMediaController(m);
        v.start();
        b=findViewById(R.id.buttonb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii=new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(ii);
            }
        });

    }
}