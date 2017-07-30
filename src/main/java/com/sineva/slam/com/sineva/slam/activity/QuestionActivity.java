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

public class QuestionActivity extends Activity implements View.OnClickListener{

    Button btn_return,btn_add,btn_edit,btn_confirm,btn_cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        initUI();
    }

    public void initUI(){
        btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(this);
        btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        btn_edit = findViewById(R.id.btn_edit);
        btn_edit.setOnClickListener(this);
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

        }
    }
}
