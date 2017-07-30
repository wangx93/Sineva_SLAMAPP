package com.sineva.slam.com.sineva.slam.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sineva.slam.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_guide,btn_answer,btn_welcome,btn_basic,btn_move,btn_talk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        initData();
    }

    public void initData(){

    }

    public void initUI(){
        btn_guide = (Button) findViewById(R.id.btn_guide);
        btn_guide.setOnClickListener(this);
        btn_answer = (Button)findViewById(R.id.btn_answer);
        btn_answer.setOnClickListener(this);
        btn_welcome = (Button)findViewById(R.id.btn_welcome);
        btn_welcome.setOnClickListener(this);
        btn_basic = (Button)findViewById(R.id.btn_basic);
        btn_basic.setOnClickListener(this);
        btn_move = (Button)findViewById(R.id.btn_move);
        btn_move.setOnClickListener(this);
        btn_talk = (Button)findViewById(R.id.btn_talk);
        btn_talk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn_guide:
                startActivity(new Intent(getApplicationContext(),GuideActivity.class));
                break;

            case R.id.btn_answer:
                startActivity(new Intent(getApplicationContext(),QuestionActivity.class));
                break;

            case R.id.btn_welcome:
                startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
                break;

            case R.id.btn_basic:
                startActivity(new Intent(getApplicationContext(),BasicSettingActivity.class));
                break;

            case R.id.btn_move:
                startActivity(new Intent(getApplicationContext(),MoveControlActivity.class));
                break;
        }

    }
}
