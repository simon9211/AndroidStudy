package com.example.xiwangwang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by xiwangwang on 2018/8/6.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                RadioButton rb = (RadioButton) LoginActivity.this.findViewById(i);
                Toast.makeText(LoginActivity.this,
                        getResources().getString(R.string.radioGroupSelect) + rb.getText() + " id: " + i,
                        Toast.LENGTH_SHORT).show();
            }
        });

        ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(LoginActivity.this,
                        "toggleButton clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(LoginActivity.this, MainActivity.class)  ;
                startActivity(main);
            }
        });

        findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent main = new Intent(LoginActivity.this, MainActivity.class)  ;
                startActivity(main);
            }
        });
    }

    public void clickMyButton(View v) {

        Intent main = new Intent(LoginActivity.this, MainActivity.class)  ;
        startActivity(main);

        Toast.makeText(LoginActivity.this,
                this.getResources().getString(R.string.buttonClicked),
                Toast.LENGTH_SHORT).show();
    }
}

