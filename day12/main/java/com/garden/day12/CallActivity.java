package com.garden.day12;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {
    int flag = 0;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar.setIndeterminate(false);
        progressBar.setMax(100);
        int nowProgress = progressBar.getProgress();
        progressBar.setProgress(nowProgress - 10);

        TextView percent = findViewById(R.id.percent);
        percent.setText(progressBar.getProgress() + "%");

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    progressDialog = new ProgressDialog(CallActivity.this);
                    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    progressDialog.setMessage("데이터를 확인 중 입니다..");
                    progressDialog.show();
                    flag = 1;
                } else {
                    progressDialog.dismiss();
                    flag = 0;
                } //if, else
            } //onclick
        });


    }
}
