package com.example.sumit.table;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

/**
 * Created by Sumit on 22-08-2017.
 */

public class SecondActivity extends AppCompatActivity {
    public int table;
    public int tableupto;

    public TableAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_layout);
        RecyclerView rv = (RecyclerView)findViewById(R.id.recycle2);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter=new TableAdapter();
        rv.setAdapter(adapter);
        Intent i =getIntent();
         table = i.getIntExtra("konsetable", 0);
         tableupto= i.getIntExtra("kahantak",0);
        Log.d("VIVZ","the table is"+table);


        adapter.whichtable1=table;
        adapter.uptono=tableupto;
        adapter.notifyDataSetChanged();
    }


}
