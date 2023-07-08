package com.drivenet.rsa.profile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.profile.Adapter.ProfileAdapter;
import com.drivenet.rsa.profile.Adapter.ProfileItem1;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.ArrayList;


public class Profile extends Fragment
{
    private ArrayList<ProfileItem1> mExampleList;
    private TextView textView;
    private FirebaseAuth fauth;
    private FirebaseFirestore fstore;
    private RecyclerView mRecyclerView;
    private ProfileAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String userID;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile , container , false);
        textView = (TextView) view.findViewById(R.id.textID);
        Username();
        createExampleList();
        buildRecyclerView1(view);
        return view;
    }

    private void Username()
    {
        fauth  = FirebaseAuth.getInstance();
        fstore  = FirebaseFirestore.getInstance();
        userID = fauth.getCurrentUser().getUid();

        DocumentReference docRef = fstore.collection("users").document(userID);
        docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot snapshot, @Nullable FirebaseFirestoreException e) {
                if (e != null)
                {
                    return;
                }
                if (snapshot != null && snapshot.exists()) {
                }
                else {
                }
                textView.setText(snapshot.getString("Username"));
            }
        });
    }
    private void createExampleList()
    {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ProfileItem1("Application and Course Info"));
        mExampleList.add(new ProfileItem1("Print Profile"));
        mExampleList.add(new ProfileItem1("Submit Profile"));
    }

    private void buildRecyclerView1(View view)
    {
        mRecyclerView = view.findViewById(R.id.RecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ProfileAdapter(mExampleList, getContext(),getResources(),getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}