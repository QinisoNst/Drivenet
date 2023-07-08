package com.drivenet.rsa.database;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Adapter.UserAdapter;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.database.uni.g.uwj.uwj;

import java.util.ArrayList;
import java.util.List;

public class show extends Fragment {
    RecyclerView recyclerview;
    TextView fdpfkl;
    private List<uwj> list;
    private List<Student> students;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_get_data, container, false);
   //     recyclerview = view.findViewById(R.id.recyclerview);
    //    fdpfkl = view.findViewById(R.id.textView6);
        return view;
    }

    @Override
    public void onResume()
    {
        super.onResume();
        getData();
    }

    private void getData() {
        String faculty = "Art and Design";
        list = new ArrayList<>();
        list = VisionDatabase.getDatabase(getContext()).getSelect().getuwj(faculty);

        String mmm="";
        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();
        int name =0;
        for(Student usr : students)
        {

            name = usr.getFomula1();

            mmm = name+" ";

        }
        if(name ==38)
        {
            fdpfkl.setText(mmm);
        }
        recyclerview.setAdapter(new UserAdapter(getContext(),name, list, new UserAdapter.DeleteItemClicklistner() {
            @Override
            public void onItemDelete(int position, int id) {
                getData();
            }
        }));
    }
}