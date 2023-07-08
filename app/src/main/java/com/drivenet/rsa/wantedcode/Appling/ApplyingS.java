package com.drivenet.rsa.wantedcode.Appling;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.wantedcode.Appling.Adapter.ApplyingAdapter1;
import com.drivenet.rsa.wantedcode.Appling.Adapter.ApplyingItem1;
import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;

public class ApplyingS extends Fragment {
    private ArrayList<ApplyingItem1> mExampleList;
    private RecyclerView mRecyclerView;
    private ApplyingAdapter1 mAdapter;
    private TextView textView;
    private static final String TAG = "ApplyingS";
    private RecyclerView.LayoutManager mLayoutManager;
    private FirebaseAnalytics mFirebaseAnalytics;
    private Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_apply, container, false);

        Button button = view.findViewById(R.id.button);
        TextView textView = view.findViewById(R.id.Textview);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(v);
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Applying1()).addToBackStack(null).commit();
            }
        });
        textView.setText
                (
                        "Please note that before you proceed please make sure that you have the necessary information that will be required for the upcoming steps. " +
                                "In order for us to process your application please ensure that you have this information." +
                                "\n"+
                                "\nID/Passport Address info Contact info Matric info"
                );
        return view;
    }
    public void Login(View v)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName;
        switch (v.getId())
        {
            case R.id.button:
                btnName = "Submit_button";
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