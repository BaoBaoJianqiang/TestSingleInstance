package com.jianqiang.weixin;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int price = getIntent().getIntExtra("price", -1);

        setContentView(R.layout.activity_pay);

        TextView tvPrice = (TextView)findViewById(R.id.tvPrice);
        tvPrice.setText(String.valueOf(price));
    }

    public void goto1(View view) {
        Intent intent = new Intent();
        intent.putExtra("result", "这个例子完美做好了");
        setResult(2, intent);
        finish();
    }
}
