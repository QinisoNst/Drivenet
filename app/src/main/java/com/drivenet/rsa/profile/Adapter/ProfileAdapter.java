package com.drivenet.rsa.profile.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.profile.Courseoption.Course;
import com.drivenet.rsa.profile.application.Application;
import com.drivenet.rsa.profile.pdf;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.ArrayList;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ExampleViewHolder> {
    private ArrayList<ProfileItem1> mExampleList;
    private int pageHeight = 1120;
    private int pagewidth = 792;
    private Bitmap bmp, scaledbmp;
    private static final int PERMISSION_REQUEST_CODE = 200;
    private Context context;
    private Resources resources;
    private pdf PDf = new pdf();
    private static final String TAG = "ProfileAdapter";
    private FirebaseStorage firebaseStorage;
    private StorageReference storageReference;
    private StorageReference ref;
    private FirebaseAuth mAuth;
    private Activity activity;
    private String userId;
    private UploadTask uploadTask;
    private FirebaseAnalytics mFirebaseAnalytics;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        private TextView head1;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            head1 = itemView.findViewById(R.id.head1);
        }
    }

    public ProfileAdapter(ArrayList<ProfileItem1> exampleList , Context context , Resources resources , Activity activity) {
        mExampleList = exampleList;
        this.context =context;
        this.resources =resources;
        this.activity =activity;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_date2 , parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ProfileItem1 currentItem = mExampleList.get(position);

        holder.head1.setText(currentItem.getmText1());
        holder.head1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(currentItem,v);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }



    private void show(ProfileItem1 currentItem , View v){
        if((currentItem.getmText1().equals("Application and Course Info")))
        {
            Login(v,"Application and Course Info");

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Application()).addToBackStack(null).commit();
        }
        else if ((currentItem.getmText1().equals("Course Profile")))
        {
            Login(v,"Course Options");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Course()).addToBackStack(null).commit();
        }

        else if ((currentItem.getmText1().equals("Print Profile")))
        {
            Login(v,"Print Course");
            bmp = BitmapFactory.decodeResource(resources, R.drawable.icon);
            scaledbmp = Bitmap.createScaledBitmap(bmp, 140, 140, false);
            if (checkPermission()) {
                Toast.makeText(context, "Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                requestPermission();
            }
            PDf.generatePDF(scaledbmp,pageHeight,pagewidth,context);
        }
        else if ((currentItem.getmText1().equals("Submit Profile")))
        {
            Login(v,"Submit Course");
            Toast.makeText(context, "Now sending PDF", Toast.LENGTH_SHORT).show();

            mAuth = FirebaseAuth.getInstance();
            userId = mAuth.getCurrentUser().getUid();
            storageReference = firebaseStorage.getInstance().getReference();
            File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS); // Folder Name
            File myFile = new File(folder, "vision1.pdf"); // Filename

            //Uri file = Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "GFjG.pdf"));
            StorageReference riversRef = storageReference.child("username/"+userId+"/"+Uri.fromFile(myFile).getLastPathSegment());
            uploadTask = riversRef.putFile(Uri.fromFile(myFile));

            // Register observers to listen for when the download is done or if it fails
            uploadTask.addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {
                    // Handle unsuccessful uploads
                    Toast.makeText(context, "PDF submission Failed", Toast.LENGTH_SHORT).show();
                }
            }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    // taskSnapshot.getMetadata() contains file metadata such as size, content-type, etc.
                    // ...
                    Toast.makeText(context, "PDF submitted Successfully ", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    private boolean checkPermission() {
        // checking of permissions.
        int permission1 = ContextCompat.checkSelfPermission(context, WRITE_EXTERNAL_STORAGE);
        int permission2 = ContextCompat.checkSelfPermission(context, READ_EXTERNAL_STORAGE);
        return permission1 == PackageManager.PERMISSION_GRANTED && permission2 == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission() {
        // requesting permissions if not provided.
        ActivityCompat.requestPermissions(activity, new String[]{WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
    }

    public void Login(View v , String research)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName = "";
        if (research.equals("Application")) {

            btnName = "btn_application";
        }
        Log.d(TAG,"Button clicked"+btnName+params);
        home(btnName,params);
    }
    public void home(String btnName , Bundle params)
    {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);

        mFirebaseAnalytics.logEvent(btnName ,params);
    }
    public void filterList(ArrayList<ProfileItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}