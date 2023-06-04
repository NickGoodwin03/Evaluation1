package com.example.evaluation1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    final String TAG = "demo";
    double area;
    double height;
    double base;

    EditText baseText;
    EditText heightText;
    TextView areaTextView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonCalculate).setOnClickListener(this);
        findViewById(R.id.buttonReset).setOnClickListener(this);

        baseText = findViewById(R.id.editTextNumberBase);
        heightText = findViewById(R.id.editTextNumberHeight);
        areaTextView = findViewById(R.id.textViewArea);


    }

    @Override
    public void onClick(View v) {
        String temp;
        if(v.getId() == R.id.buttonCalculate) {
            try{
                temp = baseText.getText().toString();
                base = Double.parseDouble(temp);
                temp = heightText.getText().toString();
                height = Double.parseDouble(temp);
                area = (base * height)/2;
                areaTextView.setText("= " + String.format("%.2f",area));
            } catch(Exception e){
                Toast.makeText(this, "Please enter numbers into the base and height", Toast.LENGTH_LONG).show();
            }




        }
        else if(v.getId() == R.id.buttonReset){
            baseText.setText("");
            heightText.setText("");
            areaTextView.setText("= N/A");
        }
    }
}