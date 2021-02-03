package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.textView);
        b = (Button) findViewById(R.id.button);
        e = (EditText) findViewById(R.id.editText);
    }
    public void onClickBtn (View view){
        String st = e.getText().toString();
        t.setText("Hello " + st);
    }
}
