package com.cookandroid.aboutme;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button btnStart, btnPause, btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("내가 가장 좋아하는 노래");

        final MediaPlayer mPlayer;
        mPlayer = MediaPlayer.create(this, R.raw.joy);

        final Switch switch1 = (Switch)findViewById(R.id.switch1);

        btnStart = (Button)findViewById(R.id.btnStart);
        btnPause = (Button)findViewById(R.id.btnPause);
        btnReturn = (Button)findViewById(R.id.btnReturn3);

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switch1.isChecked() == true)
                    mPlayer.start();
                else
                    mPlayer.pause();
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.start();
                Toast.makeText(ThirdActivity.this, "Media Play Button", Toast.LENGTH_LONG).show();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.pause();
                Toast.makeText(ThirdActivity.this, "Media Puase Button", Toast.LENGTH_LONG).show();
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
