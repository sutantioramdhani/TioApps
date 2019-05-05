package com.example.sutantio.tioapps;

/*
Nim   : 10116053
Nama  : Sutantio Ramdhani
KElas : AKB2/IF2
tanggal Pengerjaan :29-april-2019
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.net.URI;


public class Profil_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profil_, container, false);

        ImageButton call = (ImageButton)view.findViewById(R.id.imgButton_phone);
        ImageButton fb = (ImageButton)view.findViewById(R.id.imgbutton_FB);
        ImageButton email = (ImageButton)view.findViewById(R.id.imgbutton_Email);
        ImageButton location = (ImageButton)view.findViewById(R.id.imgButton_search);

        call.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nomor = "089617261410";
                Intent panggil = new Intent(Intent.ACTION_DIAL);
                panggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(panggil);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sendemail = "sutantioramdhani98@gmail.com";
                String[] e = sendemail.split(",");
                Intent bukaemail = new Intent(Intent.ACTION_SEND);
                bukaemail.setType("message/rfc822");
                bukaemail.putExtra(Intent.EXTRA_EMAIL, e);
                startActivity(Intent.createChooser(bukaemail, "Choose Email"));
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://id-id.facebook.com/tio.setiaku.5";
                Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
                bukabrowser.setData(Uri.parse(url));
                startActivity(bukabrowser);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gmmIntentUri ="https://www.google.com/maps/place/6%C2%B053'15.6%22S+107%C2%B037'10.0%22E/@-6.88766,107.6188978,19z/data=!3m1!4b1!4m14!1m7!3m6!1s0x2e68e6550564075f:0x551b51f36fc594a0!2sJl.+Sekeloa+Utara,+Coblong,+Kota+Bandung,+Jawa+Barat!3b1!8m2!3d-6.8874976!4d107.6189272!3m5!1s0x0:0x0!7e2!8m2!3d-6.88766!4d107.6194449";
                Intent locationsaya =new Intent(Intent.ACTION_VIEW);
                locationsaya.setData(Uri.parse(gmmIntentUri));
                startActivity(locationsaya);
            }
        });

            return view;
    }
}
