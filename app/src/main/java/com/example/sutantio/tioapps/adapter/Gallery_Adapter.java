package com.example.sutantio.tioapps.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.sutantio.tioapps.R;
import com.example.sutantio.tioapps.modul.Gallery_Model;

import java.util.ArrayList;
import java.util.List;

public class Gallery_Adapter extends RecyclerView.Adapter<Gallery_Adapter.galleryViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Gallery_Model> galleryArrayList;

    public Gallery_Adapter(Context ctx, ArrayList<Gallery_Model> galleryArrayList){

        inflater = LayoutInflater.from(ctx);
        this.galleryArrayList = galleryArrayList;
    }

    @Override
    public Gallery_Adapter.galleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.gallery_item, parent, false);
        galleryViewHolder holder = new galleryViewHolder(view);

        return holder;
    }

    public void onBindViewHolder(Gallery_Adapter.galleryViewHolder holder, int position) {
        holder.time.setText(galleryArrayList.get(position).getTitle_gallery());
        holder.foto.setImageResource(galleryArrayList.get(position).getImg_gallery());
    }

    @Override
    public int getItemCount() {
        return galleryArrayList.size();
    }

    class galleryViewHolder extends RecyclerView.ViewHolder {

        TextView time;
        ImageView foto;

        public galleryViewHolder(View itemView) {
            super(itemView);

            time = (TextView) itemView.findViewById(R.id.textView_gallery);
            foto = (ImageView) itemView.findViewById(R.id.imageView_gallery);
        }
    }


}
