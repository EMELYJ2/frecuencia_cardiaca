package com.example.cardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText edad;
private TextView result;
private Button calcular,integran;
int ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      edad = (EditText) findViewById(R.id.edtedad);
      result = (TextView) findViewById(R.id.txtRes);
      calcular = (Button) findViewById(R.id.btnCalcular);
      integran = (Button) findViewById(R.id.btnintegrantes);
      calcular.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              if (edad.getText().toString().equals("")){
                  Toast.makeText(getApplicationContext(),"NO HAS INGRESADO TU EDAD", Toast.LENGTH_LONG).show();
              }
              else {
                  ed = Integer.parseInt(edad.getText().toString());
                  Double ress = 207 - (0.7019864 * ed);
                  result.setText("es de " + Math.round(ress) + " LPM");
                  edad.setText("");
              }
          }
      });
      integran.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent integrantes = new Intent(getApplicationContext(),MainIntegrantes.class);
              startActivity(integrantes);
          }
      });
    }
}