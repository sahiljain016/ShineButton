package com.sahil.libraries.shinebutton.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sahil.libraries.shinebutton.sample.R;
import com.sahil.libraries.shinebutton.shinebutton.ShineButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    
    ShineButton shineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shineButton = findViewById(R.id.shine);
        shineButton.setBtnColor(R.color.black);
        shineButton.setBtnFillColor(R.color.purple_500);
        shineButton.setOnClickListener(v -> {
            Log.d(TAG, "onCreate: Button Works!");
        });
    }
}