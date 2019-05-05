package com.example.sutantio.tioapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Halaman3 extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_halaman3, container, false);

        Button finish = (Button)view.findViewById(R.id.btn_finish);

        finish.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent panggil = new Intent(getActivity(),Home.class);
                startActivity(panggil);
            }
        });
        return view;

    }
}
