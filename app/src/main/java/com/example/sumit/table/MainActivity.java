package com.example.sumit.table;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public int whichTable;
    public int upto;
    public int i=0;
    private EditText konsetable;
    private EditText kahantak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        konsetable=(EditText)findViewById(R.id.number);
        kahantak=(EditText)findViewById(R.id.upto);


//
//        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler);
//        rv.setLayoutManager(new LinearLayoutManager(this));

//        adapter=new TableAdapter();
//        rv.setAdapter(adapter);

    }

    public void multiplyTable(View view){

        whichTable=Integer.parseInt(konsetable.getText().toString());
        upto=Integer.parseInt(kahantak.getText().toString());
//        adapter.whichtable1=whichTable;
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("konsetable",whichTable);
        i.putExtra("kahantak",upto);
        this.startActivity(i);
//        adapter.uptono=upto;
//        adapter.notifyDataSetChanged();
    }


}
