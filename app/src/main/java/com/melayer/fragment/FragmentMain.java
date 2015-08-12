package com.melayer.fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melayer.adapter.MyPagerAdapter;
import com.melayer.material.MainActivity;
import com.melayer.material.R;


public class FragmentMain extends Fragment {

    private View rootView;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public static FragmentMain getInstance() {
        FragmentMain fragment = new FragmentMain();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    public FragmentMain() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_fragment_main, container, false);

        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar();

        viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);
        setUpViewPager(viewPager);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager);

        return rootView;
    }

    private void setUpViewPager(ViewPager viewPager){

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getActivity().getSupportFragmentManager());
        pagerAdapter.addFragment(SportsFragment.newInstance(),"Sports");
        pagerAdapter.addFragment(NewsFragment.newInstance(),"News");

        viewPager.setAdapter(pagerAdapter);
    }
}
