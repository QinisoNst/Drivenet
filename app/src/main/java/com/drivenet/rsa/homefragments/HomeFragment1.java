package com.drivenet.rsa.homefragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;


import com.drivenet.rsa.home.adapter.spinnerAdapter;

import java.util.ArrayList;


public class HomeFragment1 extends Fragment
{
    private ArrayList<HomeItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private HomeAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private SharedPreferences LastSelect;
    private SharedPreferences.Editor editor;
    private String[] countryNames=
            {
                    "South Africa",
            };

    private int flagsa[] =
            {
                    R.drawable.sa,
            };
    private String[] institutionNames = {"University"};
    private TextView spin1;
    private ImageButton imageButton;
    private MainActivity mainActivity = new MainActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home1, container, false);

        mRecyclerView = view.findViewById(R.id.listview);


        LastSelect = getSharedPreferences("lastSetting", Context.MODE_PRIVATE , getActivity());
        editor = LastSelect.edit();

        final int LastClick1 = LastSelect.getInt("LastClick1",0);

        final userinterface users= new userinterface();
        final spinnerAdapter customAdapter1 = new spinnerAdapter(getActivity(),institutionNames);



        createExampleList();
        buildRecyclerView(view);


        return view;
    }


    private SharedPreferences getSharedPreferences(String lastSetting , int modePrivate , Context context) {
        SharedPreferences LastSelect = context.getSharedPreferences("lastSetting", Context.MODE_PRIVATE);
        return LastSelect;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        SharedPreferences LastSelect = context.getSharedPreferences("lastSetting", Context.MODE_PRIVATE);
    }

    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hidetoolbar();
   //     mainActivity.hide();

        }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    //    requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new HomeItem1("Application","Apply",R.drawable.ic_apply));
        mExampleList.add(new HomeItem1("APS","Score",R.drawable.ic_aps));
        mExampleList.add(new HomeItem1("Career","Courses",R.drawable.bookopen));
        mExampleList.add(new HomeItem1("Dates","Opening / Closing ",R.drawable.ic_date));
        mExampleList.add(new HomeItem1("Downloads","Application Forms"+"\n"+"   Prospectus",R.drawable.ic_download));
        mExampleList.add(new HomeItem1("Institutions","Contact Info",R.drawable.ic_school));
    }

    private void buildRecyclerView(View view) {

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),2);
        mAdapter = new HomeAdapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}