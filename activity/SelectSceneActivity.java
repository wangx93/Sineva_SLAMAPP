package com.sineva.slam.com.sineva.slam.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.sineva.slam.R;

/**
 * Created by wangxin on 2017/7/27.
 */

public class SelectSceneActivity extends Activity {

    Button btn_return,btn_confirm,btn_cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_scene);

        initUI();
        initData();
    }

    public void initData(){
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void initUI(){
        btn_return = findViewById(R.id.btn_return);
        btn_confirm = findViewById(R.id.btn_confirm);
        btn_cancel = findViewById(R.id.btn_cancel);
    }
}
