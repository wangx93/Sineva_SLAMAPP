package com.sineva.slam.com.sineva.slam.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.sineva.slam.R;

/**
 * Created by wangxin on 2017/7/27.
 */

public class BasicSettingActivity extends Activity implements View.OnClickListener{

    Button btn_return,btn_slam,btn_voice,btn_head_setting,
            btn_about_us,btn_confirm,btn_cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_setting);

        initUI();
    }

    public void initUI(){
        btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(this);
        btn_slam = findViewById(R.id.btn_slam);
        btn_slam.setOnClickListener(this);
        btn_voice = findViewById(R.id.btn_voice);
        btn_voice.setOnClickListener(this);
        btn_head_setting = findViewById(R.id.btn_head_setting);
        btn_head_setting.setOnClickListener(this);
        btn_about_us = findViewById(R.id.btn_about_us);
        btn_about_us.setOnClickListener(this);
        btn_confirm = findViewById(R.id.btn_confirm);
        btn_confirm.setOnClickListener(this);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_slam:
                startActivity(new Intent(getApplicationContext(),SlamActivity.class));
                break;

            case R.id.btn_voice:
                startActivity(new Intent(getApplicationContext(),VoiceRecognizeActivity.class));
                break;

            case R.id.btn_about_us:
                startActivity(new Intent(getApplicationContext(),AboutUsActivity.class));
                break;

            case R.id.btn_head_setting:
                startActivity(new Intent(getApplicationContext(),HeadSettingActivity.class));
                break;

            case R.id.btn_return:
                finish();
                break;
        }
    }
}
