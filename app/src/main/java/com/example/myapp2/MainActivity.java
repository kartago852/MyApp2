package com.example.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText)findViewById(R.id.txt_quality);
        et2 = (EditText)findViewById(R.id.txt_price);
        et3 = (EditText)findViewById(R.id.txt_satisfaction);
        tv1 = (TextView)findViewById(R.id.tv_estatus);
    }

    public  void status(View view){
        String Quality_string = et1.getText().toString();
        String Price_string = et2.getText().toString();
        String Satisfaction_string = et3.getText().toString();

        int Quality_int = Integer.parseInt(Quality_string);
        int Price_int = Integer.parseInt(Price_string);
        int Satisfaction_int = Integer.parseInt(Satisfaction_string);

        int promedio = (Quality_int + Price_int + Satisfaction_int) / 3;

        if(promedio >= 6){
            tv1.setText("APROBADO CON " + promedio);
        } else if ( promedio <= 5){
            tv1.setText("REPROBADO CON "+promedio);
        }

    }
}
