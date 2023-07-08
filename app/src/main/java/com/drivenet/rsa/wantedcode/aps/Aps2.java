package com.drivenet.rsa.wantedcode.aps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.wantedcode.aps.subjects.lan;
import com.drivenet.rsa.wantedcode.aps.subjects.sub1a;
import com.drivenet.rsa.wantedcode.aps.subjects.sub2a;
import com.drivenet.rsa.wantedcode.aps.subjects.sub3a;

import java.util.List;

public class Aps2 extends Fragment {
    private TextView lan2,sub1,sub2, sub3;
    private Button submit,submit1;
    private List<Student> students;

    private MainActivity mainActivity = new MainActivity();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_aps1, container, false);

        lan2 = view.findViewById(R.id.lan2);
        sub1 = view.findViewById(R.id.sub1);
        sub2 = view.findViewById(R.id.sub2);
        sub3 = view.findViewById(R.id.sub3);


        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();


        String Langa="";
        String sub1a="";
        String sub2a="";
        String sub3a="";

        for(Student usr : students)
        {

            Langa = usr.getLang();
            sub1a = usr.getSub1();
            sub2a = usr.getSub2();
            sub3a = usr.getSub3();
        }

        submit1 = view.findViewById(R.id.Submit1);

        lan2.setText(Langa);
        sub1.setText(sub1a);
        sub2.setText(sub2a);
        sub3.setText(sub3a);
        lan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new lan()).addToBackStack(null).commit();
            }
        });

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new sub1a()).addToBackStack(null).commit();
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new sub2a()).addToBackStack(null).commit();
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new sub3a()).addToBackStack(null).commit();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps1()).addToBackStack(null).commit();

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


                if (sub1.getText().toString().equals(""))
                {
                    sub1.setError("Please select the your first subject");
                }
                else if (sub2.getText().toString().equals(""))
                {
                    sub2.setError("Please select the your second subject");
                }
                else if (sub3.getText().toString().equals(""))
                {
                    sub3.setError("Please select the your third subject");
                }

                else {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps1()).commit(); }
            }
        });



        return view;
    }



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
        //  requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
