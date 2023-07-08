package com.drivenet.rsa.wantedcode.aps.subjects;

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

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;

import com.drivenet.rsa.wantedcode.aps.subjects.sub2.sub2Adapter1;
import com.drivenet.rsa.wantedcode.aps.subjects.sub2.sub2Item1;


import java.util.ArrayList;
import java.util.List;

public class sub2a extends Fragment {
    private ArrayList<sub2Item1> mExampleList;
    private RecyclerView mRecyclerView;
    private sub2Adapter1 mAdapter;
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
        ArrayList<sub2Item1> filteredList = new ArrayList<>();
        for (sub2Item1 item : mExampleList) {
            if (item.getmText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new sub2Item1("Accounting" ));
        mExampleList.add(new sub2Item1("Agricultural Management Practices"));
        mExampleList.add(new sub2Item1("Agricultural Sciences"));
        mExampleList.add(new sub2Item1("Agricultural Technology"));
        mExampleList.add(new sub2Item1("Business Studies"));
        mExampleList.add(new sub2Item1("Civil Technology"));
        mExampleList.add(new sub2Item1("Computer Course Technology"));
        mExampleList.add(new sub2Item1("Consumer Studies"));
        mExampleList.add(new sub2Item1("Dance studies"));
        mExampleList.add(new sub2Item1("Design"));
        mExampleList.add(new sub2Item1("Dramatic Arts"));
        mExampleList.add(new sub2Item1("Economics"));
        mExampleList.add(new sub2Item1("Electrical Technology"));
        mExampleList.add(new sub2Item1("Engineering Graphic and Design"));
        mExampleList.add(new sub2Item1("Geography"));
        mExampleList.add(new sub2Item1("History"));
        mExampleList.add(new sub2Item1("Hospitality Studies"));
        mExampleList.add(new sub2Item1("Information Technology"));
        mExampleList.add(new sub2Item1("Life Sciences"));
        mExampleList.add(new sub2Item1("Mechanical Technology"));
        mExampleList.add(new sub2Item1("Physical Sciences"));
        mExampleList.add(new sub2Item1("Religion Studies"));
        mExampleList.add(new sub2Item1("Music"));
        mExampleList.add(new sub2Item1("Technical Sciences"));
        mExampleList.add(new sub2Item1("Tourism"));
        mExampleList.add(new sub2Item1("Visual Arts"));
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new sub2Adapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
  //      requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
  //      requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

   /*
    if (arraylist.getProfile(i).getAnimalName().equals("Accounting")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Accounting");
    }

                else if (arraylist.getProfile(i).getAnimalName().equals("Agricultural Management Practices")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("AMP");
    }
                else if (arraylist.getProfile(i).getAnimalName().equals("Agricultural Sciences")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Agricultural Sciences");

    }
                else if (arraylist.getProfile(i).getAnimalName().equals("Agricultural Technology")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Agricultural Technology");
        return;
    }
                else if (arraylist.getProfile(i).getAnimalName().equals("Business Studies")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Business Studies");
    }
                else if (arraylist.getProfile(i).getAnimalName().equals("Civil Technology")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Civil Technology");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("Computer Course Technology")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("CAT");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("Consumer Studies")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Consumer Studies");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("Dance studies")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Dance studies");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("Design")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Design");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("Dramatic Arts")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Dramatic Arts");


    }  else if (arraylist.getProfile(i).getAnimalName().equals("Economics")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Economics");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("Electrical Technology")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Electrical Technology");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("Engineering Graphic and Design")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("EGD");

    }  else if (arraylist.getProfile(i).getAnimalName().equals("History")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("History");

    }
                else if (arraylist.getProfile(i).getAnimalName().equals("Hospitality Studies")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Hospitality Studies");

    }

                else if (arraylist.getProfile(i).getAnimalName().equals("Information Technology")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Information Technology");

    }else if (arraylist.getProfile(i).getAnimalName().equals("Life Sciences")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Life Sciences");

    }
                else if (arraylist.getProfile(i).getAnimalName().equals("Mechanical Technology")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Mechanical Technology");

    }


                else if (arraylist.getProfile(i).getAnimalName().equals("Physical Sciences")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Physical Sciences");

    }
                else if (arraylist.getProfile(i).getAnimalName().equals("Religion Studies")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Religion Studies");

    }

                else if (arraylist.getProfile(i).getAnimalName().equals("Music")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Music");

    }

                else if (arraylist.getProfile(i).getAnimalName().equals("Technical Sciences")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Technical Sciences");

    }

                else if (arraylist.getProfile(i).getAnimalName().equals("Tourism")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Tourism");

    }

                else if (arraylist.getProfile(i).getAnimalName().equals("Visual Arts")) {
        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        VisionDatabase.getDatabase(getContext()).getUpdate().sub2("Visual Arts");

    }

    */
}