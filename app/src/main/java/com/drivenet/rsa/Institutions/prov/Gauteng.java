package com.drivenet.rsa.Institutions.prov;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.Institutions.prov.adapter.ProvAdapter1;
import com.drivenet.rsa.Institutions.prov.adapter.ProvItem1;

import java.util.ArrayList;

public class Gauteng extends Fragment {
    private ArrayList<ProvItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private ProvAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private TextView univ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_western_cape, container, false);
        univ = (TextView) view.findViewById(R.id.textView);
        univ.setText("Gauteng");
        createExampleList();
        buildRecyclerView(view);

        return view;
    }
    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ProvItem1("Tshwane University of Technology"));
        mExampleList.add(new ProvItem1("University of Johannesburg"));
        mExampleList.add(new ProvItem1("University of Pretoria"));
        mExampleList.add(new ProvItem1("University of South Africa"));
        mExampleList.add(new ProvItem1("University of the Witwatersrand"));
        mExampleList.add(new ProvItem1("Vaal University of Technology"));
        mExampleList.add(new ProvItem1("Sefako Makgatho Health Sciences University"));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),2);
        mAdapter = new ProvAdapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}