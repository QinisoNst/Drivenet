package com.drivenet.rsa.wantedcode.download.apply;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.wantedcode.download.apply.Adapter.ApplyAdapter1;
import com.drivenet.rsa.wantedcode.download.apply.Adapter.ApplyItem1;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import java.util.ArrayList;

public class Application extends Fragment {
    private TextView textView;
    private ArrayList<ApplyItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private ApplyAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_show_aps1, container, false);
        createExampleList();
        buildRecyclerView(view);

        textView = (TextView)view.findViewById(R.id.textView);
        textView.setText("Apply");
        EditText editText = view.findViewById(R.id.edittext);
        editText.setHint("University");
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        return view;
    }

    private void filter(String text) {
        ArrayList<ApplyItem1> filteredList = new ArrayList<>();
        for (ApplyItem1 item : mExampleList) {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ApplyItem1("Online Course","Download","North-West University"));
        mExampleList.add(new ApplyItem1("Online Course","Download","Nelson Mandela University"));
        mExampleList.add(new ApplyItem1("Online Course","Download","Rhodes University"));
        mExampleList.add(new ApplyItem1("Online Course","Download","University of the Free State"));
        mExampleList.add(new ApplyItem1("","Online","University of Pretoria"));
        mExampleList.add(new ApplyItem1("","Online","University of KwaZulu-Natal"));
        mExampleList.add(new ApplyItem1("Online Course","Download","University of Johannesburg"));
        mExampleList.add(new ApplyItem1("Online Course","Download","University of Mpumalanga"));
        mExampleList.add(new ApplyItem1("","Online","University of South Africa"));
        mExampleList.add(new ApplyItem1("","Online","University of Zululand"));
        mExampleList.add(new ApplyItem1("Online Course","Download","University of Cape Town"));
        mExampleList.add(new ApplyItem1("","Online","University of the Witwatersrand"));
        mExampleList.add(new ApplyItem1("","Online","University of the Western Cape"));
        mExampleList.add(new ApplyItem1("","Online","Walter Sisulu University for Technology"));
        mExampleList.add(new ApplyItem1("","Online","University of Limpopo"));
        mExampleList.add(new ApplyItem1("Online Course","Download","University of Fort Hare"));
        mExampleList.add(new ApplyItem1("Online Course","Download","Sefako Makgatho Health Sciences University"));
        mExampleList.add(new ApplyItem1("","Online","Stellenbosch University"));
        mExampleList.add(new ApplyItem1("Online Course","Download","Sol Plaatje University"));
        mExampleList.add(new ApplyItem1("Online Course","Download","Tshwane University of Technology"));
        mExampleList.add(new ApplyItem1("Online Course","Download","University of Venda"));
        mExampleList.add(new ApplyItem1("","Online","Central University of Technology"));
        mExampleList.add(new ApplyItem1("Online Course","Download","Cape Peninsula University of Technology"));
        mExampleList.add(new ApplyItem1("","Online","Durban University of Technology"));
        mExampleList.add(new ApplyItem1("","Online","Mangosuthu University of Technology"));
        mExampleList.add(new ApplyItem1("Online Course","Download","Vaal University of Technology"));

    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),2);
        mAdapter = new ApplyAdapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


}
