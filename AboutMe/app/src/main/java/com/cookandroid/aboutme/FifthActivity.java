package com.cookandroid.aboutme;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FifthActivity extends Activity {
    Button btnReturn, btnStart1, btnStart2, btnStart3, btnStart4, btnStart5, btnStart6, btnStart7, btnStart8, btnStart9, btnStart10,
        btnStop1,btnStop2,btnStop3,btnStop4,btnStop5, btnStop6, btnStop7, btnStop8, btnStop9, btnStop10;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);
        setTitle("영화별 OST 플레이어");

        final MediaPlayer aPlayer, bPlayer, cPlayer, dPlayer, ePlayer, fPlayer, gPlayer,
                hPlayer, iPlayer, jPlayer;
        aPlayer = MediaPlayer.create(this, R.raw.zenzenzense);
        bPlayer = MediaPlayer.create(this, R.raw.loststars);
        cPlayer = MediaPlayer.create(this, R.raw.paris);
        dPlayer = MediaPlayer.create(this, R.raw.nottinghill);
        ePlayer = MediaPlayer.create(this, R.raw.titanic);
        fPlayer = MediaPlayer.create(this, R.raw.lalaland);
        gPlayer = MediaPlayer.create(this, R.raw.harrypotter);
        hPlayer = MediaPlayer.create(this, R.raw.christmas);
        iPlayer = MediaPlayer.create(this, R.raw.twilight);
        jPlayer = MediaPlayer.create(this, R.raw.toystory);

        final Switch switch1 = (Switch) findViewById(R.id.switch2);

        btnStart1 = (Button)findViewById(R.id.btnStart1);
        btnStop1 = (Button)findViewById(R.id.btnStop1);
        btnStart2 = (Button)findViewById(R.id.btnStart2);
        btnStop2 = (Button)findViewById(R.id.btnStop2);
        btnStart3 = (Button)findViewById(R.id.btnStart13);
        btnStop3 = (Button)findViewById(R.id.btnStop3);
        btnStart4 = (Button)findViewById(R.id.btnStart4);
        btnStop4 = (Button)findViewById(R.id.btnStop4);
        btnStart5 = (Button)findViewById(R.id.btnStart5);
        btnStop5 = (Button)findViewById(R.id.btnStop5);
        btnStart6 = (Button)findViewById(R.id.btnStart6);
        btnStop6 = (Button)findViewById(R.id.btnStop6);
        btnStart7 = (Button)findViewById(R.id.btnStart7);
        btnStop7 = (Button)findViewById(R.id.btnStop7);
        btnStart8 = (Button)findViewById(R.id.btnStart8);
        btnStop8 = (Button)findViewById(R.id.btnStop8);
        btnStart9 = (Button)findViewById(R.id.btnStart9);
        btnStop9 = (Button)findViewById(R.id.btnStop9);
        btnStart10 = (Button)findViewById(R.id.btnStart10);
        btnStop10 = (Button)findViewById(R.id.btnStop10);

        btnReturn = (Button)findViewById(R.id.btnReturn2);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switch1.isChecked()==true)
                    aPlayer.start();
                else
                    aPlayer.pause();
            }
        });

        btnStart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aPlayer.start();
                Toast.makeText(FifthActivity.this, "너의이름은 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bPlayer.start();
                Toast.makeText(FifthActivity.this, "비긴어게인 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cPlayer.start();
                Toast.makeText(FifthActivity.this, "미드나잇인파리 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dPlayer.start();
                Toast.makeText(FifthActivity.this, "노팅힐 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ePlayer.start();
                Toast.makeText(FifthActivity.this, "타이타닉 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fPlayer.start();
                Toast.makeText(FifthActivity.this, "라라랜드 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gPlayer.start();
                Toast.makeText(FifthActivity.this, "해리포터 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hPlayer.start();
                Toast.makeText(FifthActivity.this, "나홀로집에 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iPlayer.start();
                Toast.makeText(FifthActivity.this, "트와일라잇 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStart10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jPlayer.start();
                Toast.makeText(FifthActivity.this, "토이스토리4 ost play :')", Toast.LENGTH_SHORT).show();
            }
        });

        btnStop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aPlayer.pause();
            }
        });

        btnStop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bPlayer.pause();
            }
        });

        btnStop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cPlayer.pause();
            }
        });

        btnStop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dPlayer.pause();
            }
        });

        btnStop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ePlayer.pause();
            }
        });

        btnStop6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fPlayer.pause();
            }
        });

        btnStop7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gPlayer.pause();
            }
        });

        btnStop8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hPlayer.pause();
            }
        });

        btnStop9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iPlayer.pause();
            }
        });

        btnStop10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jPlayer.pause();
            }
        });
    }
}
