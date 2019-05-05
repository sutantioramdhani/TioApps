package com.example.sutantio.tioapps;
/*
Nim   : 10116053
Nama  : Sutantio Ramdhani
KElas : AKB2/IF2
tanggal Pengerjaan :29-april-2019
 */

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sutantio.tioapps.adapter.Friend_Adapter;
import com.example.sutantio.tioapps.adapter.Kegiatan_Adapter;
import com.example.sutantio.tioapps.modul.DailyActivityModel;
import com.example.sutantio.tioapps.modul.Friend_Modul;

import java.util.ArrayList;
public  class Fragment_Daily extends Fragment{
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private ArrayList<Friend_Modul> imageModelArrayList;
    private Friend_Adapter adapter;
    private Kegiatan_Adapter adapter1;
    private ArrayList<DailyActivityModel> kegiatanArrayList;

    private int[] myImageList = new int[]{R.drawable.foto_aji, R.drawable.foto_diki,R.drawable.foto_gilang, R.drawable.foto_reza,R.drawable.foto_maman,R.drawable.foto_aldi};
    private String[] myImageNameList = new String[]{"Purnama Adjie","Dikki Darmawan" ,"Gilang Fahmi","Reza Mukti","Maman Herianto","Aldi Safi"};

    private int[] myimgkegiatan = new int[]{R.drawable.computer, R.drawable.reading,R.drawable.console, R.drawable.musical_note,R.drawable.employee,R.drawable.slumber};
    private String[] myjamList = new String[]{"Pagi","Pagi-Siang-Sore","Siang","Sore-Malam","Sore - malam ","malam-Pagi"};
    private String[] myNamekegiatanList = new String[]{"Nonton Tv","Kuliah" ,"Bermain Game","Mendengarkan Musik","Ngoding","Tidur"};
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_fragment__daily, container, false);

            recyclerView = (RecyclerView) view.findViewById(R.id.RecyclerView_Friend);
            recyclerView1 = (RecyclerView) view.findViewById(R.id.RecyclerView_Kegiatan);

            //Friend List
            imageModelArrayList = name_friend();
            adapter = new Friend_Adapter(getActivity(),imageModelArrayList);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));


            //kegiatan List
            kegiatanArrayList = my_kegiatan();
            adapter1 = new Kegiatan_Adapter(getActivity(),kegiatanArrayList);
            recyclerView1.setAdapter(adapter1);
            recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
            return view;
        }
        //friend list
        private ArrayList<Friend_Modul> name_friend() {

            ArrayList<Friend_Modul> list = new ArrayList<>();

            for (int i = 0; i < 6; i++) {
                Friend_Modul friendModel = new Friend_Modul();
                friendModel.setName(myImageNameList[i]);
                friendModel.setImage_drawable(myImageList[i]);
                list.add(friendModel);
            }return list;
        }
            //kegiatan list
            private ArrayList<DailyActivityModel> my_kegiatan(){

                ArrayList<DailyActivityModel> list1 = new ArrayList<>();

                for (int i = 0; i < 6; i++) {
                    DailyActivityModel kegiatanModel = new DailyActivityModel();
                    kegiatanModel.setKegiatan(myNamekegiatanList[i]);
                    kegiatanModel.setJam(myjamList[i]);
                    kegiatanModel.setImagekegiatan(myimgkegiatan[i]);
                    list1.add(kegiatanModel);

                }

                return list1;
        }
}
