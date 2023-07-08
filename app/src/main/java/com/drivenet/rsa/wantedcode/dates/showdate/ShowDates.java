package com.drivenet.rsa.wantedcode.dates.showdate;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.wantedcode.dates.showdate.Adapter.ShowAdapter1;
import com.drivenet.rsa.wantedcode.dates.showdate.Adapter.Showtem1;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class ShowDates extends Fragment {
    private TextView textView;
    private ArrayList<Showtem1> mExampleList;
    private RecyclerView mRecyclerView;
    private ShowAdapter1 mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Student> students;
    private AdView mAdView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_show_aps1, container, false);
        createExampleList();
        buildRecyclerView(view);

        textView = (TextView)view.findViewById(R.id.textView);
        textView.setText("Key Date(s)");
        EditText editText = view.findViewById(R.id.edittext);
        editText.setHint("Programs");
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        return view;
    }

    private void filter(String text)
    {
        ArrayList<Showtem1> filteredList = new ArrayList<>();
        for (Showtem1 item : mExampleList)
        {
            if (item.getmText3().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        mAdapter.filterList(filteredList);
    }

    private void createExampleList()
    {
        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();

        String username =" ";

        for(Student usr : students)
        {

            username = usr.getUni();
        }
        if (username.equals("University of Cape Town"))
        {
        mExampleList = new ArrayList<>();
        mExampleList.add(new Showtem1(username,"1 May","31 August","All Undergraduate programmes"));
        }
        else if(username.equals("Nelson Mandela University"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"3 May","5 August","Early applications (excluding MBChB)"));
            mExampleList.add(new Showtem1(username,"3 May","30 September","Late applications (excluding MBChB)"));
            mExampleList.add(new Showtem1(username,"3 May","30 September","International student applications (excluding MBChB)"));

        }
        else if(username.equals("University of Fort Hare"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"3 May","29th October","Early closing date"));
            mExampleList.add(new Showtem1(username,"3 May","1st November","Late closing date"));
            mExampleList.add(new Showtem1(username,"3 May","30th November","Late closing date"));
        }
        else if(username.equals("North-West University"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"15 April","31 July","Pharmacy"));
            mExampleList.add(new Showtem1(username,"15 April","31 July","All other selection courses"));
            mExampleList.add(new Showtem1(username,"15 April","31 July","Graphic Design"));
            mExampleList.add(new Showtem1(username,"15 April","31 July","Music"));
            mExampleList.add(new Showtem1(username,"15 April","30 September","Non-selection courses"));
            mExampleList.add(new Showtem1(username,"15 April","30 September","Engineering"));
            mExampleList.add(new Showtem1(username,"15 April","30 September","Engineering"));
            mExampleList.add(new Showtem1(username,"15 April","30 September","Occupational Hygiene"));
            mExampleList.add(new Showtem1(username,"15 April","30 September","Urban and Regional planning"));
        }

        else if(username.equals("University of the Free State"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","31 May","MBChB, Radiation Sciences, Optometry"));
            mExampleList.add(new Showtem1(username,"1 April","31 May","Physiotherapy, Occupational Therapy, Dietetics"));
            mExampleList.add(new Showtem1(username,"1 April","31 May","Biokinetics, and Sports Coaching"));
            mExampleList.add(new Showtem1(username,"1 April","31 July","Architecture, Quantity Surveying, Social Work"));
            mExampleList.add(new Showtem1(username,"1 April","31 July","Nursing, and Construction Management"));
            mExampleList.add(new Showtem1(username,"1 April","31 August","International undergraduate applications"));
            mExampleList.add(new Showtem1(username,"1 July","31 August","UAPs on the South Campus and its sub-regions"));
            mExampleList.add(new Showtem1(username,"1 April","1 September","Fine Arts"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","Drama and Theatre Arts, Geology"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","Forensic Sciences, Actuarial Science"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","Physics with Engineering Sciences, Music"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","Community Development (QQ only)"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","Transfer students"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","all non-selection programs"));
        }
        else if(username.equals("University of South Africa"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"11th August","12th November","Undergraduate qualifications"));
        }
        else if(username.equals("Rhodes University"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","30 November","All new students for admission"));
        }
        else if(username.equals("University of Johannesburg"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","30 September","Undergraduate qualifications"));
        }
        else if(username.equals("University of the Western Cape"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"15 May","30 September","All new students for admission"));
        }
        else if(username.equals("University of KwaZulu-Natal"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 January","31 June","Medicine applicants"));
            mExampleList.add(new Showtem1(username,"1 January","30 September","All other programs"));
        }
        else if(username.equals("University of Pretoria"))
        {
            mExampleList = new ArrayList<>();

            mExampleList.add(new Showtem1(username,"1 May","31 July","BSc (Architecture) (South African citizens)"));

            mExampleList.add(new Showtem1(username,"1 May","31 July ","Faculty of Veterinary Science (South African citizens)"));
            mExampleList.add(new Showtem1(username,"1 May","31 July","Faculty of Health Sciences (South African citizens)"));

            mExampleList.add(new Showtem1(username,"1 May","30th September","LLB (South African citizens)"));
            mExampleList.add(new Showtem1(username,"1 May","30th September","BA (Law) – in the Faculty of Humanities (South African citizens)"));
            mExampleList.add(new Showtem1(username,"1 May","30th September","BCom (Law) – in the Faculty of Economic and Management Sciences (South African citizens)"));

            mExampleList.add(new Showtem1(username,"1 May","30th September","Faculty of Economic and Management Sciences (South African citizens)"));
            mExampleList.add(new Showtem1(username,"1 May","30th September","Faculty of Natural and Agricultural Scienc (South African citizens)e"));
            mExampleList.add(new Showtem1(username,"1 May","30th September","Faculty of Education"));
            mExampleList.add(new Showtem1(username,"1 May","30th September","Faculty of Engineering, Built Environment and Information Technology (South African citizens)"));

            mExampleList.add(new Showtem1(username,"1 May","30th September","Faculty of Law (South African citizens)"));
            mExampleList.add(new Showtem1(username,"1 May","30th September","Faculty of Humanities (South African citizens)"));
            mExampleList.add(new Showtem1(username,"1 May","30th September ","Faculty of Theology and Religion (South African citizens)"));
        }
        else if(username.equals("University of the Witwatersrand"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1st April","31 June","Faculty of Health Sciences"));
            mExampleList.add(new Showtem1(username,"1st April","31 June","Bachelor of Architecture; Bachelor of Audiology"));
            mExampleList.add(new Showtem1(username,"1st April","31 June","Bachelor of Speech-Language Pathology; BA Film and TV."));

            mExampleList.add(new Showtem1(username,"1st April","30 September","All other programs"));
        }
        else if(username.equals("University of Limpopo"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1st April","29 October","Undergraduate and Postgraduate Programmes (South African Students)"));
            mExampleList.add(new Showtem1(username,"1st April","29 October","Undergraduate and Postgraduate Programmes (MBChB)"));
            mExampleList.add(new Showtem1(username,"1st April","30 September","Undergraduate and Postgraduate Programmes (International Students)"));

            mExampleList.add(new Showtem1(username,"1st April","30 September","All other programs"));
        }
        else if(username.equals("University of Venda"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1st April","29 October","Undergraduate and Postgraduate Programmes (South African Students)"));
            mExampleList.add(new Showtem1(username,"1st April","29 October","Undergraduate and Postgraduate Programmes (MBChB)"));
            mExampleList.add(new Showtem1(username,"1st April","30 September","Undergraduate and Postgraduate Programmes (International Students)"));

            mExampleList.add(new Showtem1(username,"1st April","30 September","All other programs"));
        }
        else if(username.equals("University of Mpumalanga"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1st April","30 September","Bachelor of Education in Foundation Phase Teaching"));
            mExampleList.add(new Showtem1(username,"1st April","30th November","Other undergraduate courses"));
        }
        else if(username.equals("University of Zululand"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1st April","30 November","All other programs"));
        }
        else if(username.equals("Stellenbosch University"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"6th April","30th June","For all undergraduate programmes"));
            mExampleList.add(new Showtem1(username,"6th April","15th December","For all undergraduate programmes"));
        }
        else if(username.equals("SSefako Makgatho Health Sciences University"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1th April","25th June","B Radiography, B Dental Surgery, B Pharmacy, B Dental Therapy, MBChB, BSc Physiotherapy"));
            mExampleList.add(new Showtem1(username,"1th April","26th June","BSc, BSc Diet, B Speech-Language Pathology and Audiology, B Occupational Therapy, B Oral Hygiene, B Nursing Sciences"));
        }
        else if(username.equals("Cape Peninsula University of Technology"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"28 May","30th June","RPL applications for Undergraduate Studies and Advanced Diplomas"));
            mExampleList.add(new Showtem1(username,"28 May","30 September","Certificate and Higher Certificates"));
            mExampleList.add(new Showtem1(username,"28 May","30 September","B Ed Qualification"));
            mExampleList.add(new Showtem1(username,"28 May","30 September","Bachelor of Science"));
            mExampleList.add(new Showtem1(username,"28 May","30 September","Bachelor Degree, B Tech & Advanced Diploma"));
            mExampleList.add(new Showtem1(username,"28 May","30 September","Diploma and National Diploma"));
        }
        else if(username.equals("Durban University of Technology"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"28 May","30 September","All undergraduate programmes (Except Chiropractic)"));
            mExampleList.add(new Showtem1(username,"28 May","15 August","Chiropractic"));
        }
        else if(username.equals("Vaal University of Technology"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","31 October","All undergraduate programmes"));
        }
        else if(username.equals("Central University of Technology"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","29 October","International prospective students"));
            mExampleList.add(new Showtem1(username,"1 April","30 November","South African Applications"));
        }
        else if(username.equals("Tshwane University of Technology"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"18th June","30 September","All undergraduate programmes"));
        }
        else if(username.equals("Sol Plaatje University"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","30 November","All undergraduate programmes"));
        }
        else if(username.equals("Mangosuthu University of Technology"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","30 September","Faculty of Engineering (First semester applications)"));
            mExampleList.add(new Showtem1(username,"1 April","31 May","Faculty of Engineering (Second semester applications)"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","Faculty of Natural Sciences"));
            mExampleList.add(new Showtem1(username,"1 April","31 May","Analytical Chemistry (Second semester applications)"));
            mExampleList.add(new Showtem1(username,"1 April","30 September","Faculty of Management Sciences"));
        }
        else if(username.equals("Mangosuthu University of Technology"))
        {
            mExampleList = new ArrayList<>();
            mExampleList.add(new Showtem1(username,"1 April","30 September","Faculty of Health Sciences"));
            mExampleList.add(new Showtem1(username,"1 April","31 October","Other Faculties"));
        }
    }

    private void buildRecyclerView(View view) {
        mRecyclerView = view.findViewById(R.id.listview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getContext(),2);
        mAdapter = new ShowAdapter1(mExampleList,getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


}