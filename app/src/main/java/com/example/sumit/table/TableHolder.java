package com.example.sumit.table;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Sumit on 22-08-2017.
 */

public class TableHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
public TextView table;
  public  Context c1;
    int pos;

    public TableHolder(View itemView,Context c)  {
        super(itemView);

        table = (TextView) itemView.findViewById(R.id.firstview);
        c1=c;
        table.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent l=new Intent(c1,FinalActivity.class);
        Log.d("sup",Integer.toString(pos));
        l.putExtra("position",pos);
        c1.startActivity(l);
    }
}
