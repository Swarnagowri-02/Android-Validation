package com.example.myapplication_validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnValidate;
    EditText etUname,etPin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnValidate = (Button) findViewById(R.id.btnValidate);
        etUname = (EditText) findViewById(R.id.etUname);
        etPin = (EditText) findViewById(R.id.etPin);

        btnValidate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(etUname.getText().toString().matches("[a-zA-Z]+") && etPin.getText().toString().matches("[0-9]+") && etPin.getText().toString().length()==4)
                    //Toast.makeText(new MainActivity(),"Success",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
                else if (etPin.getText().toString().length()!=4)
                    Toast.makeText(getApplicationContext(),"PIN should be 4characters long",Toast.LENGTH_LONG).show();
                else if (!etUname.getText().toString().matches("[a-zA-Z]+"))
                    Toast.makeText(getApplicationContext(), "Invalid Username(Alphabets only)", Toast.LENGTH_LONG).show();
                else if(!etPin.getText().toString().matches("[0-9]+"))
                    Toast.makeText(getApplicationContext(),"Invalid PIN",Toast.LENGTH_LONG).show();
                else if(etUname.length()==0 && etPin.length()==0)
                    Toast.makeText(getApplicationContext(),"All Fields Required",Toast.LENGTH_LONG).show();
            }
        });



    }
}