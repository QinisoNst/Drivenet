package com.drivenet.rsa.wantedcode.aps.showaps;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;

import com.drivenet.rsa.wantedcode.aps.showaps.adapter.ExampleAdapter;
import com.drivenet.rsa.wantedcode.aps.showaps.adapter.ExampleItem;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class ShowAps extends Fragment {
    private AdView mAdView;
    private ArrayList<ExampleItem> mExampleList;
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_show_aps, container, false);
        createExampleList();
        buildRecyclerView(view);

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
        ArrayList<ExampleItem> filteredList = new ArrayList<>();
        for (ExampleItem item : mExampleList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {

        int Fomula1=0;
        int Fomula2=0;
        int Fomula3=0;
        double Fomula4=0;
        int Fomula5=0;
        int Fomula6=0;
        int Fomula7=0;
        int Fomula8=0;
        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();

        for(Student usr : students)
        {
            Fomula1 = usr.getFomula1();
            Fomula2 = usr.getFomula2();
            Fomula3 = usr.getFomula3();
            Fomula4 = usr.getFomula4();
            Fomula5 = usr.getFomula5();
            Fomula6 = usr.getFomula6();
            Fomula7 = usr.getFomula7();
            Fomula8 = usr.getFomula8();
        }

        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem("University of Cape Town", Fomula3+""));
        mExampleList.add(new ExampleItem("University of the Witwatersrand", Fomula6+""));
        mExampleList.add(new ExampleItem("University of the Western Cape", Fomula5+""));
        mExampleList.add(new ExampleItem("Sol Plaatje University", Fomula7+""));
        mExampleList.add(new ExampleItem("Rhodes University" , Fomula4+""));
        mExampleList.add(new ExampleItem("University of the Free State", Fomula2+""));
        mExampleList.add(new ExampleItem("University of Pretoria", Fomula1+""));
        mExampleList.add(new ExampleItem("University of KwaZulu-Natal", Fomula1+""));
        mExampleList.add(new ExampleItem("University of Johannesburg" , Fomula1+""));
        mExampleList.add(new ExampleItem("North-West University" , Fomula1+""));
        mExampleList.add(new ExampleItem("Nelson Mandela University", Fomula3+""));
        mExampleList.add(new ExampleItem("University of South Africa", Fomula1+""));
        mExampleList.add(new ExampleItem("University of Zululand", Fomula1+""));
        mExampleList.add(new ExampleItem("Walter Sisulu University for Technology" , Fomula1+""));
        mExampleList.add(new ExampleItem("University of Limpopo" , Fomula1+""));
        mExampleList.add(new ExampleItem("University of Fort Hare" , Fomula1+""));
        mExampleList.add(new ExampleItem("Sefako Makgatho Health Sciences University" , Fomula1+""));
        mExampleList.add(new ExampleItem("University of Mpumalanga" , Fomula1+""));
        mExampleList.add(new ExampleItem("Tshwane University of Technology" , Fomula1+""));
        mExampleList.add(new ExampleItem("University of Venda" , Fomula1+""));
        mExampleList.add(new ExampleItem("Central University of Technology Free State" , Fomula2+""));
        mExampleList.add(new ExampleItem("Cape Peninsula University of Technologies" , Fomula8+""));
        mExampleList.add(new ExampleItem("Durban University of Technology", Fomula2+""));
        mExampleList.add(new ExampleItem("Mangosuthu University of Technology", Fomula2+""));
        mExampleList.add(new ExampleItem("Vaal University of Technology", Fomula2+""));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),2);
        mAdapter = new ExampleAdapter(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}