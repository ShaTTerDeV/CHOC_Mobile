package com.playstore.shatterdev.chocmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class register_type extends AppCompatActivity
{
    Animation animateSlideUp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_type_layout);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        animateSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in_animation);
        Button btnPatient = (Button)findViewById(R.id.btnPatient);
        Button btnVolunteer = (Button)findViewById(R.id.btnVolunteer);
        btnPatient.startAnimation(animateSlideUp);
        btnVolunteer.startAnimation(animateSlideUp);
        btnPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            //On click function
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), register_activity.class);
                startActivity(intent);
            }
        });
        btnVolunteer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            //On click function
            public void onClick(View view)
            {
                Intent intent = new Intent(view.getContext(), register_activity.class);
                startActivity(intent);
            }
        });
    }
}
