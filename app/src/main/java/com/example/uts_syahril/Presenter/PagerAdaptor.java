/*
    tanggal : 20 Mei 2019
    nim : 10116318
    nama : Syahril Asidiq Firdaus
    kelas : IF - 7
 */
package com.example.uts_syahril.Presenter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.uts_syahril.View.Daftar_Teman;
import com.example.uts_syahril.View.Profil;
import com.example.uts_syahril.View.Kontak;


public class PagerAdaptor extends FragmentStatePagerAdapter {
    int mNoOfTabs;

    public PagerAdaptor(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                Profil profil = new Profil();
                return profil;
            case 1 :
                Kontak kontak = new Kontak();
                return kontak;
            case 2 :
                Daftar_Teman daf = new Daftar_Teman();
                return daf;
            default :
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
