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

public class GuideActivity extends Activity implements View.OnClickListener{

    Button btn_return,btn_create_map,btn_local_map,
            btn_add_scene,btn_select_scene,btn_order_setting,
            btn_confirm,btn_cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        initUI();

    }

    public void initUI(){

        btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(this);
        btn_create_map = findViewById(R.id.btn_create_map);
        btn_create_map.setOnClickListener(this);
        btn_local_map = findViewById(R.id.btn_local_map);
        btn_local_map.setOnClickListener(this);
        btn_add_scene = findViewById(R.id.btn_add_scene);
        btn_add_scene.setOnClickListener(this);
        btn_select_scene = findViewById(R.id.btn_select_scene);
        btn_select_scene.setOnClickListener(this);
        btn_order_setting = findViewById(R.id.btn_order_setting);
        btn_order_setting.setOnClickListener(this);
        btn_confirm = findViewById(R.id.btn_confirm);
        btn_confirm.setOnClickListener(this);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_return:
                finish();
                break;

            case R.id.btn_create_map:
                startActivity(new Intent(getApplicationContext(),CreateMapActivity.class));
                break;

            case R.id.btn_local_map:
                startActivity(new Intent(getApplicationContext(),LocalMapActivity.class));
                break;

            case R.id.btn_order_setting:
                startActivity(new Intent(getApplicationContext(),SetOrderActivity.class));
                break;

            case R.id.btn_select_scene:
                startActivity(new Intent(getApplicationContext(),SelectSceneActivity.class));
                break;
        }


    }
}
