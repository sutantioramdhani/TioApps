package com.example.sutantio.tioapps;
/*
Nim   : 10116053
Nama  : Sutantio Ramdhani
KElas : AKB2/IF2
tanggal Pengerjaan :29-april-2019
 */

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sutantio.tioapps.adapter.Gallery_Adapter;
import com.example.sutantio.tioapps.adapter.Kegiatan_Adapter;
import com.example.sutantio.tioapps.modul.DailyActivityModel;
import com.example.sutantio.tioapps.modul.Gallery_Model;

import java.util.ArrayList;

public class Fragment_Gallery extends Fragment {
    private RecyclerView recyclerView2;
    private ArrayList<Gallery_Model> galleryArrayList;
    private Gallery_Adapter adapter2;
    private int[] myfotoList = new int[]{R.drawable.foto_aji, R.drawable.foto_diki,R.drawable.foto_gilang, R.drawable.foto_reza,R.drawable.foto_maman,R.drawable.foto_aldi};
    private String[] mynamafotoList = new String[]{"Purnama Adjie","Dikki Darmawan" ,"Gilang Fahmi","Reza Mukti","Maman Herianto","Aldi Safi"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment__gallery, container, false);


        recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerView_gallery);

        galleryArrayList = Gallery_saya();
        adapter2 = new Gallery_Adapter(getActivity(),galleryArrayList);
        recyclerView2.setAdapter(adapter2);
        recyclerView2.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        return view;
    }
    private ArrayList<Gallery_Model> Gallery_saya() {

        ArrayList<Gallery_Model> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Gallery_Model galleryModel = new Gallery_Model();
            galleryModel.setTitle_gallery(mynamafotoList[i]);
            galleryModel.setImg_gallery(myfotoList[i]);
            list.add(galleryModel);
        }
        return list;
    }
}
