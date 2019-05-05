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
import com.example.sutantio.tioapps.modul.DailyActivityModel;
import com.example.sutantio.tioapps.modul.Friend_Modul;

import java.util.ArrayList;

public class Kegiatan_Adapter extends RecyclerView.Adapter<Kegiatan_Adapter.KegiatanViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<DailyActivityModel> kegiatanArrayList;

    public Kegiatan_Adapter(Context ctx, ArrayList<DailyActivityModel> kegiatanArrayList){

        inflater = LayoutInflater.from(ctx);
        this.kegiatanArrayList = kegiatanArrayList;
    }

    @Override
    public Kegiatan_Adapter.KegiatanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.kegiatan_item, parent, false);
        Kegiatan_Adapter.KegiatanViewHolder holder = new Kegiatan_Adapter.KegiatanViewHolder(view);

        return holder;
    }

    public void onBindViewHolder(Kegiatan_Adapter.KegiatanViewHolder holder, int position) {

        holder.namakegiatan.setText(kegiatanArrayList.get(position).getKegiatan());
        holder.jamkegiatan.setText(kegiatanArrayList.get(position).getJam());
        holder.imgkegiatan.setImageResource(kegiatanArrayList.get(position).getImagekegiatan());

    }

    @Override
    public int getItemCount() {
        return kegiatanArrayList.size();
    }

    class KegiatanViewHolder extends RecyclerView.ViewHolder {

        TextView namakegiatan,jamkegiatan;
        ImageView imgkegiatan;

        public KegiatanViewHolder(View itemView1) {
            super(itemView1);

            namakegiatan = (TextView) itemView.findViewById(R.id.txt_nama_kegiatan);
            jamkegiatan = (TextView) itemView.findViewById(R.id.txt_jam_kegiatan);
            imgkegiatan = (ImageView) itemView.findViewById(R.id.img_kegiatan);
        }
    }
}
