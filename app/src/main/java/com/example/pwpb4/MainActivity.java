package com.example.pwpb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private EditText jumlah;
    private Button btnhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan_1);
        initUi();
        iniEvent();
    }

    private void initUi() {
        bil1 = (EditText) findViewById(R.id.Firstnumber);
        bil2 = (EditText) findViewById(R.id.Secondnumber);
        jumlah = (EditText) findViewById(R.id.Hasilnya);
        btnhasil = (Button) findViewById(R.id.tombol);
    }

    private void hitungjumlah() {
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil1.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total + "");
    }

    private void iniEvent() {
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungjumlah();

            }
        });
    }
}
