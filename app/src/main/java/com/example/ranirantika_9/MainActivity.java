package com.example.ranirantika_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jadwal(View view) {
        Intent jadwal = new Intent( MainActivity.this, MainActivity2.class);
        startActivity(jadwal);
    }
}