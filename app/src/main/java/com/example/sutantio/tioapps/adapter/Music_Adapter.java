package com.example.sutantio.tioapps.adapter;

/*
Nim   : 10116053
Nama  : Sutantio Ramdhani
KElas : AKB2/IF2
tanggal Pengerjaan :29-april-2019
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sutantio.tioapps.R;
import com.example.sutantio.tioapps.modul.Music_model;

import java.util.ArrayList;

public class Music_Adapter extends RecyclerView.Adapter<Music_Adapter.musicViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Music_model> musicArrayList;

    public Music_Adapter(Context ctx, ArrayList<Music_model> musicArrayList){

        inflater = LayoutInflater.from(ctx);
        this.musicArrayList = musicArrayList;
    }

    @Override
    public Music_Adapter.musicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.music_item, parent, false);
        Music_Adapter.musicViewHolder holder = new Music_Adapter.musicViewHolder(view);

        return holder;
    }

    public void onBindViewHolder(Music_Adapter.musicViewHolder holder, int position) {

        holder.jdl.setText(musicArrayList.get(position).getJudul());
        holder.penyanyi.setText(musicArrayList.get(position).getPenyanyi());

    }

    @Override
    public int getItemCount() {
        return musicArrayList.size();
    }

    class musicViewHolder extends RecyclerView.ViewHolder {

        TextView jdl,penyanyi;

        public musicViewHolder(View itemView1) {
            super(itemView1);

            jdl = (TextView) itemView.findViewById(R.id.txt_judul_music);
            penyanyi = (TextView) itemView.findViewById(R.id.txt_penyanyi_music);
        }
    }
}
