package com.drivenet.rsa.ui.login;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.welcome.welcome;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class welcomelogin extends Fragment {
    private static int TIMEOUT =0;
    private Button button , button1;
    private static final String TAG = "welcomelogin";
    private MainActivity mainActivity = new MainActivity();
    private FirebaseAuth mAuth;
    private FirebaseAnalytics mFirebaseAnalytics;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcomelogin, container, false);

        button = (Button) view.findViewById(R.id.button);
        button1 = (Button) view.findViewById(R.id.button1);

        mAuth = FirebaseAuth.getInstance();

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Login(v);
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new CreateFragment()).addToBackStack(null).commit();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(v);
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new LoginFragment()).addToBackStack(null).commit();
            }
        });
        return view;
    }

    public void Login(View v)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName;
        switch (v.getId())
        {
            case R.id.textView1:
                btnName = "CreatePGClicked";
                break;
            case R.id.button:
                btnName = "LoginPGClicked";
                break;
            default:
                btnName = "Already login";
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

    @Override
    public void onResume() {
        super.onResume();
        FirebaseUser user = mAuth.getCurrentUser();
        if(mAuth.getCurrentUser() !=null && user.isEmailVerified())
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new welcome()).commit();
        }
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