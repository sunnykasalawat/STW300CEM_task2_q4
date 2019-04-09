package com.e.question4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText make,year,color,price,size;
    private Button create;
    private TextView result;
    private  String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        make=findViewById(R.id.make);
        year=findViewById(R.id.Year);
        color=findViewById(R.id.Color);
        price=findViewById(R.id.price);
        size=findViewById(R.id.size);
        create=findViewById(R.id.create);
        result=findViewById(R.id.finalresult);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            adddata();
            }
        });

    }
       public void adddata(){
        data="Care to make "+make.getText().toString()+"\r\n"
                +"Which year"+year.getText().toString()+"; Color:"+color.getText().toString()+";\r\n"
                +"price:"+price.getText().toString()+"; Engine Size"+size.getText().toString()+";\r\n"+"\r\n";

        result.setText(result.getText().toString()+data);
        }



}
