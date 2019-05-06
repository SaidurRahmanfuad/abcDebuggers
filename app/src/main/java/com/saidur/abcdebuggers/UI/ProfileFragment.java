package com.saidur.abcdebuggers.UI;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saidur.abcdebuggers.Adapters.DashboardAdapter;
import com.saidur.abcdebuggers.Adapters.ProfileTabAdapter;
import com.saidur.abcdebuggers.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    public  static int int_pitems= 3;
    TabLayout tab;
    ViewPager viewPager;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_profile, container, false);
        tab=v.findViewById(R.id.profile_tabs);
        viewPager=v.findViewById(R.id.profile_viewpager);

        viewPager.setAdapter(new ProfileTabAdapter( getChildFragmentManager()));

        tab.post(new Runnable() {
            @Override
            public void run() {
                tab.setupWithViewPager(viewPager);
            }
        });
        return v;
    }

}