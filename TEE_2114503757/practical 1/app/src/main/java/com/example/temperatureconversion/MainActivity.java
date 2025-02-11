package com.example.temperatureconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainActivity1 {

    private EditText fahrenheitInput;
    private Button convertButton;
    private TextView celsiusOutput;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahrenheitInput = findViewById(R.id.fahrenheit_input);
        convertButton = findViewById(R.id.convert_button);
        celsiusOutput = findViewById(R.id.celsius_output);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahrenheitString = fahrenheitInput.getText().toString();
                double fahrenheit = Double.parseDouble(fahrenheitString);
                double celsius = (fahrenheit - 32) * 5.0/9.0;
                String celsiusString = String.format("%.2f", celsius);
                celsiusOutput.setText("Temperature in Celsius: " + celsiusString);
            }
        });
    }
}