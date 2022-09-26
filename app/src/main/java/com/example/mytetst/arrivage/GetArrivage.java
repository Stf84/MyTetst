package com.example.mytetst.arrivage;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mytetst.R;

public class GetArrivage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrivage);
        ProgressBar progressBar = findViewById(R.id.progressBar2);

        Handler handler = new Handler();
        progressBar.setMax(100);
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                final int currentProgressCount = i;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //Update the value background thread to UI thread
                handler.post(() -> progressBar.setProgress(currentProgressCount));
            }
        }).start();
    }


    }


