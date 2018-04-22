package id.dilo.raga.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by joedhaalzelvin on 11/04/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentAll fragmentAll=new FragmentAll();
                return fragmentAll;
            case 1:
                FragmentKaos fragmentKaos=new FragmentKaos();
                return fragmentKaos;
            case 2:
                FragmentCelana fragmentCelana=new FragmentCelana();
                return fragmentCelana;
            case 3:
                FragmentSepatu fragmentSepatu=new FragmentSepatu();
                return fragmentSepatu;
            case 4:
                FragmentAksesoris fragmentAksesoris=new FragmentAksesoris();
                return fragmentAksesoris;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
