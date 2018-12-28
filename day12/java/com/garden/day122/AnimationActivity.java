package com.garden.day122;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AnimationActivity extends AppCompatActivity {
    TextView textView;
    Animation flowAnim, flowAnim2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        textView = findViewById(R.id.textView);
        flowAnim = AnimationUtils.loadAnimation(this, R.anim.flow);

        imageView = findViewById(R.id.imageView);
        flowAnim2 = AnimationUtils.loadAnimation(this,R.anim.flow2);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.startAnimation(flowAnim);
            }
        });
        Button button2 = findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(flowAnim2);
            }
        });

        flowAnim2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(getApplicationContext(), "애니메이션 시작.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(), "애니메이션 끝.", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Toast.makeText(getApplicationContext(), "애니메이션 반복중입니다..", Toast.LENGTH_LONG).show();
            }
        });
    }
}
