package com.saidur.abcdebuggers.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.saidur.abcdebuggers.UI.SubUI.ActiveFragment;
import com.saidur.abcdebuggers.UI.SubUI.HistoryFragment;
import com.saidur.abcdebuggers.UI.SubUI.MatchesFragment;

import static com.saidur.abcdebuggers.UI.DashboardFragment.int_items;

public class DashboardAdapter extends FragmentPagerAdapter {
    public DashboardAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
         {
             case 0:
                 return new MatchesFragment();
             case 1:
                 return new ActiveFragment();
                 case 2:
                     return new HistoryFragment();
         }
        return null;
    }

    @Override
    public int getCount() {
        return int_items;
    }
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Matches";
            case 1:
                return "Active";
            case 2:
                return "History";
        }

        return null;
    }
}



