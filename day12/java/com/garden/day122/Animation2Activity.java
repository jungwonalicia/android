package com.garden.day122;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Animation2Activity extends AppCompatActivity {

    Animation leftAni, rightAni, shakeAni, transAni;
    Button left, right, shake, trans;
    ImageView move2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        trans = findViewById(R.id.trans);
        shake = findViewById(R.id.shake);

        leftAni = AnimationUtils.loadAnimation(this, R.anim.left);
        rightAni = AnimationUtils.loadAnimation(this, R.anim.right);
        transAni = AnimationUtils.loadAnimation(this, R.anim.trans);
        shakeAni = AnimationUtils.loadAnimation(this, R.anim.shake);

        move2 = findViewById(R.id.move2);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move2.startAnimation(rightAni);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move2.startAnimation(leftAni);
            }
        });

        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move2.startAnimation(transAni);
            }
        });

        shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move2.startAnimation(shakeAni);
            }
        });

        shakeAni.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(getApplicationContext(), "흔들기가 시작되었습니다.", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(), "흔들기가 종료되었습니다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
