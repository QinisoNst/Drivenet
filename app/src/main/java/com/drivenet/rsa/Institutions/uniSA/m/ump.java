package com.drivenet.rsa.Institutions.uniSA.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.Institutions.uniSA.adapter.ChildInfo;
import com.drivenet.rsa.Institutions.uniSA.adapter.CustomAdapter;
import com.drivenet.rsa.Institutions.uniSA.adapter.GroupInfo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class ump extends Fragment {
    private TextView univ;
    private AdView mAdView;

    private FirebaseStorage firebaseStorage;
    private StorageReference storageReference;
    private StorageReference ref;
    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();

    private CustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_uni_layout, container, false);


        univ = (TextView)view.findViewById(R.id.textView2);
        univ.setText("University of Mpumalanga");



        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        loadData();
        simpleExpandableListView = (ExpandableListView) view.findViewById(R.id.simpleExpandableListView);
        listAdapter = new CustomAdapter(getContext(), deptList);
        simpleExpandableListView.setAdapter(listAdapter);


        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                GroupInfo headerInfo = deptList.get(groupPosition);
                ChildInfo detailInfo =  headerInfo.getProductList().get(childPosition);

                if(detailInfo.getName().contentEquals("Prospectus"))
                {
                    //Toast.makeText(getContext(),"Download will start soon" , Toast.LENGTH_LONG).show();
                    download();
                    //Toast.makeText(getContext(),"Now Downloading" , Toast.LENGTH_LONG).show();
                }
                else if(detailInfo.getName().contentEquals("Course Form"))
                {
                    //Toast.makeText(getContext(),"Download will start soon" , Toast.LENGTH_LONG).show();
                    download1();
                    //Toast.makeText(getContext(),"Now Downloading" , Toast.LENGTH_LONG).show();
                }
                else if (detailInfo.getName().contentEquals("https://www.ump.ac.za/"))
                {
                    String url = "https://www.ump.ac.za/";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                else if (detailInfo.getName().contentEquals("Tel: +27 13 002 0001"))
                {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse( "tel:"+" +27 13 002 0001" ));
                    startActivity(callIntent);
                }
                else if (detailInfo.getName().contentEquals("Online Course"))
                {
                    String url = "https://www.ump.ac.za/Study-with-us/Application-Process/Online-Applications";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                }
                return false;
            }
        });
        return view;
    }
    private void loadData(){

        addProduct("Apply","Online Course");

        addProduct("Campus","Mbombela");

        addProduct("Contact","Tel: +27 13 002 0001");






        addProduct("Faculties","Arts & Humanities");
        addProduct("Faculties","Business & Social Sciences");
        addProduct("Faculties","Science & Technology");


        addProduct("Website","https://www.ump.ac.za/");
    }
    private int addProduct(String department, String product){

        int groupPosition = 0;

        GroupInfo headerInfo = subjects.get(department);
        //add the group if doesn't exists
        if(headerInfo == null){
            headerInfo = new GroupInfo();
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        int listSize = productList.size();

        listSize++;

        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }

    private void download()
    {
        storageReference = firebaseStorage.getInstance().getReference();
        ref=storageReference.child("university/ump.pdf");
        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri)
            {
                String url = uri.toString();
                downloadfiles(getContext(),"UMP Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
            }


        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    private void download1()
    {

    }
    private void downloadfiles(Context context, String fileName, String fileExtension, String destinationDirectory, String url)
    {
        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

}

