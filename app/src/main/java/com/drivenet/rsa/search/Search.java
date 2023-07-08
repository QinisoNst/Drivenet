package com.drivenet.rsa.search;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;

import com.drivenet.rsa.search.Adapter.SearchAdapter1;
import com.drivenet.rsa.search.Adapter.SearchItem1;


import java.util.ArrayList;
import java.util.List;

public class Search extends Fragment {
    private ArrayList<SearchItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private SearchAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_show_aps2, container, false);
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
        return view;
    }

    private void filter(String text) {
        ArrayList<SearchItem1> filteredList = new ArrayList<>();
        for (SearchItem1 item : mExampleList) {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();

        mExampleList.add(new SearchItem1("Cape Peninsula University of Technology"));
        mExampleList.add(new SearchItem1("Central University of Technology"));

        mExampleList.add(new SearchItem1("Durban University of Technology"));
        mExampleList.add(new SearchItem1("Mangosuthu University of Technology"));

        mExampleList.add(new SearchItem1("Nelson Mandela University"));
        mExampleList.add(new SearchItem1("North-West University"));
        mExampleList.add(new SearchItem1("Rhodes University"));
        mExampleList.add(new SearchItem1("Sefako Makgatho Health Sciences University"));
        mExampleList.add(new SearchItem1("Sol Plaatje University"));
        mExampleList.add(new SearchItem1("Stellenbosch University"));
        mExampleList.add(new SearchItem1("Tshwane University of Technology"));

        mExampleList.add(new SearchItem1("University of Cape Town"));
        mExampleList.add(new SearchItem1("University of the Witwatersrand"));
        mExampleList.add(new SearchItem1("University of the Western Cape"));

        mExampleList.add(new SearchItem1("University of the Free State"));
        mExampleList.add(new SearchItem1("University of Pretoria"));
        mExampleList.add(new SearchItem1("University of KwaZulu-Natal"));
        mExampleList.add(new SearchItem1("University of Johannesburg"));

        mExampleList.add(new SearchItem1("University of South Africa"));

        mExampleList.add(new SearchItem1("University of Limpopo"));
        mExampleList.add(new SearchItem1("University of Fort Hare"));
        mExampleList.add(new SearchItem1("University of Mpumalanga"));
        mExampleList.add(new SearchItem1("University of Venda"));
        mExampleList.add(new SearchItem1("University of Zululand"));

        mExampleList.add(new SearchItem1("Vaal University of Technology"));
        mExampleList.add(new SearchItem1("Walter Sisulu University for Technology"));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new SearchAdapter1(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


}
