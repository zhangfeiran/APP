package com.bignewsmaker.makebignews.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bignewsmaker.makebignews.basic_class.ConstData;
import com.bignewsmaker.makebignews.R;
import com.bignewsmaker.makebignews.extra_class.Speaker;

/**
 * Created by liminyan on 06/09/2017.
 * 设置界面
 */

public class SetActivity extends AppCompatActivity {

    private ConstData const_data = ConstData.getInstance();// 设置访问全局变量接口
    private Speaker speaker = Speaker.getInstance();// 设置语音系统接口

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        //设置输入监控
        //设置更新函数

    }
}