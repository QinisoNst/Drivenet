package com.drivenet.rsa.wantedcode.download.apply.Adapter;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
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

public class ApplyAdapter1 extends RecyclerView.Adapter<ApplyAdapter1.ExampleViewHolder> {
    private ArrayList<ApplyItem1> mExampleList;
    private FirebaseStorage firebaseStorage;
    private StorageReference storageReference;
    private StorageReference ref;

    private Context context;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView head1, head2;
        public TextView button;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            head1 = itemView.findViewById(R.id.head1);
            button = itemView.findViewById(R.id.button);
            head2 = itemView.findViewById(R.id.online);
        }
    }

    public ApplyAdapter1(ArrayList<ApplyItem1> exampleList , Context context) {
        mExampleList = exampleList;
        this.context = context;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_apply ,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ApplyItem1 currentItem = mExampleList.get(position);

        holder.head1.setText(currentItem.getmText1());
        holder.head2.setText(currentItem.getmText3());
        holder.button.setText(currentItem.getmText2());
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
        holder.head2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2(currentItem);
            }
        });
    }

    private void show(ApplyItem1 currentItem)
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

    private void show2(ApplyItem1 currentItem)
    {
        if((currentItem.getmText1().equals("University of Cape Town")))
        {
            String url = "https://publicaccess.uct.ac.za/psp/public/EMPLOYEE/SA/c/UCT_PUBLIC_MENU.UCT_SS_APPL.GBL?";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of the Witwatersrand"))
        {
            String url = "https://self-service.wits.ac.za/psc/csprodonl/UW_SELF_SERVICE/SA/c/VC_OA_LOGIN_MENU.VC_OA_LOGIN_FL.GBL?&";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of the Western Cape"))
        {
            String url = "https://ross.ru.ac.za/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Sol Plaatje University"))
        {
            String url = "https://www.spu.ac.za/index.php/how-to-apply/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Rhodes University"))
        {
            String url = "https://www.ru.ac.za/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of the Free State"))
        {
            String url = "https://apply.ufs.ac.za/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Pretoria"))
        {
            String url = "https://www.up.ac.za/online-application";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of KwaZulu-Natal"))
        {
            String url = "http://applications.ukzn.ac.za/ApplicationProcedures/Postgraduate-Applicants/Online-Application.aspx";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Johannesburg"))
        {
            String url = "https://online.uj.ac.za/apply-online-uj/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("North-West University" ))
        {
            String url = "https://ross.ru.ac.za/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Nelson Mandela University"))
        {
            String url = "https://www.mandela.ac.za/Study-at-Mandela/Application/Apply-Undergraduate";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of South Africa"))
        {
            String url = "https://www.unisa.ac.za/sites/corporate/default/Apply-for-admission/TVET-colleges/Apply-&-register";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Zululand"))
        {
            String url = "http://www.unizulu.ac.za/student-zone/apply/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Walter Sisulu University for Technology"))
        {
            String url = "https://www.wsu.ac.za/index.php/study-with-us/undergraduate-academic-programmes/new-undergraduate-students/how-to-apply-the-process";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Limpopo"))
        {
            String url = "https://www.ul.ac.za/online/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Fort Hare"))
        {
            String url = "https://www.ufh.ac.za/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Sefako Makgatho Health Sciences University"))
        {
            String url = "https://www.smu.ac.za/students/online-application/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Mpumalanga"))
        {
            String url = "https://www.ump.ac.za/Study-with-us/Application-Process/Online-Applications";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Tshwane University of Technology"))
        {
            String url = "https://tutprodi4ie.tut.ac.za/pls/prodi41/gen.gw1pkg.gw1view";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Venda"))
        {
            String url = "https://ross.ru.ac.za/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Central University of Technology"))
        {
            String url = "https://www.cut.ac.za/application-process";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Stellenbosch University"))
        {
            String url = "http://www.sun.ac.za/english/maties/apply";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Cape Peninsula University of Technology "))
        {
            String url = "https://www.cput.ac.za/study/apply/step-4-online-application";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Durban University of Technology"))
        {
            String url = "https://www.dut.ac.za/student_portal/student_registration/how_to/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Mangosuthu University of Technology"))
        {
            String url = "https://www.mut.ac.za/how-to-apply-to-mut/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Vaal University of Technology"))
        {
            String url = "https://www.vut.ac.za/apply-to-vut/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
    }

    private void show1(ApplyItem1 currentItem)
    {
        if((currentItem.getmText1().equals("University of Cape Town")))
        {
            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/applicationform/uct.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UCT Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        }
        else if(currentItem.getmText1().equals("University of the Witwatersrand"))
        {
            String url = "https://self-service.wits.ac.za/psc/csprodonl/UW_SELF_SERVICE/SA/c/VC_OA_LOGIN_MENU.VC_OA_LOGIN_FL.GBL?&";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of the Western Cape"))
        {
            String url = "https://ross.ru.ac.za/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Sol Plaatje University"))
        {
            storageReference = firebaseStorage.getInstance().getReference();
            ref = storageReference.child("southafrica/university/applicationform/spu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"SPU Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
                ref=storageReference.child("southafrica/university/applicationform/ru.pdf");
                ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri)
                    {
                        String url = uri.toString();
                        downloadfiles(context,"RU Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            ref=storageReference.child("southafrica/university/applicationform/ufs.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UFS Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            String url = "https://www.up.ac.za/online-application";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of KwaZulu-Natal"))
        {
            String url = "http://applications.ukzn.ac.za/ApplicationProcedures/Postgraduate-Applicants/Online-Application.aspx";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Johannesburg"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/applicationform/uj.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UJ Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            ref=storageReference.child("southafrica/university/applicationform/nws.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"NWU Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            ref=storageReference.child("southafrica/university/applicationform/nmu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"NMU Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
            
        }
        else if(currentItem.getmText1().equals("University of South Africa"))
        {
            String url = "https://www.unisa.ac.za/sites/corporate/default/Apply-for-admission/TVET-colleges/Apply-&-register";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Zululand"))
        {
            String url = "http://www.unizulu.ac.za/student-zone/apply/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Walter Sisulu University for Technology"))
        {
            String url = "https://www.wsu.ac.za/index.php/study-with-us/undergraduate-academic-programmes/new-undergraduate-students/how-to-apply-the-process";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Limpopo"))
        {
            String url = "https://www.ul.ac.za/online/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Fort Hare"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/applicationform/ufh.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UFH Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            ref=storageReference.child("southafrica/university/applicationform/smu.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"SMU Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            String url = "http://www.sun.ac.za/english/maties/apply";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("University of Mpumalanga"))
        {
            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/applicationform/ump.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UMP Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            ref=storageReference.child("southafrica/university/applicationform/tut.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"TUT Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            ref=storageReference.child("southafrica/university/applicationform/univenda.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"UniVen Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
                }


            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });

            
        }
        else if(currentItem.getmText1().equals("Central University of Technology"))
        {
            String url = "https://www.cut.ac.za/application-process";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Cape Peninsula University of Technology "))
        {


            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/applicationform/cput.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"CPUT Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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
            String url = "https://www.dut.ac.za/student_portal/student_registration/how_to/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Mangosuthu University of Technology"))
        {
            String url = "https://www.mut.ac.za/how-to-apply-to-mut/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            context.startActivity(i);
        }
        else if(currentItem.getmText1().equals("Vaal University of Technology"))
        {

            storageReference = firebaseStorage.getInstance().getReference();
            ref=storageReference.child("southafrica/university/applicationform/vut.pdf");
            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri)
                {
                    String url = uri.toString();
                    downloadfiles(context,"VUT Course Form",".pdf",DIRECTORY_DOWNLOADS,url);
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

    
    public void filterList(ArrayList<ApplyItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}