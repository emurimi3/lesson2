package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView Title;
EditText Username;//content set fisrt before initialization
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Title=findViewById(R.id.myTitle);
        Username=findViewById(R.id.input1);
    }

    public void begins(View v){

//Title.setText(Username.getText());
        startActivity(new Intent(this, Main2Activity.class));
        overridePendingTransition(R.anim.entry, R.anim.exit);
    }
}
