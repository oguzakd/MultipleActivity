package com.oguzhanakduman.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String userInput;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.firstScreenEditText);

        userInput = "";
    }

    public void goSecondScreen(View view){
        userInput = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        // EditText ile alınan veriyi diğer activity e gönderme.
        intent.putExtra("userInput",userInput);
        startActivity(intent);
    }
}