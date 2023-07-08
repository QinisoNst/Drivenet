package com.drivenet.rsa.wantedcode.download.career.Adapter;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.Institutions.uniSA.ec.nmu;
import com.drivenet.rsa.Institutions.uniSA.ec.ru;
import com.drivenet.rsa.Institutions.uniSA.ec.ufh;
import com.drivenet.rsa.Institutions.uniSA.ec.wsu;
import com.drivenet.rsa.Institutions.uniSA.fs.cut;
import com.drivenet.rsa.Institutions.uniSA.fs.ufs;
import com.drivenet.rsa.Institutions.uniSA.g.smu;
import com.drivenet.rsa.Institutions.uniSA.g.tut;
import com.drivenet.rsa.Institutions.uniSA.g.uj;
import com.drivenet.rsa.Institutions.uniSA.g.unisa;
import com.drivenet.rsa.Institutions.uniSA.g.up;
import com.drivenet.rsa.Institutions.uniSA.g.uwj.uwj;
import com.drivenet.rsa.Institutions.uniSA.g.vut;
import com.drivenet.rsa.Institutions.uniSA.k.dut;
import com.drivenet.rsa.Institutions.uniSA.k.kzn;
import com.drivenet.rsa.Institutions.uniSA.k.mut;
import com.drivenet.rsa.Institutions.uniSA.k.unizulu;
import com.drivenet.rsa.Institutions.uniSA.l.ul;
import com.drivenet.rsa.Institutions.uniSA.l.univen;
import com.drivenet.rsa.Institutions.uniSA.m.ump;
import com.drivenet.rsa.Institutions.uniSA.nc.spu;
import com.drivenet.rsa.Institutions.uniSA.nw.nwu;
import com.drivenet.rsa.Institutions.uniSA.wc.cput;
import com.drivenet.rsa.Institutions.uniSA.wc.su;
import com.drivenet.rsa.Institutions.uniSA.wc.uct;
import com.drivenet.rsa.Institutions.uniSA.wc.uwc;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class CareerAdapter1 extends RecyclerView.Adapter<CareerAdapter1.ExampleViewHolder> {
    private ArrayList<CareerItem1> mExampleList;
    private StorageReference storageReference;
    private StorageReference ref;
    private FirebaseStorage firebaseStorage;

    private Context context;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView head1;
        public TextView button;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            head1 = itemView.findViewById(R.id.head1);
            button = itemView.findViewById(R.id.button);
        }
    }

    public CareerAdapter1(ArrayList<CareerItem1> exampleList, Context context) {
        mExampleList = exampleList;
        this.context = context;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_career ,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        CareerItem1 currentItem = mExampleList.get(position);


        holder.head1.setText(currentItem.getmText1());
        holder.head1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(currentItem);
            }
        });
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Download will start soon" , Toast.LENGTH_LONG).show();
                show1(currentItem);
                Toast.makeText(context,"Now Downloading" , Toast.LENGTH_LONG).show();
            }
        });

    }
    private void show(CareerItem1 currentItem)
    {
        if((currentItem.getmText1().equals("University of Cape Town")))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uct()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("University of the Witwatersrand"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwj()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("University of the Western Cape"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwc()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Sol Plaatje University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new spu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Rhodes University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ru()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of the Free State"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufs()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of Pretoria"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new up()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of KwaZulu-Natal"))
        {
            ;
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new kzn()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of Johannesburg"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uj()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("North-West University" ))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nwu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Nelson Mandela University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nmu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of South Africa"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unisa()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of Zululand"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unizulu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Walter Sisulu University for Technology"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new wsu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of Limpopo"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ul()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of Fort Hare"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufh()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Sefako Makgatho Health Sciences University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new smu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of Mpumalanga"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ump()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Tshwane University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new tut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("University of Venda"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new univen()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Stellenbosch University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new su()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Central University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Cape Peninsula University of Technology"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cput()).addToBackStack(null).commit();

            return;

        }
        else if(currentItem.getmText1().equals("Durban University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new dut()).addToBackStack(null).commit();

            return;

        }
        else if(currentItem.getmText1().equals("Mangosuthu University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new mut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getmText1().equals("Vaal University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new vut()).addToBackStack(null).commit();

            return;
        }
    }

    private void show1(CareerItem1 currentItem)
    {

        if((currentItem.getmText1().equals("University of Cape Town")))
        {
            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/uct.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UCT Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });        }
        else if(currentItem.getmText1().equals("University of the Witwatersrand"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/wite.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"Wits Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
        else if(currentItem.getmText1().equals("University of the Western Cape"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/uwc.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UWC Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("Sol Plaatje University"))
        {
            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/spu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"SPU Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });

        }
        else if(currentItem.getmText1().equals("Rhodes University"))
        {
            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/ru.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"RU Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }

            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
        else if(currentItem.getmText1().equals("University of the Free State"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/ufs.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UFS Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e)
                {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("University of Pretoria"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/up.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UP Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });

        }
        else if(currentItem.getmText1().equals("University of KwaZulu-Natal"))
        {
            ;
            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/ukzn.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UKZN Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("University of Johannesburg"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/uj.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UJ Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("North-West University" ))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/nws.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"NWU Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
        else if(currentItem.getmText1().equals("Nelson Mandela University"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/nmu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"NMU Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });

        }
        else if(currentItem.getmText1().equals("University of South Africa"))
        {

            ref=storageReference.child("southafrica/university/prospectus/unisa.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UNISA Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
        else if(currentItem.getmText1().equals("University of Zululand"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/unizulu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UniZulu Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("Walter Sisulu University for Technology"))
        {


            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/wsu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"WSU Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("University of Limpopo"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/ul.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UL Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("University of Fort Hare"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/ufh.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UFH Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });

        }
        else if(currentItem.getmText1().equals("Sefako Makgatho Health Sciences University"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/smu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"SMU Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e)
                {
                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("Stellenbosch University"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/su.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"SU Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("University of Mpumalanga"))
        {
            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/ump.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UMP Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });

        }
        else if(currentItem.getmText1().equals("Tshwane University of Technology"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/tut.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"TUT Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
        else if(currentItem.getmText1().equals("University of Venda"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/univenda.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UniVen Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });


        }
        else if(currentItem.getmText1().equals("Central University of Technology"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/cut.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"CUT Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e)
                {
                }
            });
            return;
        }
        else if(currentItem.getmText1().equals("Cape Peninsula University of Technology "))
        {


            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/cput.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"CPUT Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;

        }
        else if(currentItem.getmText1().equals("Durban University of Technology"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/dut.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"DUT Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e)
                {
                }
            });
            return;

        }
        else if(currentItem.getmText1().equals("Mangosuthu University of Technology"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/MUT.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"MUT Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });

        }
        else if(currentItem.getmText1().equals("Vaal University of Technology"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/prospectus/vut.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"VUT Prospectus",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            return;
        }
    }
    private void downloadfiles(Context context, String fileName, String fileExtension, String destinationDirectory, String url)
    {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


    public void filterList(ArrayList<CareerItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}