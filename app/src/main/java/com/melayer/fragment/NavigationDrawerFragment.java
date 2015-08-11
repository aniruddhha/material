package com.melayer.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melayer.adapter.MyAdapter;
import com.melayer.material.MainActivity;
import com.melayer.material.R;
import com.melayer.model.RecyclerItem;


public class NavigationDrawerFragment extends Fragment {

    private View rootView;
    private RecyclerView recyclerView;

    public static NavigationDrawerFragment getInstance() {
        NavigationDrawerFragment fragment = new NavigationDrawerFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);

        recyclerView = (RecyclerView)rootView.findViewById(R.id.drawerMenu);
        recyclerView.setHasFixedSize(true);

        RecyclerItem []items = {

                new RecyclerItem(R.drawable.abc_ic_menu_paste_mtrl_am_alpha,"Paste"),
                new RecyclerItem(R.drawable.abc_ic_menu_cut_mtrl_alpha,"Cut"),
                new RecyclerItem(R.drawable.abc_ic_menu_share_mtrl_alpha,"Share"),
                new RecyclerItem(R.drawable.abc_ic_menu_selectall_mtrl_alpha,"Select All"),
                new RecyclerItem(R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha,"More")
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        MyAdapter adapter = new MyAdapter(getActivity(),items);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }
}
