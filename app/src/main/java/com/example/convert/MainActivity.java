package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button milesToKm =  (Button) findViewById(R.id.MTK);
        milesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Miles = (EditText) findViewById(R.id.miles);
                EditText Km = (EditText) findViewById(R.id.km);
                double vmiles = Double.valueOf(Miles.getText().toString());
                double vkm = vmiles / 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                Km.setText(formatval.format(vkm));
            }

        });
        Button ktm =  (Button) findViewById(R.id.KTM);
        ktm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                EditText Miles = (EditText) findViewById(R.id.miles);
                EditText Km = (EditText) findViewById(R.id.km);
                double vKm = Double.valueOf(Km.getText().toString());
                double vmiles = vKm * 0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                Miles.setText(formatval.format(vmiles));
            }
        });
        Button Reset = (Button) findViewById(R.id.rst);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText Km = (EditText) findViewById(R.id.km);
                EditText Miles = (EditText) findViewById(R.id.miles);
                Miles.setText("");
                Km.setText("");
            }
        });
    }
}