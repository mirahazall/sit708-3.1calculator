package com.example.simplecalculator;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText firstValue = findViewById(R.id.editTextFirstValue);
        EditText secondValue = findViewById(R.id.editTextSecondValue);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button addButton = findViewById(R.id.addButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        subtractButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               int first = Integer.parseInt(firstValue.getText().toString());
               int second = Integer.parseInt(secondValue.getText().toString());
               int result = first - second;
               resultTextView.setText(String.valueOf(result));

                // Clear EditText fields
                firstValue.setText("");
                secondValue.setText("");
            }
        });

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int first = Integer.parseInt(firstValue.getText().toString());
                int second = Integer.parseInt(secondValue.getText().toString());
                int result = first + second;
                resultTextView.setText(String.valueOf(result));

                // Clear EditText fields
                firstValue.setText("");
                secondValue.setText("");
            }
        });

    }
}