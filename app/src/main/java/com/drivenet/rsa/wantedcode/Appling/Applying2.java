package com.drivenet.rsa.wantedcode.Appling;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.List;

public class Applying2 extends Fragment {
    private Button button;
    private List<Applying> applying;
    private FirebaseAnalytics mFirebaseAnalytics;
    private static final String TAG = "Applying2";
    private EditText EditText1,EditText2,EditText3,EditText4,EditText5,EditText_1,EditText_2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apply_2, container, false);
        button = (Button) view.findViewById(R.id.Submit);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

        EditText_1 = (EditText) view.findViewById(R.id.edittext_number_1);
        EditText_2 = (EditText) view.findViewById(R.id.edittext_number_2);

        EditText1 = (EditText) view.findViewById(R.id.edittext_number_1a);
        EditText2 = (EditText) view.findViewById(R.id.edittext_number_2a);
        EditText2 = (EditText) view.findViewById(R.id.edittext_number_2a);
        EditText3 = (EditText) view.findViewById(R.id.edittext_number_3a);
        EditText4 = (EditText) view.findViewById(R.id.edittext_number_4a);
        EditText5 = (EditText) view.findViewById(R.id.edittext_number_5a);

        applying = VisionDatabase.getDatabase(getContext()).getSelect().getAppling();

        home();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (EditText1.getText().toString().equals(""))
                {
                    EditText1.setError("Place fill in missing info");
                }
                else if (EditText2.getText().toString().equals(""))
                {
                    EditText2.setText(" ");
                }
                else if (EditText3.getText().toString().equals(""))
                {
                    EditText3.setError("Place fill in missing info");
                }
                else if (EditText4.getText().toString().equals(""))
                {
                    EditText4.setError("Place fill in missing info");
                }
                else if (EditText5.getText().toString().equals(""))
                {
                    EditText5.setError("Place fill in missing info");
                }
                else
                    {
                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Applying3()).addToBackStack(null).commit();
                        VisionDatabase.getDatabase(getContext()).getUpdate().apply2
                            (
                                    EditText_1.getText().toString(),EditText_2.getText().toString(),
                                    EditText1.getText().toString(),EditText2.getText().toString(),
                                    EditText3.getText().toString(),
                                    Integer.parseInt(EditText4.getText().toString()),
                                    EditText5.getText().toString()
                            );
                }
            }
        });

        return view;
    }
    private void home()
    {
        String Marital_Status  =" ";
        String Maiden_Names =" ";
        String Activity_Last_Year =" ";
        String Highest_Grade_Passed =" ";
        String Senior_Secondary_School =" ";
        int Matric_Date =0;
        String Matriculation_Type =" ";
        for(Applying usr : applying)
        {
            Marital_Status = usr.getMarital_Status();
            Maiden_Names =usr.getMaiden_Names();
            Activity_Last_Year = usr.getActivity_Last_Year();
            Highest_Grade_Passed = usr.getHighest_Grade_Passed();
            Senior_Secondary_School = usr.getSenior_Secondary_School();
            Matric_Date = usr.getMatric_Date();
            Matriculation_Type = usr.getMatriculation_Type();
        }
        if(Marital_Status.equals(" "))
        {
            EditText1.setHint("");
            EditText2.setHint("");
            EditText3.setHint("");
            EditText4.setHint("");
            EditText5.setHint("");
            EditText_1.setHint("");
            EditText_2.setHint("");
        }
        else
        {
            EditText1.setText(Activity_Last_Year);
            EditText2.setText(Highest_Grade_Passed);
            EditText3.setText(Senior_Secondary_School);
            EditText4.setText(Matric_Date+"");
            EditText5.setText(Matriculation_Type);
            EditText_1.setText(Marital_Status);
            EditText_2.setText(Maiden_Names);
        }
    }
    public void Login(View v)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName;
        switch (v.getId())
        {
            case R.id.button:
                btnName = "Applying2_button";
                break;
            default:
                btnName = "Already Submit_sub";
                break;
        }
        Log.d(TAG,"Button clicked "+btnName+params);
        home(btnName,params);
    }
    public void home(String btnName , Bundle params)
    {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

        mFirebaseAnalytics.logEvent(btnName ,params);
    }
}