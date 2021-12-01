package com.example.mycat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view) {
        TextView Hello = findViewById(R.id.textView);
        Hello.setText("Hello, Kitty!");

    }
    public void onCount(View view) {
        TextView Hello = findViewById(R.id.textView);
        ++mCount;
        if (mCount == 1) {
            Hello.setText("Найдена " + mCount + " ворона :)");
        }
        if (mCount >= 2 && mCount <= 4) {
            Hello.setText("Найдено " + mCount + " вороны :)");
        }
        if (mCount > 4) {
            Hello.setText("Найдено " + mCount + " ворон :)");
        }
    }
    public void onReset(View view) {
        mCount = 0;
        TextView Hello = findViewById(R.id.textView);
        Hello.setText("Счётчик ворон сброшен!");
    }

}