package com.drivenet.rsa.wantedcode.careers;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.wantedcode.careers.adapter.CareerAdapter;
import com.drivenet.rsa.wantedcode.careers.adapter.CareerItem;
import com.drivenet.rsa.database.Student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Career1 extends Fragment {
    private ArrayList<CareerItem> mExampleList;
    private RecyclerView mRecyclerView;
    private ArrayList personNames = new ArrayList<>(Arrays.asList("University","APS"));
    private ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.ic_school,R.drawable.ic_awesome));
    private CareerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_career , container , false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        listView1(recyclerView);
        createExampleList();
        buildRecyclerView(view);


        EditText editText = view.findViewById(R.id.edittext);
        editText.setHint("Faculty");
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
        ArrayList<CareerItem> filteredList = new ArrayList<>();
        for (CareerItem item : mExampleList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new CareerItem("Applied Sciences",R.drawable.ic_as));
        mExampleList.add(new CareerItem("Culinary",R.drawable.ic_cul));
        mExampleList.add(new CareerItem("Education",R.drawable.ic_book));
        mExampleList.add(new CareerItem("EMS",R.drawable.ic_awesome));
        mExampleList.add(new CareerItem("Engineering",R.drawable.ic_drafting));
        mExampleList.add(new CareerItem("Law",R.drawable.ic_lawyer));
        mExampleList.add(new CareerItem("Health Sciences",R.drawable.ic_md));
        mExampleList.add(new CareerItem("Humanities",R.drawable.ic_carry));
        mExampleList.add(new CareerItem("Natural Sciences",R.drawable.ic_florist));
        mExampleList.add(new CareerItem("Sciences",R.drawable.ic_mbk));
        mExampleList.add(new CareerItem("Theology Religion",R.drawable.ic_bible));
        mExampleList.add(new CareerItem("Veterinary Sciences",R.drawable.ic_dog));


    }
    public void listView1(RecyclerView recyclerView)
    {
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter customAdapter = new CustomAdapter(getContext(), personNames,personImages);
        recyclerView.setAdapter(customAdapter);
    }
    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),3);
        mAdapter = new CareerAdapter(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}