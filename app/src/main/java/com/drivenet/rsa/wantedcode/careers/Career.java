package com.drivenet.rsa.wantedcode.careers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.drivenet.rsa.R;
import com.drivenet.rsa.wantedcode.careers.adapter.CareerAdapter;
import com.drivenet.rsa.wantedcode.careers.adapter.CareerItem;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;

import java.util.ArrayList;
import java.util.List;

public class Career extends Fragment {
    private ArrayList<CareerItem> mExampleList;
    private RecyclerView mRecyclerView;
    private CareerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_career , container , false);
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
   /*   mExampleList.add(new CareerItem("University of Cape Town", Fomula3+""));
        mExampleList.add(new CareerItem("University of the Witwatersrand", Fomula6+""));
        mExampleList.add(new CareerItem("University of the Western Cape", Fomula5+""));
        mExampleList.add(new CareerItem("Sol Plaatje University", Fomula7+""));
        mExampleList.add(new CareerItem("Rhodes University" , Fomula4+""));
        mExampleList.add(new CareerItem("University of the Free State", Fomula2+""));
        mExampleList.add(new CareerItem("University of Pretoria", Fomula1+""));
        mExampleList.add(new CareerItem("University of KwaZulu-Natal", Fomula1+""));
        mExampleList.add(new CareerItem("University of Johannesburg" , Fomula1+""));
        mExampleList.add(new CareerItem("North-West University" , Fomula1+""));
        mExampleList.add(new CareerItem("Nelson Mandela University", Fomula3+""));
        mExampleList.add(new CareerItem("University of South Africa", Fomula1+""));
        mExampleList.add(new CareerItem("University of Zululand", Fomula1+""));
        mExampleList.add(new CareerItem("Walter Sisulu University for Technology" , Fomula1+""));
        mExampleList.add(new CareerItem("University of Limpopo" , Fomula1+""));
        mExampleList.add(new CareerItem("University of Fort Hare" , Fomula1+""));
        mExampleList.add(new CareerItem("Sefako Makgatho Health Sciences University" , Fomula1+""));
        mExampleList.add(new CareerItem("University of Mpumalanga" , Fomula1+""));
        mExampleList.add(new CareerItem("Tshwane University of Technology" , Fomula1+""));
        mExampleList.add(new CareerItem("University of Venda" , Fomula1+""));
        mExampleList.add(new CareerItem("Central University of Technology Free State" , Fomula2+""));
        mExampleList.add(new CareerItem("Cape Peninsula University of Technologies" , Fomula8+""));
        mExampleList.add(new CareerItem("Durban University of Technology", Fomula2+""));
        mExampleList.add(new CareerItem("Mangosuthu University of Technology", Fomula2+""));
        mExampleList.add(new CareerItem("Vaal University of Technology", Fomula2+""));*/
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),1);
        mAdapter = new CareerAdapter(mExampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}