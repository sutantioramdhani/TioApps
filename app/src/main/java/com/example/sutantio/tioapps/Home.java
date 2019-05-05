package com.example.sutantio.tioapps;
/*
Nim   : 10116053
Nama  : Sutantio Ramdhani
KElas : AKB2/IF2
tanggal Pengerjaan :29-april-2019
 */

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // kita set default nya Home Fragment
        loadFragment(new Fragment_Home());

// inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_bawah);

// beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    // method listener untuk logika pemilihan
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.home_menu:
                fragment = new Fragment_Home();
                break;
            case R.id.daily_menu:
                fragment = new Fragment_Daily();
                break;
            case R.id.gallery_menu:
                fragment = new Fragment_Gallery();
                break;
            case R.id.mvf_menu:
                fragment = new MVF_Fragment  ();
                break;
            case R.id.profil_menu:
                fragment = new Profil_Fragment();
                break;
        }

        return loadFragment(fragment);
    }

}
