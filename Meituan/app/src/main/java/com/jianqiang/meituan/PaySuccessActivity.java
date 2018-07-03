package com.jianqiang.meituan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PaySuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_success);

        String result = getIntent().getStringExtra("result");

        TextView tvResult = (TextView)findViewById(R.id.tvResult);
        tvResult.setText(result);
    }
}
