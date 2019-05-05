package com.example.sutantio.tioapps;

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
import com.example.sutantio.tioapps.adapter.Music_Adapter;
import com.example.sutantio.tioapps.modul.Gallery_Model;
import com.example.sutantio.tioapps.modul.Music_model;

import java.util.ArrayList;

public class Music_Fragment extends Fragment {
    private RecyclerView recyclerView3;
    private ArrayList<Music_model> musicArrayList;
    private Music_Adapter adapter3;
    private String[] judul = new String[]{"you are the Reason","Ilang Roso","Sayang 2"};
    private String[] penyanyi = new String[]{"Colum Scot","Via Vallen","Nella Karisma"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_, container, false);


        recyclerView3 = (RecyclerView) view.findViewById(R.id.RecyclerView_music);

        musicArrayList = Music_saya();
        adapter3 = new Music_Adapter(getActivity(),musicArrayList);
        recyclerView3.setAdapter(adapter3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
    private ArrayList<Music_model> Music_saya() {

        ArrayList<Music_model> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Music_model musicModel = new Music_model();
            musicModel.setJudul(judul[i]);
            musicModel.setPenyanyi(penyanyi[i]);
            list.add(musicModel);
        }
        return list;
    }

    }

