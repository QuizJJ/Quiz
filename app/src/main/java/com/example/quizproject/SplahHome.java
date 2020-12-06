package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.transition.Fade;
import android.view.Window;
import android.view.WindowManager;

public class

SplahHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
            getWindow().setExitTransition(new Fade());
        }

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splah_home);


        new Handler(Looper.myLooper())
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent = new Intent(SplahHome.this, AcitivtyCAdastro.class);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            // Aplicar tema
                            getWindow().setExitTransition(new Fade());
                            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(SplahHome.this).toBundle());

                        } else {
                            // Não aplicar tema, pois não suporta
                            startActivity(intent);

                        }
                        finish();
                    }
                }, 1000);
    }

    @Override
    public void finish() {
        super.finish();
    }
}

