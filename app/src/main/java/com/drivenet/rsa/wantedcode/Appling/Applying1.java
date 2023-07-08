package com.drivenet.rsa.wantedcode.Appling;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.List;

public class Applying1 extends Fragment {
    private Button button;
    private List<Applying> applying;
    private List<Applying> students1;
    private FirebaseAnalytics mFirebaseAnalytics;
    private static final String TAG = "Applying1";
    EditText EditText1,EditText2,EditText3,EditText4,EditText5,EditText6,EditText_1,EditText_2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apply_1, container, false);
        button = (Button) view.findViewById(R.id.Submit);

        EditText1 = (EditText) view.findViewById(R.id.edittext_number_1a);
        EditText2 = (EditText) view.findViewById(R.id.edittext_number_2a);
        EditText2 = (EditText) view.findViewById(R.id.edittext_number_2a);
        EditText3 = (EditText) view.findViewById(R.id.edittext_number_3a);
        EditText4 = (EditText) view.findViewById(R.id.edittext_number_4a);
        EditText5 = (EditText) view.findViewById(R.id.edittext_number_5a);
        EditText6 = (EditText) view.findViewById(R.id.edittext_number_6a);

        EditText_1 = (EditText) view.findViewById(R.id.edittext_number_1);
        EditText_2 = (EditText) view.findViewById(R.id.edittext_number_2);

        applying = VisionDatabase.getDatabase(getContext()).getSelect().getAppling();

        String Address_Line_1 =" ";
        String Address_Line_2 =" ";
        String City_Town =" ";
        String Province =" ";
        int Postal_Code =0;
        String Residence_Accommodation =" ";
        int Cell_Phone =0;
        String Email =" ";

        for(Applying usr : applying)
        {
            Address_Line_1 = usr.getAddress_Line_1();
            Address_Line_2 =usr.getAddress_Line_2();
            City_Town = usr.getCity_Town();
            Province = usr.getProvince();
            Postal_Code = usr.getPostal_Code();
            Residence_Accommodation = usr.getResidence_Accommodation();
            Cell_Phone = usr.getCell_Phone();
            Email  = usr.getEmail();
        }

        home(Address_Line_1,Address_Line_2,City_Town,Province,Postal_Code,Residence_Accommodation,Cell_Phone,Email);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
                else if (EditText6.getText().toString().equals(""))
                {
                    EditText6.setError("Place fill in missing info");
                }
                else
                    {
                        Login(v);
                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Applying2()).addToBackStack(null).commit();
                        VisionDatabase.getDatabase(getContext()).getUpdate().apply1
                                (
                                        EditText1.getText().toString(),EditText2.getText().toString(),
                                        EditText3.getText().toString(),EditText4.getText().toString(),
                                        Integer.parseInt(EditText5.getText().toString()),EditText6.getText().toString(),
                                        Integer.parseInt(EditText_1.getText().toString()),EditText_2.getText().toString()
                                );
                }
            }
        });

        return view;
    }
    private void home(String address_Line_1 , String address_Line_2 , String city_Town , String province , int postal_Code , String residence_Accommodation , int cell_Phone , String email)
    {
        if(address_Line_1.equals(" "))
        {
            EditText1.setHint("");
            EditText2.setHint("");
            EditText3.setHint("");
            EditText4.setHint("");
            EditText5.setHint("");
            EditText6.setHint("");
            EditText_1.setHint("");
            EditText_2.setHint("");
        }
        else
        {
            EditText1.setText(address_Line_1);
            EditText2.setText(address_Line_2);
            EditText3.setText(city_Town);
            EditText4.setText(province);
            EditText5.setText(postal_Code+"");
            EditText6.setText(residence_Accommodation);
            EditText_1.setText(cell_Phone+"");
            EditText_2.setText(email);
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
                btnName = "Applying1_button";
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