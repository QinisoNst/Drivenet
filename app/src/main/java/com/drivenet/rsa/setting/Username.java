package com.drivenet.rsa.setting;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Username extends Fragment
{
    private static int TIMEOUT =0;

    private Button submit;
    private MainActivity mainActivity = new MainActivity();
    private List<Student> students;
    private EditText Username;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_username, container, false);
        Username = (EditText)view.findViewById(R.id.EditText);
        submit = (Button)view.findViewById(R.id.Submit);

        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();

        String username =" ";

        for(Student usr : students)
        {
            username = usr.getUsername();
        }
        Username.setHint(username);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (Username.getText().equals(""))
                {
                    Username.setText("0");
                }
                else {
                    VisionDatabase.getDatabase(getContext()).getUpdate().username(Username.getText().toString());
                }
            }
        });
        return view;
    }



    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
        requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
        requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}