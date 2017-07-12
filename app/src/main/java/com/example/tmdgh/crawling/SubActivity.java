package com.example.tmdgh.crawling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
    public void playAudio(View view) {
        Intent objIntent = new Intent(this, PlayAudio.class);
        startService(objIntent);
    }
    public void stopAudio(View view) {
        Intent objIntent = new Intent(this, PlayAudio.class);
        stopService(objIntent);
    }
}
