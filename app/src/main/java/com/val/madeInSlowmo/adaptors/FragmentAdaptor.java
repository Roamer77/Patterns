package com.val.madeInSlowmo.adaptors;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.val.madeInSlowmo.fragments.ScriptMakerFragment;
import com.val.madeInSlowmo.fragments.ScriptsFragment;

public class FragmentAdaptor extends FragmentPagerAdapter {
    public FragmentAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ScriptMakerFragment();
        }
        if(position==1){
            return new ScriptsFragment();
        }
       return new ScriptMakerFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
