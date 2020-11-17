package com.example.toptroc.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toptroc.ObjectDepositActivity;
import com.example.toptroc.Profile.PageAdapter;
import com.example.toptroc.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements View.OnClickListener {

    public ProfileFragment() {
        // Required empty public constructor
    }

    private View view;
    TabLayout tabLayoutProfile;
    TabItem itemObjects,itemParameters,itemInformations;
    ViewPager viewPagerProfile;
    PageAdapter pageAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        tabLayoutProfile = (TabLayout) view.findViewById(R.id.tabLayoutProfile);
        itemObjects = (TabItem) view.findViewById(R.id.itemObjects);
        itemParameters = (TabItem) view.findViewById(R.id.itemParameters);
        itemInformations = (TabItem) view.findViewById(R.id.itemInformations);
        viewPagerProfile = (ViewPager) view.findViewById(R.id.viewPagerProfile);

        pageAdapter = new
                PageAdapter(getFragmentManager(),tabLayoutProfile.getTabCount());
        viewPagerProfile.setAdapter(pageAdapter);

        tabLayoutProfile.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerProfile.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }


    @Override
    public void onClick(View v) {

    }

}