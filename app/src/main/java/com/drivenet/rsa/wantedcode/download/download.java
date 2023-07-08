package com.drivenet.rsa.wantedcode.download;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.setting.adapter.CusAdapter1;


import java.util.ArrayList;
import java.util.Arrays;


public class download extends Fragment
{
    private ArrayList personNames1,personImages1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_download, container, false);
        RecyclerView recyclerViewA = (RecyclerView) view.findViewById(R.id.recyclerView);
        show();
        listView2(recyclerViewA);
        return view;
    }
    private void show()
    {
        personNames1 = new ArrayList<>(Arrays.asList("Application Forms","Prospectus"));
        personImages1 = new ArrayList<>(Arrays.asList(R.drawable.ic_books,R.drawable.ic_book));
    }

    private void listView2(RecyclerView recyclerView)
    {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        CusAdapter1 customAdapter = new CusAdapter1(getContext(), personNames1,personImages1,getActivity());
        recyclerView.setAdapter(customAdapter);
    }
}

