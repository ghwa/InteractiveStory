package com.jeehwa.interactivestory.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jeehwa.interactivestory.R;
import com.jeehwa.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();
    private Page[] page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        if(name == null || name.isEmpty()) {
            name = "Friend";
        }

        Log.d(TAG, name);
    }
}
