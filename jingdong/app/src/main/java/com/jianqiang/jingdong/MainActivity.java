package com.jianqiang.jingdong;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pay(View view) {
        ComponentName componentName = new ComponentName(
                "com.jianqiang.weixin",
                "com.jianqiang.weixin.PayActivity");
        Intent intent = new Intent();
        intent.putExtra("price", 23);
        intent.setComponent(componentName);
        startActivityForResult(intent, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 2) {
            Intent intent = new Intent(this, PaySuccessActivity.class);
            intent.putExtra("result", data.getStringExtra("result"));
            startActivity(intent);
        }
    }
}
