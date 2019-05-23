/*
    tanggal : 19 Mei 2019
    nim : 10116318
    nama : Syahril Asidiq Firdaus
    kelas : IF - 7
 */
package com.example.uts_syahril;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.uts_syahril.Presenter.PagerAdaptor;
import com.example.uts_syahril.View.Daftar_Teman;
import com.example.uts_syahril.View.Profil;
import com.example.uts_syahril.View.Kontak;


public class MainActivity extends AppCompatActivity implements Profil.OnFragmentInteractionListener, Kontak.OnFragmentInteractionListener, Daftar_Teman.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Profil"));
        tabLayout.addTab(tabLayout.newTab().setText("Kontak"));
        tabLayout.addTab(tabLayout.newTab().setText("Daftar Teman"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PagerAdaptor adaptor = new PagerAdaptor(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adaptor);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    public void openWa (View view){
        String no = "087825529016";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", no, null));
        startActivity(panggil);
    }
    public void openEmail (View view){
        String url = "mailto:syahrilasidiq0505@gmail.com";
        Intent bukaEmail = new Intent(Intent.ACTION_VIEW);
        bukaEmail.setData(Uri.parse(url));
        startActivity(bukaEmail);
    }
    public void openIg (View view) {
        String url = "https://instagram.com/syahrilasidiq";
        Intent bukaIg = new Intent(Intent.ACTION_VIEW);
        bukaIg.setData(Uri.parse(url));
        startActivity(bukaIg);
    }
    public void openFb (View view) {
        String url = "https://www.facebook.com/syahril.asidiq.f";
        Intent bukaIg = new Intent(Intent.ACTION_VIEW);
        bukaIg.setData(Uri.parse(url));
        startActivity(bukaIg);
    }
    public void openGit (View view) {
        String url = "https://github.com/AsakuraRylx";
        Intent bukaLink = new Intent(Intent.ACTION_VIEW);
        bukaLink.setData(Uri.parse(url));
        startActivity(bukaLink);
    }
    public void openSteam (View view) {
        String url = "https://steamcommunity.com/id/AsakuraRylz";
        Intent bukaLink = new Intent(Intent.ACTION_VIEW);
        bukaLink.setData(Uri.parse(url));
        startActivity(bukaLink);
    }
    public void nullCall (View view){
        String no = "";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", no, null));
        startActivity(panggil);
    }
}
