package com.cookandroid.aboutme;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.annotation.Nullable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class SecondActivity extends Activity {
    Button btnSave, btnMain;
    DatePicker dp;
    EditText edtDiary;
    String file;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("내 일기장");

        btnSave = (Button)findViewById(R.id.btnSave);
        dp = (DatePicker)findViewById(R.id.dtPicker1);
        edtDiary = (EditText)findViewById(R.id.edtDiary);
        btnMain = (Button)findViewById(R.id.btnBack);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH);
        int cDay = cal.get(Calendar.DAY_OF_MONTH);

        dp.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            public void onDateChanged(DatePicker view, int year,
                                      int monthOfYear, int dayOfMonth) {
                file = Integer.toString(year) + "_"
                        + Integer.toString(monthOfYear + 1) + "_"
                        + Integer.toString(dayOfMonth) + ".txt";
                String str = readDiary(file);
                edtDiary.setText(str);
                btnSave.setEnabled(true);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream out = openFileOutput(file, Context.MODE_PRIVATE);
                    String str = edtDiary.getText().toString();
                    out.write(str.getBytes());
                    out.close();
                } catch(IOException i){
                }
            }
        });
    }

    String readDiary(String file){
        String diaryStr = null;
        FileInputStream in;
        try{
            in =  openFileInput(file);
            byte[] txt = new byte[500];
            in.read(txt);
            in.close();
            diaryStr = (new String(txt)).trim();
            btnSave.setText("수정함");
        } catch(IOException ie){
            edtDiary.setHint("일기 없음");
            btnSave.setText("새로 저장하기");
        }
        return diaryStr;
    }
}

