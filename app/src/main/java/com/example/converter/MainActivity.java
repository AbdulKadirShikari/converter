package com.example.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
EditText num;
TextView b,o,h,text;
int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=(EditText)findViewById(R.id.intnum);
        b=(TextView)findViewById(R.id.binary);
        o=(TextView)findViewById(R.id.octal);
        h=(TextView)findViewById(R.id.hexadecimal);
        text=(TextView)findViewById(R.id.txt);
        btn=(Button)findViewById(R.id.click);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converter c=new converter();
                 if (num.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "please Insert interger number first", Toast.LENGTH_SHORT).show();
                }else {
                     i=Integer.parseInt(num.getText().toString());

                     if (i >= 0 && i <= 32565) {
                        b.setText(c.binary(i));
                        o.setText(c.octal(i));
                        h.setText(c.Hexa(i));
                        text.setText(""+i);
                        num.setText("");
                    }
                    else {
                        Toast.makeText(MainActivity.this, "No. should be 0 to 32565 ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
