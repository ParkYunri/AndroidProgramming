package com.cookandroid.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdoGroup;
    RadioButton rdoPic, rdoMusic, rdoNet;
    Button btnShow, btnDiary, btnMyMusic, btnMovie;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("내가 만든 앱");

        rdoGroup = (RadioGroup) findViewById(R.id.rGroup1);
        rdoPic = (RadioButton) findViewById(R.id.rdoPic);
        rdoMusic = (RadioButton) findViewById(R.id.rdoMusic);
        rdoNet = (RadioButton) findViewById(R.id.rdoNet);
        btnShow = (Button) findViewById(R.id.btnShow);
        im = (ImageView) findViewById(R.id.im1);

        btnDiary = (Button)findViewById(R.id.btnDiary);
        btnMyMusic = (Button)findViewById(R.id.btnFavor);
        btnMovie = (Button)findViewById(R.id.btnMovie);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(rdoGroup.getCheckedRadioButtonId()){
                    case R.id.rdoPic:
                        im.setImageResource(R.drawable.picture);
                        break;
                    case R.id.rdoMusic:
                        im.setImageResource(R.drawable.listening);
                        break;
                    case R.id.rdoNet:
                        im.setImageResource(R.drawable.netflix);
                        break;
                }
            }
        });

        btnDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        btnMyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
            }
        });

        btnMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
