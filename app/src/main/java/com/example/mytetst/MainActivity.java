package com.example.mytetst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.mytetst.arrivage.GetArrivage;

import java.io.File;
import java.net.URI;

public class MainActivity extends AppCompatActivity {
    @SuppressWarnings("FieldCanBeLocal")
     int RIGHTS  ;
     LinearLayout arr;
     LinearLayout mouv;
     LinearLayout tri;
     Button arrivage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         arr = findViewById(R.id.line1);
         arrivage = findViewById(R.id.arrivage);
         mouv = findViewById(R.id.line2);
         tri = findViewById(R.id.line3);

        GetStatut(RIGHTS);


    }

    private void GetStatut(int statut){

        switch (statut){
            case 1 :

                break;
            case 2 :
                mouv.setVisibility(View.GONE);
                tri.setVisibility(View.GONE);
                arrivage.setOnClickListener(v -> {
                    Intent i = new Intent(getApplication(), GetArrivage.class);
                    startActivity(i);

                });

                break;

            default:

                break;

        }


    }
}