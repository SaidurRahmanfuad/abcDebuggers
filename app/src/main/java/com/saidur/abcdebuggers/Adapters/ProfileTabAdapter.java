package com.saidur.abcdebuggers.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.saidur.abcdebuggers.UI.SubUI.ActiveFragment;
import com.saidur.abcdebuggers.UI.SubUI.HistoryFragment;
import com.saidur.abcdebuggers.UI.SubUI.MatchesFragment;
import com.saidur.abcdebuggers.UI.SubUI.ProfileActiveFragment;
import com.saidur.abcdebuggers.UI.SubUI.ProfileHistoryFragment;
import com.saidur.abcdebuggers.UI.SubUI.ProfileMatchFragment;

import static com.saidur.abcdebuggers.UI.DashboardFragment.int_items;
import static com.saidur.abcdebuggers.UI.ProfileFragment.int_pitems;

public class ProfileTabAdapter extends FragmentPagerAdapter {
    public ProfileTabAdapter(FragmentManager fm) {
        super(fm);
    }


    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new ProfileMatchFragment();
            case 1:
                return new ProfileActiveFragment();
            case 2:
                return new ProfileHistoryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return int_pitems;
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
