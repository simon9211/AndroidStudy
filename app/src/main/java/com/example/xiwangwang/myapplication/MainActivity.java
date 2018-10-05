package com.example.xiwangwang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 找到checkBox
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        //
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this,
                        b? getResources().getString(R.string.check) : getResources().getString(R.string.noCheck),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
