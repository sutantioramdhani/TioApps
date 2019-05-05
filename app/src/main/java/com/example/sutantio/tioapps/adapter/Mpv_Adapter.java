package com.example.sutantio.tioapps.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.sutantio.tioapps.MVF_Fragment;
import com.example.sutantio.tioapps.Music_Fragment;
import com.example.sutantio.tioapps.Video_Fragment;

import java.util.ArrayList;
import java.util.List;

public class Mpv_Adapter {

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Video_Fragment();
            case 1:
                return new Music_Fragment();
        }
        return null;
    }


    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            default:
                return null;
        }
    }
}
