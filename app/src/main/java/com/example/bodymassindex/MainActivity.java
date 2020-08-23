package com.example.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnCalculate;
    EditText edtWeight,edtHeight;
    TextView txtBMI,txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = findViewById(R.id.btnCalculate);
        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        txtBMI = findViewById(R.id.txtBMI);
        txtResult = findViewById(R.id.txtResult);



        btnCalculate.setOnClickListener(new View.OnClickListener() {
            String BMI_Result;

            @Override
            public void onClick(View v) {

                Double weight = Double.parseDouble(edtWeight.getText().toString());
                Double height = Double.parseDouble(edtHeight.getText().toString());

                Double numberBMi = weight / (height * height);


                if (numberBMi < 15) {
                    BMI_Result = "Very severely underweight";
                } else if (numberBMi < 16) {
                    BMI_Result = "Severely underweight";
                } else if (numberBMi < 18.5) {
                    BMI_Result = "Underweight";
                } else if (numberBMi < 25) {
                    BMI_Result = "Normal";
                } else if (numberBMi < 30) {
                    BMI_Result = "Overweight";
                } else if (numberBMi < 35) {
                    BMI_Result = "Obese Class 1 - Moderately Obese";

                } else if (numberBMi < 40) {
                    BMI_Result = "Obese Class 2 - Severely Obese";
                } else {
                    BMI_Result = "Obese Class 3 - Very Severely Obese";
                }

                String BMI=String.valueOf(numberBMi);
                txtBMI.setText(BMI  );
                txtResult.setText(BMI_Result);

            }
        });



    }
}