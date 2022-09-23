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
     int RIGHTS = 2 ;
     LinearLayout arr;
     LinearLayout mouv;
     Button arrivage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         arr = findViewById(R.id.line1);
         arrivage = findViewById(R.id.arrivage);
         mouv = findViewById(R.id.line2);

        GetStatut(RIGHTS);


    }

    private void GetStatut(int statut){

        switch (statut){
            case 1 :

                break;
            case 2 :
                mouv.setVisibility(View.GONE);
                arrivage.setOnClickListener(v -> {
                    Intent i = new Intent(getApplication(), GetArrivage.class);
                    startActivity(i);

                });

                break;

        }


    }
}