package com.cookandroid.korconversationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConvActivity extends AppCompatActivity {

    ImageButton back,speaker,restart,grade,check;
    Button repeat;
    TextView eng,kor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conv);
        back=(ImageButton)findViewById(R.id.backbtn);
        speaker=(ImageButton)findViewById(R.id.btn_speak);
        restart=(ImageButton)findViewById(R.id.btn_restart);
        grade=(ImageButton)findViewById(R.id.btn_grade);
        check=(ImageButton)findViewById(R.id.btn_check);
        repeat=(Button)findViewById(R.id.btn_repeat);

        eng=(TextView)findViewById(R.id.eng);
        kor=(TextView)findViewById(R.id.kor);

        Intent intent=new Intent(this.getIntent());
        String str_eng=intent.getStringExtra("eng");
        String str_kor=intent.getStringExtra("kor");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        eng.setText(str_eng);
        kor.setText(str_kor);
        }
}
