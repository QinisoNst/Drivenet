package com.drivenet.rsa.wantedcode.download.career;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.drivenet.rsa.R;
import com.drivenet.rsa.wantedcode.download.career.Adapter.CareerAdapter1;
import com.drivenet.rsa.wantedcode.download.career.Adapter.CareerItem1;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class prospectus extends Fragment {
    private TextView textView;
    private ArrayList<CareerItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private CareerAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_show_aps1, container, false);
        createExampleList();
        buildRecyclerView(view);

        textView = (TextView)view.findViewById(R.id.textView);
        textView.setText("prospectus");

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
        ArrayList<CareerItem1> filteredList = new ArrayList<>();
        for (CareerItem1 item : mExampleList) {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new CareerItem1("University of Cape Town"));
        mExampleList.add(new CareerItem1("University of the Witwatersrand"));
        mExampleList.add(new CareerItem1("University of the Western Cape"));
        mExampleList.add(new CareerItem1("Sol Plaatje University"));
        mExampleList.add(new CareerItem1("Rhodes University"));
        mExampleList.add(new CareerItem1("University of the Free State"));
        mExampleList.add(new CareerItem1("University of Pretoria"));
        mExampleList.add(new CareerItem1("University of KwaZulu-Natal"));
        mExampleList.add(new CareerItem1("University of Johannesburg"));
        mExampleList.add(new CareerItem1("North-West University"));
        mExampleList.add(new CareerItem1("Stellenbosch University"));
        mExampleList.add(new CareerItem1("Nelson Mandela University"));
        mExampleList.add(new CareerItem1("University of South Africa"));
        mExampleList.add(new CareerItem1("University of Zululand"));
        mExampleList.add(new CareerItem1("Walter Sisulu University for Technology"));
        mExampleList.add(new CareerItem1("University of Limpopo"));
        mExampleList.add(new CareerItem1("University of Fort Hare"));
        mExampleList.add(new CareerItem1("Sefako Makgatho Health Sciences University"));
        mExampleList.add(new CareerItem1("University of Mpumalanga"));
        mExampleList.add(new CareerItem1("Tshwane University of Technology"));
        mExampleList.add(new CareerItem1("University of Venda"));
        mExampleList.add(new CareerItem1("Central University of Technology"));
        mExampleList.add(new CareerItem1("Cape Peninsula University of Technology"));
        mExampleList.add(new CareerItem1("Durban University of Technology"));
        mExampleList.add(new CareerItem1("Mangosuthu University of Technology"));
        mExampleList.add(new CareerItem1("Vaal University of Technology"));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),2);
        mAdapter = new CareerAdapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


}