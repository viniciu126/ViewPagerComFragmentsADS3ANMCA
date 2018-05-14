package br.com.bossini.viewpagercomfragmentsads3anmca;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by viniciu126 on 12/05/18.
 * RA: 816117960
 */

public class TabsAdapter extends FragmentPagerAdapter {
    public TabsAdapter (FragmentManager fm){
       super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BlankFragment1();
                break;
            case 1:
                return new BlankFragment2();
                break;
            case 2:
                return new BlankFragment3();
                break;
        }
    }
}
