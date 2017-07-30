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

public class SetOrderActivity extends Activity implements View.OnClickListener{

    Button btn_return,btn_charge,btn_position,
            btn_scene_select,btn_confirm,btn_cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_tour_order);

        initUI();
        initData();
    }

    public void initData(){

    }

    public void initUI(){
        btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(this);
        btn_charge = findViewById(R.id.btn_charge);
        btn_charge.setOnClickListener(this);
        btn_position = findViewById(R.id.btn_position);
        btn_position.setOnClickListener(this);
        btn_scene_select = findViewById(R.id.btn_scene_select);
        btn_scene_select.setOnClickListener(this);
        btn_confirm = findViewById(R.id.btn_confirm);
        btn_confirm.setOnClickListener(this);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.btn_return:
                finish();
                break;

            case R.id.btn_scene_select:
                startActivity(new Intent(getApplicationContext(),SelectSceneActivity.class));
                break;
        }
    }
}
