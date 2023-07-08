package com.drivenet.rsa.welcome;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.homefragments.HomeFragment1;
import com.drivenet.rsa.home.adapter.spinnerAdapter;
import com.drivenet.rsa.home.adapter.CustomAdapter2;

import com.drivenet.rsa.homefragments.userinterface;
import com.google.firebase.analytics.FirebaseAnalytics;

public class welcome extends Fragment {
    private SharedPreferences LastSelect;
    private SharedPreferences.Editor editor;
    private static final String TAG = "welcome";
    private FirebaseAnalytics mFirebaseAnalytics;
    private Button simpleList;
    private String[] countryNames= {"South Africa"};
    private int flagsa[] = { R.drawable.sa};
    private String[] institutionNames = {"Eastern Cape" ,"Free State", "Gauteng", "KwaZulu-Natal","Limpopo" ,"Mpumalanga" ,"Northern Cape" ,"North West" ,"Western Cape"};
    private Spinner spin,spin1;
    private MainActivity mainActivity = new MainActivity();
    private String prevStarted = "yes";
    @Override
    public void onResume()
    {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
        requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        SharedPreferences sharedpreferences = getSharedPreferencesa(getContext());
        if
        (!sharedpreferences.getBoolean(prevStarted, false))
        {
            /*SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putBoolean(prevStarted, Boolean.TRUE);
            editor.apply();*/
        }
        else
      {
           moveToSecondary();
      }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_secondary, container, false);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

        simpleList = (Button) view.findViewById(R.id.button);
        spin = (Spinner) view.findViewById(R.id.simpleSpinner);
        spin1 = (Spinner) view.findViewById(R.id.simpleSpinner2);

        LastSelect = getSharedPreferences(getActivity());
        editor = LastSelect.edit();
        editor = LastSelect.edit();

        final int LastClick = LastSelect.getInt("LastClick",0);
        final int LastClick1 = LastSelect.getInt("LastClick1",0);

        CustomAdapter2 customAdapter = new CustomAdapter2(getContext(),flagsa,countryNames);
        spin.setAdapter(customAdapter);
        spin.setSelection(LastClick);

        final userinterface users= new userinterface();
        final spinnerAdapter customAdapter1 = new spinnerAdapter(getContext(),institutionNames);
        spin1.setAdapter(customAdapter1);
        spin1.setSelection(LastClick1);



        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent , View view , int position , long id) {
                editor.putInt("LastClick",position).commit();
                if (countryNames[position].equals("Eastern Cape"))
                {
                    users.setFlags(flagsa);
                    users.setCountry("Western Cape");
            //        VisionDatabase.getDatabase(getContext()).getUpdate().settingcountry("South Africa");
                }
                else if (countryNames[position].equals("Western Cape"))
                {
                    int flagsa[] = {R.drawable.institutiona};
                    users.setFlags(flagsa);
                    users.setCountry("Western Cape");
          //          VisionDatabase.getDatabase(getContext()).getUpdate().settingcountry("Botswana");
                }
                else if (countryNames[position].equals("Gauteng"))
                {
                    users.setFlags(flagsa);
                    users.setCountry("Gauteng");
        //            VisionDatabase.getDatabase(getContext()).getUpdate().settingcountry("Lesotho");
                }

                else if (countryNames[position].equals("KwaZulu-Natal"))
                {
                    users.setFlags(flagsa);
                    users.setCountry("KwaZulu-Natal");
         //          VisionDatabase.getDatabase(getContext()).getUpdate().settingcountry("Eswatini");
                }

                else if (countryNames[position].equals("Free State"))
                {
                    users.setFlags(flagsa);
                    users.setCountry("Free State");
         //           VisionDatabase.getDatabase(getContext()).getUpdate().settingcountry("Namibia");
                }
                else if (countryNames[position].equals("Limpopo"))
                {
                    users.setFlags(flagsa);
                    users.setCountry("Limpopo");
        //            VisionDatabase.getDatabase(getContext()).getUpdate().settingcountry("Namibia");
                }
                else if (countryNames[position].equals("\tMpumalanga"))
                {
                    int flagsa[] = {};
                    users.setFlags(flagsa);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
            }
        });
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent , View view , int position , long id) {
                editor.putInt("LastClick1",position).commit();
                if (institutionNames[position].equals("University"))
                {
                    users.setInstitution("University");
      //              VisionDatabase.getDatabase(getContext()).getUpdate().settinginstitution("University");
                }
                else if (institutionNames[position].equals("College"))
                {
                    users.setInstitution("College");
                    int flagsa[] = {R.drawable.institutiona};
                    //           VisionDatabase.getDatabase(getContext()).getUpdate().settinginstitution("College");
                    users.setFlags(flagsa);
                }
                else if (institutionNames[position].equals("Private"))
                {
                    users.setInstitution("Private");
                    //          VisionDatabase.getDatabase(getContext()).getUpdate().settinginstitution("College");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });
        simpleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.fragmentManager.beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).replace(R.id.fragment_container, new HomeFragment1()).commit();
            }
        });

        return view;
    }
    private SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences LastSelect = context.getSharedPreferences("lastSetting", Context.MODE_PRIVATE);
        return LastSelect;
    }
    private SharedPreferences getSharedPreferencesa(Context context) {
        SharedPreferences LastSelect = context.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        return LastSelect;
    }
    public void moveToSecondary()
    {
        MainActivity.fragmentManager.beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).replace(R.id.fragment_container, new HomeFragment1()).commit();
    }

    public void Login(View v , String research)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName = "";
        if (research.equals("Applying"))
        {
            btnName = "btn_submit";
        }
        Log.d(TAG,"Button clicked"+btnName+params);
        home(btnName,params);
    }
    public void home(String btnName , Bundle params)
    {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
        mFirebaseAnalytics.logEvent(btnName ,params);
    }
    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
        requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
