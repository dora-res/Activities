package com.example.project1111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.my_text);//нашли элемент на разметке
        text.append("Activity created!\n");
        Toast.makeText(getApplicationContext(), "Activity created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        text.append("Activity started!\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        text.append("Activity resumed!\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        text.append("Activity stoped!\n");
        Toast.makeText(getApplicationContext(), "Activity stoped",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        text.append("Activity destroyed!\n");
        Toast.makeText(getApplicationContext(), "Activity created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {//после destroyed
        super.onRestart();
        text.append("Activity restarted!\n");
    }
}