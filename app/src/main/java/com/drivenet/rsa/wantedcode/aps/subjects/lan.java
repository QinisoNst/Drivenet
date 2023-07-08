package com.drivenet.rsa.wantedcode.aps.subjects;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;


import com.drivenet.rsa.wantedcode.aps.subjects.adapter.lanAdapter1;
import com.drivenet.rsa.wantedcode.aps.subjects.adapter.lanItem1;

import java.util.ArrayList;
import java.util.List;

public class lan extends Fragment {
    private ArrayList<lanItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private lanAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;
    private MainActivity mainActivity = new MainActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_institutions, container, false);
        createExampleList();
        buildRecyclerView(view);

        EditText editText = view.findViewById(R.id.edittext);
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
        ArrayList<lanItem1> filteredList = new ArrayList<>();
        for (lanItem1 item : mExampleList) {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new lanItem1("Afrikaans"));
        mExampleList.add(new lanItem1("IsiNdebele"));
        mExampleList.add(new lanItem1("IsiXhosa"));
        mExampleList.add(new lanItem1("IsiZulu"));
        mExampleList.add(new lanItem1("Sepedi"));
        mExampleList.add(new lanItem1("Sign language"));
        mExampleList.add(new lanItem1("Sesotho"));
        mExampleList.add(new lanItem1("Siswati"));
        mExampleList.add(new lanItem1("Tshivenda"));
        mExampleList.add(new lanItem1("Xitsonga"));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new lanAdapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

/**/

   /* public void home()
    {
        animalNameList = new String[]{





        };

    }*/
    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
    //    requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
   //     requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


}
