package com.simon.multimodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.simon.moduleone.ModuleOne;
import com.simon.moduletwo.ModuleTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ModuleOne.log();
        ModuleTwo.log();
    }
}
