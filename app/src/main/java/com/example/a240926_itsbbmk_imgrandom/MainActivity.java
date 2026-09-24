package com.example.a240926_itsbbmk_imgrandom;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btjugar;
    ImageView mg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btjugar = findViewById(R.id.bt1);
        btjugar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String srt = ((Button)v).getText().toString();
        if(srt.equals("Jugar")){
            Clasesita object = new Clasesita();
            int rango = object.code();
            if(rango == 1){
                mg.setImageResource(R.drawable.cara);
            } else {
                mg.setImageResource(R.drawable.cruz);
            }
        }
    }
}