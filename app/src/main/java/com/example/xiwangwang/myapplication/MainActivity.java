package com.example.xiwangwang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 找到checkBox
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        //
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this,
                        b ? getResources().getString(R.string.check) : getResources().getString(R.string.noCheck),
                        Toast.LENGTH_SHORT).show();
            }
        });

        ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar);


        TextView textView = new TextView(this);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(5, 5, 5, 5);
        textView.setGravity(Gravity.LEFT);
        textView.setBackgroundResource(android.R.color.black);
        textView.setTextColor(getResources().getColor(android.R.color.black));
        textView.setLayoutParams(layoutParams);
    }
}
