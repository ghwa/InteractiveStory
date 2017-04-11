package com.jeehwa.interactivestory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jeehwa.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int finalRadius  = (int) Math.hypot(mStartButton.getWidth()/2, mStartButton.getHeight()/2);
                String name = mNameField.getText().toString();
                startStory(name);

                /*if(SDK_INT == 21) {
                    Animator anim = ViewAnimationUtils.createCircularReveal(
                            mStartButton, (int) mStartButton.getWidth()/2, (int) mStartButton.getHeight()/2, 0, finalRadius);
                    anim.start();
                }*/

        }});
    }

    private void startStory(String name) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }
}

