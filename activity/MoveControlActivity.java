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

public class MoveControlActivity extends Activity implements View.OnClickListener{

    Button btn_return,btn_guide_start,btn_guide_stop,
            btn_welcome_start,btn_welcome_stop,btn_tour_start,
            btn_tour_stop,btn_charge,btn_start;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_control);

        initUI();
    }

    public void initUI(){
        btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(this);
        btn_guide_start = findViewById(R.id.btn_guide_start);
        btn_guide_start.setOnClickListener(this);
        btn_guide_stop = findViewById(R.id.btn_guide_stop);
        btn_guide_stop.setOnClickListener(this);
        btn_welcome_start = findViewById(R.id.btn_welcome_start);
        btn_welcome_start.setOnClickListener(this);
        btn_welcome_stop = findViewById(R.id.btn_welcome_stop);
        btn_welcome_stop.setOnClickListener(this);
        btn_tour_start = findViewById(R.id.btn_tour_start);
        btn_tour_start.setOnClickListener(this);
        btn_tour_stop = findViewById(R.id.btn_tour_stop);
        btn_tour_stop.setOnClickListener(this);
        btn_charge = findViewById(R.id.btn_charge);
        btn_charge.setOnClickListener(this);
        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_guide_start:
                startActivity(new Intent(getApplicationContext(),StartGuideActivity.class));
                break;
            case R.id.btn_return:
                finish();
                break;
        }
    }
}
