package com.example.sumit.table;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sumit on 22-08-2017.
 */

public class TableAdapter extends RecyclerView.Adapter<TableHolder> {

    public int whichtable1;
    public int uptono;
    public  int result;
    public int mult;

    @Override
    public TableHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.table_layout, parent, false);
        return new TableHolder(view,parent.getContext());
    }

    @Override
    public void onBindViewHolder(TableHolder holder, int position) {

        mult=(position+1);
        result=mult*whichtable1;
        holder.pos = mult;
        holder.table.setText(""+whichtable1+ "X"+ mult+"=  " + result);
    }

    @Override
    public int getItemCount()
    {
        return uptono;
    }
}



