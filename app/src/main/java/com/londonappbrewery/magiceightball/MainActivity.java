package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_button= findViewById(R.id.askbutton);
        final ImageView Eight_ball_display= findViewById(R.id.Eight_Ball_image);

        final int [] Ball_images= {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random luck= new Random();
                int number=luck.nextInt(5);
                Eight_ball_display.setImageResource(Ball_images[number]);
            }
        });




    }
}
