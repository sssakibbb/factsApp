package com.example.factsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView factText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factText = findViewById(R.id.text);

        factText.setTextSize(20.0F);

        fact Fact = new fact();
        String[] myFact = Fact.getFacts();

        for (String fact : myFact){
            factText.append(fact + "\n");
        }

    }
}