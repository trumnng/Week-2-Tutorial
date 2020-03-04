package com.example.week2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.message";
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.btnAct2);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity2("Hello from Activity 2");
            }
        });
    }

    private void launchActivity2(String message) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
