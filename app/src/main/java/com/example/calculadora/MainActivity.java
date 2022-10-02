package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView titulo = findViewById(R.id.titulo);
        EditText N1 = findViewById(R.id.Num1);
        EditText N2 = findViewById(R.id.Num2);
        EditText res = findViewById(R.id.Resultado);
        Button Bsuma = findViewById(R.id.BotonSuma);

        Bsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int num1 = Integer.parseInt(N1.getText().toString());
               int num2 = Integer.parseInt(N2.getText().toString());

                int resultado = num1 + num2;

             res.setText("El resultado es : "+ resultado);
            }
        });

    }
}