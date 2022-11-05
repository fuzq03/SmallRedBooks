package com.example.smallredbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class StartActivity extends AppCompatActivity {

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            Intent intent =new Intent(StartActivity.this, HomePageActivity.class);
            startActivity(intent);
            finish();
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        handler.sendEmptyMessageDelayed(0,1500);

    }
}