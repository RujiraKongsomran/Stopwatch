package com.rujirakongsomran.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.rujirakongsomran.stopwatch.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Animation animSplash, animText, animBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//        setContentView(R.layout.activity_main);

        // load animation
        animSplash = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_splash);
        animText = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_text);
        animBtn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_btn);
        // pass animation
        binding.ivSplash.setAnimation(animSplash);
        binding.tvTopic.setAnimation(animText);
        binding.tvContent.setAnimation(animText);
        binding.btnStart.setAnimation(animBtn);
    }
}