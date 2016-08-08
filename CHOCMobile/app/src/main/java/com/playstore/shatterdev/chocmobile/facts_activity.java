package com.playstore.shatterdev.chocmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class facts_activity extends AppCompatActivity
{
    Animation animate;
    Animation animateSlideUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts_layout);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        animate = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in_animation);
        animateSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up_animation);
        ImageButton btnProceed = (ImageButton)findViewById(R.id.btnCloseFacts);
        btnProceed.startAnimation(animateSlideUp);
        generateFact();
    }
    public void generateFact()
    {
        int randomNum;
        String factsArray[] = new String[10];
        factsArray[0] = "There are more than 100 types of cancers; any part of the body can be affected.";
        factsArray[1] = "In 2008, 7.6 million people died of cancer - 13% of all deaths worldwide.";
        factsArray[2] = "About 70% of all cancer deaths occur in low- and middle-income countries.";
        factsArray[3] = "Worldwide, the 5 most common types of cancer that kill men are (in order of frequency): lung, stomach, liver, colorectal and oesophagus.";
        factsArray[4] = "Worldwide, the 5 most common types of cancer that kill women are : breast, lung, stomach, colorectal and cervical.";
        factsArray[5] = "Tobacco use is the single largest preventable cause of cancer in the world causing 22% of cancer deaths";
        factsArray[6] = "One fifth of all cancers worldwide are caused by a chronic infection.";
        factsArray[7] = "Cancers of major public health relevance such as breast, cervical and colorectal cancer can be cured if detected early and treated adequately.";
        factsArray[8] = "All patients in need of pain relief could be helped if current knowledge about pain control and palliative care were applied.";
        factsArray[9] = "More than 30% of cancer could be prevented.";

        Random rand = new Random();
        randomNum = rand.nextInt(10 - 1)+1;
        TextView txtFact = (TextView)findViewById(R.id.txtFact);
        txtFact.setText(factsArray[randomNum]);
        txtFact.startAnimation(animate);
    }
    public void Proceed(View v)
    {
        Intent intent = new Intent(getApplicationContext(), dashboard_activity.class);
        startActivity(intent);
    }
}
