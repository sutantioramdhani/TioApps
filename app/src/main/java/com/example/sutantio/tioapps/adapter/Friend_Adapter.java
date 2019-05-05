package com.example.sutantio.tioapps.adapter;

/*
Nim   : 10116053
Nama  : Sutantio Ramdhani
KElas : AKB2/IF2
tanggal Pengerjaan :29-april-2019
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sutantio.tioapps.Fragment_Daily;
import com.example.sutantio.tioapps.R;
import com.example.sutantio.tioapps.modul.Friend_Modul;

import java.util.ArrayList;

public class Friend_Adapter extends RecyclerView.Adapter<Friend_Adapter.MyViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Friend_Modul> imageModelArrayList;

    public Friend_Adapter(Context ctx, ArrayList<Friend_Modul> imageModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.imageModelArrayList = imageModelArrayList;
    }

    @Override
    public Friend_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.friends_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    public void onBindViewHolder(Friend_Adapter.MyViewHolder holder, int position) {

        holder.iv.setImageResource(imageModelArrayList.get(position).getImage_drawable());
        holder.time.setText(imageModelArrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return imageModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView time;
        ImageView iv;

        public MyViewHolder(View itemView) {
            super(itemView);

            time = (TextView) itemView.findViewById(R.id.nama_teman_TV);
            iv = (ImageView) itemView.findViewById(R.id.foto_teman_IV);
        }
    }
}

