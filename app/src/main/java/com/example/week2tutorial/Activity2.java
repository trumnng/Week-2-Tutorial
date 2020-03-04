package com.example.week2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private Button mShowVideoButton;
    private TextView mActivity2Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        mActivity2Message = findViewById(R.id.txvActivity2);
        mActivity2Message.setText(message);

        mShowVideoButton = findViewById(R.id.btnShowVideo);
        mShowVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showVideo("https://www.youtube.com/watch?v=YUmoFWvGL9s");
            }
        });


    }

    private void showVideo(String url) {
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent2);
    }


}
