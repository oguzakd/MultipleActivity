package com.oguzhanakduman.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView  = findViewById(R.id.textViewSecondScreen);
        // Karşılama intenti
        Intent intent = getIntent();
        // Gelen extra aynı key ile bir değere atandı.
        String userInput = intent.getStringExtra("userInput");
        // textview içine alınan değer verildi.
        textView.setText(userInput);

    }

    public void backToFirsScreen(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

}