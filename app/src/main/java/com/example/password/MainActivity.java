package com.example.password;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(View view){
        EditText editText=(EditText) findViewById(R.id.pass);
        TextView textView=(TextView) findViewById(R.id.textView2) ;
        String text = editText.getText().toString();
        textView.setText(text);


    }
}
