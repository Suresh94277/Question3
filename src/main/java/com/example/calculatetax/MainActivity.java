package com.example.calculatetax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView result;
    private EditText salary;
    private Button tax;
    private float salvalue, taxvalue, year;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        result = findViewById(R.id.result);
        salary = findViewById(R.id.salary);
        tax = findViewById(R.id.tax);
        tax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    salvalue = Float.parseFloat(salary.getText().toString());
                    year = salvalue * 12;

                    if (year <= 200000 && year > 1) {
                        taxvalue = (year * 1) / 100;
                        result.setText("" + taxvalue);
                    } else if (year > 200000 && year <= 350000) {

                        taxvalue =(((200000*1)/100) + ((year - 200000)*15/100));


                        result.setText("" +taxvalue);

                    } else if (year > 350000) {
                        taxvalue =(((200000*1)/100) + ((150000)*15/100) + ((year - 350000)*25/100));
                        result.setText("" +taxvalue);
                    }
                }
            }
        });


    }
    }

