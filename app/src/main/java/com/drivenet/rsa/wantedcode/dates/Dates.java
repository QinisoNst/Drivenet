package com.drivenet.rsa.wantedcode.dates;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.drivenet.rsa.R;


import com.drivenet.rsa.wantedcode.dates.Adapter.DateAdapter1;
import com.drivenet.rsa.wantedcode.dates.Adapter.DateItem1;

import java.util.ArrayList;


public class Dates extends Fragment {
    private TextView textView;
    private ArrayList<DateItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private DateAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_show_aps2, container, false);

        createExampleList();
        buildRecyclerView(view);

        textView = (TextView)view.findViewById(R.id.textView);
        textView.setText("Dates");

        EditText editText = view.findViewById(R.id.edittext);
        editText.setHint("University");
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

        return view;
    }

    private void filter(String text)
    {
        ArrayList<DateItem1> filteredList = new ArrayList<>();
        for (DateItem1 item : mExampleList)
        {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new DateItem1("University of Cape Town"));
        mExampleList.add(new DateItem1("University of the Witwatersrand"));
        mExampleList.add(new DateItem1("University of the Western Cape"));
        mExampleList.add(new DateItem1("Sol Plaatje University"));
        mExampleList.add(new DateItem1("Rhodes University"));
        mExampleList.add(new DateItem1("University of the Free State"));
        mExampleList.add(new DateItem1("University of Pretoria"));
        mExampleList.add(new DateItem1("University of KwaZulu-Natal"));
        mExampleList.add(new DateItem1("University of Johannesburg"));
        mExampleList.add(new DateItem1("North-West University"));
        mExampleList.add(new DateItem1("Stellenbosch University"));
        mExampleList.add(new DateItem1("Nelson Mandela University"));
        mExampleList.add(new DateItem1("University of South Africa"));
        mExampleList.add(new DateItem1("University of Zululand"));
        mExampleList.add(new DateItem1("Walter Sisulu University for Technology"));
        mExampleList.add(new DateItem1("University of Limpopo"));
        mExampleList.add(new DateItem1("University of Fort Hare"));
        mExampleList.add(new DateItem1("Sefako Makgatho Health Sciences University"));
        mExampleList.add(new DateItem1("University of Mpumalanga"));
        mExampleList.add(new DateItem1("Tshwane University of Technology"));
        mExampleList.add(new DateItem1("University of Venda"));
        mExampleList.add(new DateItem1("Central University of Technology"));
        mExampleList.add(new DateItem1("Cape Peninsula University of Technology"));
        mExampleList.add(new DateItem1("Durban University of Technology"));
        mExampleList.add(new DateItem1("Mangosuthu University of Technology"));
        mExampleList.add(new DateItem1("Vaal University of Technology"));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new DateAdapter1(mExampleList, getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


}