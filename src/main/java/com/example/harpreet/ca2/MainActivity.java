package com.example.harpreet.ca2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button;
        button = (Button)findViewById(R.id.buttonOK);

        final Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        final Animation scale= AnimationUtils.loadAnimation(this,R.anim.scale);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.startAnimation(rotate);
                button.startAnimation(scale);
            }
        });

    }
}
