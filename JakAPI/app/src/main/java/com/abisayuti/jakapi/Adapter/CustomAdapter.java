package com.abisayuti.jakapi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abisayuti.jakapi.Activity.DetailActivity;
import com.abisayuti.jakapi.Model.DataItem;
import com.abisayuti.jakapi.R;

import java.util.List;

/**
 * Created by abisayuti on 9/7/18.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context context;
    List<DataItem> data;

    public CustomAdapter(Context mainActivity, List<DataItem> dataTempes) {

        this.context = mainActivity;
        this.data = dataTempes;
    }

    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, final int position) {
        holder.name.setText("Name : " +data.get(position).getPOSPEMADAM());
        holder.Alamat.setText("From : " +data.get(position).getALAMAT());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("pos", data.get(position).getPOSPEMADAM());
                intent.putExtra("alamat", data.get(position).getALAMAT());
                intent.putExtra("kelurahan", data.get(position).getKELURAHAN());
                intent.putExtra("RtRW", data.get(position).getRTRW());
                intent.putExtra("lat", data.get(position).getLAT());
                intent.putExtra("long", data.get(position).getLNG());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,Alamat;
        public MyViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txtNamePosPemadam);
            Alamat = itemView.findViewById(R.id.txtAlamat);

        }
    }
}
