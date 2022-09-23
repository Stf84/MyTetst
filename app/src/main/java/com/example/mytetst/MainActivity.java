package com.example.mytetst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private  static int RIGHTS = 0 ;
    private LinearLayout arr;
    private LinearLayout mouv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         arr = findViewById(R.id.line1);
         mouv = findViewById(R.id.line2);

        GetStatut(RIGHTS);

    }

    private void GetStatut(int statut){

        switch (statut){
            case 1 :

                break;
            case 2 :
                mouv.setVisibility(View.GONE);

                break;

        }


    }
}