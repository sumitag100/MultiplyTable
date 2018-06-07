package com.example.sumit.table;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;


public class FinalActivity extends AppCompatActivity {
    public TextView result;
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_layout);
        result = (TextView) findViewById(R.id.resultis);
        Intent j = getIntent();
        k = j.getIntExtra("position", 0);
        Log.d("yo",Integer.toString(k));
        result.setText(k + "");
    }
}
