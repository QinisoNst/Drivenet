package com.drivenet.rsa.wantedcode.aps;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.homefragments.HomeFragment1;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.List;

public class Aps1 extends Fragment {
    private TextView lan2,sub1,sub2,sub3;
    private EditText mEditText1, mEditText2 ,mEditText3 ,mEditText4 ,mEditText5, mEditText6 ,mEditText7;
    private Button submit;
    private List<Student> students;
    private static final String TAG = "Aps1";
    private FirebaseAnalytics mFirebaseAnalytics;
    private MainActivity mainActivity = new MainActivity();
    private String prevStarted = "yes";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_aps2, container, false);
        lan2 = view.findViewById(R.id.lan2);
        sub1 = view.findViewById(R.id.sub1);
        sub2 = view.findViewById(R.id.sub2);
        sub3 = view.findViewById(R.id.sub3);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
        students = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();

        int eng =0;
        int lang =0;
        int mahts =0;
        int lo =0;
        int subject1 =0;
        int subject2 =0;
        int subject3 =0;
        String Langa="";
        String sub1a="";
        String sub2a="";
        String sub3a="";

        for(Student usr : students)
        {

            mahts = usr.getMaths();
            eng = usr.getEnglish();
            lo = usr.getLo();
            lang = usr.getLanguage();
            subject1 = usr.getSubject1();
            subject2 = usr.getSubject2();
            subject3 = usr.getSubject3();
            Langa = usr.getLang();
            sub1a = usr.getSub1();
            sub2a = usr.getSub2();
            sub3a = usr.getSub3();
        }

        mEditText1 = view.findViewById(R.id.edittext_number_1);
        mEditText2 = view.findViewById(R.id.edittext_number_2);
        mEditText3 = view.findViewById(R.id.edittext_number_3);
        mEditText4 = view.findViewById(R.id.edittext_number_4);
        mEditText5 = view.findViewById(R.id.edittext_number_5);
        mEditText6 = view.findViewById(R.id.edittext_number_6a);
        mEditText7 = view.findViewById(R.id.edittext_number_7a);

        submit = view.findViewById(R.id.Submit);

        mEditText1.setHint(mahts+"");
        mEditText2.setHint(eng+"");
        mEditText3.setHint(lo+"");
        mEditText4.setHint(lang+"");
        mEditText5.setHint(subject1+"");
        mEditText6.setHint(subject2+"");
        mEditText7.setHint(subject3+"");


      //  subeject sub = new subeject();

        lan2.setText(Langa);
        sub1.setText(sub1a);
        sub2.setText(sub2a);
        sub3.setText(sub3a);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (mEditText1.getText().toString().length() == 0)
                {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }
                if (mEditText3.getText().toString().length() == 0)
                {
                    mEditText3.setText("0");
                }
                if (mEditText4.getText().toString().length() == 0)
                {
                    mEditText4.setText("0");
                }
                if (mEditText5.getText().toString().length() == 0)
                {
                    mEditText5.setText("0");
                }
                if (mEditText6.getText().toString().length() == 0)
                {
                    mEditText6.setText("0");
                }
                if (mEditText7.getText().toString().length() == 0)
                {
                    mEditText7.setText("0");
                }

                int num1; int num2; int num3; int num4; int num5; int num6; int num7;

                num1 = Integer.parseInt(mEditText1.getText().toString());
                num2 = Integer.parseInt(mEditText2.getText().toString());
                num3 = Integer.parseInt(mEditText3.getText().toString());
                num4 = Integer.parseInt(mEditText4.getText().toString());
                num5 = Integer.parseInt(mEditText5.getText().toString());
                num6 = Integer.parseInt(mEditText6.getText().toString());
                num7 = Integer.parseInt(mEditText7.getText().toString());
                Double num1a = new Double(num1);
                Double num2a = new Double(num2);
                Double num3a = new Double(num3);
                Double num4a = new Double(num4);
                Double num5a = new Double(num5);
                Double num6a = new Double(num6);
                Double num7a = new Double(num7);


                    if (num1 > 2000 |num1 == 0 )
                    {
                    mEditText1.setError("Please add the correct Percentage");
                    }
                    else if (num2 > 2000 |num2 == 0 )
                    {
                    mEditText2.setError("Please add the correct Percentage");
                    }
                    else if (num3 > 2000 |num3 == 0 )
                    {
                    mEditText3.setError("Please add the correct Percentage");
                    }
                    else if (num4 > 2000 |num4 == 0 )
                    {
                    mEditText4.setError("Please add the correct Percentage");
                    }
                    else if (num5 > 2000 |num5 == 0 )
                    {
                    mEditText5.setError("Please add the correct Percentage");
                    }
                    else if (num6 > 2000 |num6 == 0 )
                    {
                        mEditText6.setError("Please add the correct Percentage");
                    }
                    else if (num7 > 2000 |num7 == 0 )
                    {
                    mEditText7.setError("Please add the correct Percentage");
                    }
                else {
                        Login(v);
                        MainActivity.fragmentManager.beginTransaction().setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).replace(R.id.fragment_container, new HomeFragment1()).addToBackStack(null).commit();
                        VisionDatabase.getDatabase(getContext()).getUpdate().subjects(num1, num2, num3,num4,num5,num6,num7);
                        VisionDatabase.getDatabase(getContext()).getUpdate().fomula(
                                Fomula1(num1,num2,num3,num4,num5,num6,num7),
                                Fomula2(num1,num2,num3,num4,num5,num6,num7),
                                Fomula3(num1,num2,num3,num4,num5,num6,num7),
                                Fomula4(num1a,num2a,num3a,num4a,num5a,num6a,num7a),
                                Fomula5(num1,num2,num3,num4,num5,num6,num7),
                                Fomula6(num1,num2,num3,num4,num5,num6,num7),
                                Fomula7(num1,num2,num3,num4,num5,num6,num7),
                                Fomula8(num1,num2,num3,num4,num5,num6,num7));
                        share();
            }
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
            case R.id.Submit1:
                btnName = "Submit_sub";
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

    public void share()
    {
        SharedPreferences sharedpreferences = getSharedPreferencesa(getContext());
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean(prevStarted, Boolean.TRUE);
        editor.apply();
    }

    private SharedPreferences getSharedPreferencesa(Context context) {
        SharedPreferences LastSelect = context.getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        return LastSelect;
    }

    private int Fomula1(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6,int sub7)
    {
        int sub1a=0;  int sub2a=0;  int sub3a=0;  int sub4a=0;
        int sub5a=0;   int sub6a=0;  int sub7a=0;

        if(sub1 >= 80){sub1a = 7;}
        else if(sub1 >= 70){sub1a = 6;} else if(sub1 >= 60){sub1a = 5;} else if(sub1 >= 50){sub1a = 4;}
        else if(sub1 >= 40){sub1a = 3;} else if(sub1 >= 30){sub1a = 2;} else {sub1a =1;}

        if(sub2 >= 80){sub2a = 7;}
        else if(sub2 >= 70){sub2a = 6;} else if(sub2 >= 60){sub2a = 5;} else if(sub2 >= 50){sub2a = 4;}
        else if(sub2 >= 40){sub2a = 3;} else if(sub2 >= 30){sub2a = 2;} else {sub2a =1;}

        if(sub3 >= 80){sub3a = 0;}
        else if(sub3 >= 70){sub3a = 0;} else if(sub3 >= 60){sub3a = 0;} else if(sub3 >= 0){sub3a = 0;}
        else if(sub3 >= 40){sub3a = 0;} else if(sub3 >= 30){sub3a = 0;} else {sub3a =0;}

        if(sub4 >= 80){sub4a = 7;}
        else if(sub4 >= 70){sub4a = 6;} else if(sub4 >= 60){sub4a = 5;} else if(sub4 >= 50){sub4a = 4;}
        else if(sub4 >= 40){sub4a = 3;} else if(sub4 >= 30){sub4a = 2;} else {sub4a =1;}

        if(sub5 >= 80){sub5a = 7;}
        else if(sub5 >= 70){sub5a = 6;} else if(sub5 >= 60){sub5a = 5;} else if(sub5 >= 50){sub5a = 4;}
        else if(sub5 >= 40){sub5a = 3;} else if(sub5 >= 30){sub5a = 2;} else {sub5a =1;}

        if(sub6 >= 80){sub6a = 7;}
        else if(sub6 >= 70){sub6a = 6;} else if(sub6 >= 60){sub6a = 5;} else if(sub6 >= 50){sub6a = 4;}
        else if(sub6 >= 40){sub6a = 3;} else if(sub6 >= 30){sub6a = 2;} else {sub6a =1;}

        if(sub7 >= 80){sub7a = 7;}
        else if(sub7 >= 70){sub7a = 6;} else if(sub7 >= 60){sub7a = 5;} else if(sub7 >= 50){sub7a = 4;}
        else if(sub7 >= 40){sub7a = 3;} else if(sub7 >= 30){sub7a = 2;} else {sub7a =1;}
        return (sub1a+sub2a+sub3a+sub4a+sub5a+sub6a+sub7a);
    }

    private int Fomula2(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6,int sub7)
    {
        int sub1b=0;  int sub2b=0;  int sub3b=0;  int sub4b=0;
        int sub5b=0;   int sub6b=0;  int sub7b=0;

        if (sub1 >= 90){sub1b = 8;}     else if(sub1 >= 80){sub1b = 7;}
        else if(sub1 >= 70){sub1b = 6;} else if(sub1 >= 60){sub1b = 5;} else if(sub1 >= 50){sub1b = 4;}
        else if(sub1 >= 40){sub1b = 3;} else if(sub1 >= 30){sub1b = 2;} else {sub1b =1;}

        if (sub2 >= 90){sub2b = 8;}    else if(sub2 >= 80){sub2b = 7;}
        else if(sub2 >= 70){sub2b = 6;} else if(sub2 >= 60){sub2b = 5;} else if(sub2 >= 50){sub2b = 4;}
        else if(sub2 >= 40){sub2b = 3;} else if(sub2 >= 30){sub2b = 2;} else {sub2b =1;}

        if (sub3 >= 90){sub3b = 0;}    else if(sub3 >= 80){sub3b = 0;}
        else if(sub3 >= 70){sub3b = 0;} else if(sub3 >= 60){sub3b = 0;} else if(sub3 >= 50){sub3b = 0;}
        else if(sub3 >= 40){sub3b = 0;} else if(sub3 >= 30){sub3b = 0;} else {sub3b =0;}

        if (sub4 >= 90){sub4b = 8;}    else if(sub4 >= 80){sub1b = 7;}
        else if(sub4 >= 70){sub4b = 6;} else if(sub4 >= 60){sub4b = 5;} else if(sub4 >= 50){sub4b = 4;}
        else if(sub4 >= 40){sub4b = 3;} else if(sub4 >= 30){sub4b = 2;} else {sub4b =1;}

        if (sub5 >= 90){sub5b = 8;}    else if(sub5 >= 80){sub1b = 7;}
        else if(sub5 >= 70){sub5b = 6;} else if(sub5 >= 60){sub5b = 5;} else if(sub5 >= 50){sub5b = 4;}
        else if(sub5 >= 40){sub5b = 3;} else if(sub5 >= 30){sub5b = 2;} else {sub5b =1;}

        if (sub6 >= 90){sub6b = 8;}    else if(sub6 >= 80){sub6b = 7;}
        else if(sub6 >= 70){sub6b = 6;} else if(sub6 >= 60){sub6b = 5;} else if(sub6 >= 50){sub6b = 4;}
        else if(sub6 >= 40){sub6b = 3;} else if(sub6 >= 30){sub6b = 2;} else {sub6b =1;}

        if (sub7 >= 90){sub7b = 8;}     else if(sub7 >= 80){sub7b = 7;}
        else if(sub7 >= 70){sub7b = 6;} else if(sub7 >= 60){sub7b = 5;} else if(sub7 >= 50){sub7b = 4;}
        else if(sub7 >= 40){sub7b = 3;} else if(sub7 >= 30){sub7b = 2;} else {sub7b =1;}
        return (sub1b+sub2b+sub3b+sub4b+sub5b+sub6b+sub7b);

    }

    private int Fomula3(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6,int sub7)
    {
        int sub1c=0;  int sub2c=0;  int sub3c=0;  int sub4c=0;
        int sub5c=0;   int sub6c=0;  int sub7c=0;

        sub1c = sub1;
        sub2c = sub2;
        sub3c = 0;
        sub4c = sub4;
        sub5c = sub5;
        sub6c = sub6;
        sub7c = sub7;

        return (sub1c+sub2c+sub3c+sub4c+sub5c+sub6c+sub7c);

    }

    private double Fomula4(Double sub1,Double sub2,Double sub3,Double sub4,Double sub5,Double sub6,Double sub7)
    {
        double sub1d=0;  double sub2d=0;  double sub3d=0;  double sub4d=0;
        double sub5d=0;  double sub6d=0;  double sub7d=0;

        sub1d = sub1/10;
        sub2d = sub2/10;
        sub3d = 0;
        sub4d = sub4/10;
        sub5d = sub5/10;
        sub6d = sub6/10;
        sub7d = sub7/10;

        return (sub1d+sub2d+sub3d+sub4d+sub5d+sub6d+sub7d);
    }

    private int Fomula5(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6,int sub7)
    {
        int eng1=0;  int math1=0;  int lo1=0;  int sub4e=0;
        int sub5e=0;   int sub6e=0;  int sub7e=0;

        if (sub1 >= 90){eng1 = 15;}     else if(sub1 >= 80){eng1 = 13;}
        else if(sub1 >= 70){eng1 = 11;} else if(sub1 >= 60){eng1 = 9;}   else if(sub1 >= 50){eng1 = 3;}
        else if(sub1 >= 40){eng1 = 1;} else {eng1 =0;}

        if (sub2 >= 90){math1 = 15;}    else if(sub2 >= 80){math1 = 13;}
        else if(sub2 >= 70){math1 = 11;} else if(sub2 >= 60){math1 = 9;} else if(sub2 >= 50){math1 = 3;}
        else if(sub2 >= 40){math1= 1;} else {math1 =0;}

        if(sub3 >= 90){lo1 = 3;}        else if(sub3 >= 80){lo1 = 3;}  else if(sub3 >= 70){lo1 = 2;} else if(sub3 >= 60){lo1 = 2;}
        else if(sub3 >= 50){lo1 = 2;}   else if(sub1 >= 40) {lo1 = 1;} else if(sub1 >= 30){lo1 = 1;} else if(sub1 >= 20) {lo1 = 1;}
        else {lo1 =0;}

        if (sub4 >= 90){sub4e = 8;}    else if(sub4 >= 80){sub4e = 7;}
        else if(sub4 >= 70){sub4e = 6;} else if(sub4 >= 60){sub4e = 5;} else if(sub4 >= 50){sub4e = 4;}
        else if(sub4 >= 40){sub4e = 3;} else {sub4e =0;}

        if (sub5 >= 90){sub5e = 8;}    else if(sub5 >= 80){sub5e = 7;}
        else if(sub5 >= 70){sub5e = 6;} else if(sub5 >= 60){sub5e = 5;} else if(sub5 >= 50){sub5e = 4;}
        else if(sub5 >= 40){sub5e = 3;} else {sub5e =0;}

        if (sub6 >= 90){sub6e = 8;}   else if(sub6 >= 80){sub6e = 7;}
        else if(sub6 >= 70){sub6e= 6;} else if(sub6 >= 60){sub6e = 5;} else if(sub6 >= 50){sub6e = 4;}
        else if(sub6 >= 40){sub6e = 3;} else {sub6e =0;}

        if (sub7>= 90){sub7e = 8;}      else if(sub7 >= 80){sub7e = 7;}
        else if(sub7 >= 70){sub7e = 6;} else if(sub7 >= 60){sub7e = 5;} else if(sub7 >= 50){sub7e = 4;}
        else if(sub7 >= 40){sub7e = 3;} else {sub7e =0;}

        return (eng1+math1+lo1+sub4e+sub5e+sub6e+sub7e);
    }

    private int Fomula6(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6,int sub7)
    {
        int eng2=0;  int math2=0;  int lo2=0;  int sub4f=0;
        int sub5f=0;   int sub6f=0;  int sub7f=0;

        if (sub1 >= 90){eng2 = 8+2;}     else if(sub1 >= 80){eng2 = 7+2;}
        else if(sub1 >= 70){eng2 = 6+2;} else if(sub1 >= 60){eng2 = 5+2;}   else if(sub1 >= 50){eng2 = 4;}
        else if(sub1 >= 40){eng2 = 3;} else {eng2 =0;}

        if (sub2 >= 90){math2 = 8+2;}    else if(sub2 >= 80){math2 = 7+2;}
        else if(sub2 >= 70){math2 = 6+2;} else if(sub2 >= 60){math2 = 5+2;} else if(sub2 >= 50){math2 = 4;}
        else if(sub2 >= 40){math2 = 3;} else {math2 =0;}

        if(sub3 >= 90){lo2 = 4;}          else if(sub3 >= 80){lo2 = 3;}     else if(sub3 >= 70){lo2 = 2;}
        else if(sub1 >= 60) {lo2 = 1;}
        else {lo2 =0;}

        if (sub4 >= 90){sub4f = 8;}    else if(sub4 >= 80){sub4f = 7;}
        else if(sub4 >= 70){sub4f = 6;} else if(sub4 >= 60){sub4f = 5;} else if(sub4 >= 50){sub4f = 4;}
        else if(sub4 >= 40){sub4f = 3;} else {sub4f =0;}

        if (sub5 >= 90){sub5f = 8;}    else if(sub5 >= 80){sub5f = 7;}
        else if(sub5 >= 70){sub5f = 6;} else if(sub5 >= 60){sub5f = 5;} else if(sub5 >= 50){sub5f = 4;}
        else if(sub5 >= 40){sub5f = 3;} else {sub5f =0;}

        if (sub6 >= 90){sub6f = 8;}    else if(sub6 >= 80){sub6f = 7;}
        else if(sub6 >= 70){sub6f = 6;} else if(sub6 >= 60){sub6f = 5;} else if(sub6 >= 50){sub6f = 4;}
        else if(sub6 >= 40){sub6f = 3;} else {sub6f =0;}

        if (sub7>= 90){sub7f = 8;}      else if(sub7 >= 80){sub7f = 7;}
        else if(sub7 >= 70){sub7f = 6;} else if(sub7 >= 60){sub7f = 5;} else if(sub7 >= 50){sub7f = 4;}
        else if(sub7 >= 40){sub7f = 3;} else {sub7f =0;}

        return (eng2+math2+lo2+sub4f+sub5f+sub6f+sub7f);
    }
    private int Fomula7(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6,int sub7)
    {
        int eng3=0;  int math3=0;  int lo3=0;  int sub4g=0;
        int sub5g=0;   int sub6g=0;  int sub7g=0;

        if (sub1 >= 90){eng3 = 8+2;}     else if(sub1 >= 80){eng3 = 7+2;}
        else if(sub1 >= 70){eng3 = 6+2;} else if(sub1 >= 60){eng3 = 5+2;}   else if(sub1 >= 50){eng3 = 4+1;}
        else if(sub1 >= 40){eng3 = 3+1;} else if(sub1 >= 30){eng3 = 2;}     else {eng3 =1;}

        if (sub2 >= 90){math3 = 8+2;}    else if(sub2 >= 80){math3 = 7+2;}
        else if(sub2 >= 70){math3 = 6+2;} else if(sub2 >= 60){math3 = 5+2;} else if(sub2 >= 50){math3 = 4+1;}
        else if(sub2 >= 40){math3 = 3+1;} else if(sub2 >= 30){math3 = 2;}   else {math3 =1;}

        if(sub3 >= 90){lo3 = 4;}          else if(sub3 >= 80){lo3 = 3;}     else if(sub3 >= 70){lo3 = 2;}
        else if(sub1 >= 60) {lo3 = 1;}
        else {lo3 =0;}

        if (sub4 >= 90){sub4g = 8;}    else if(sub4 >= 80){sub4g = 7;}
        else if(sub4 >= 70){sub4g = 6;} else if(sub4 >= 60){sub4g = 5;} else if(sub4 >= 50){sub4g = 4;}
        else if(sub4 >= 40){sub4g = 3;} else if(sub2 >= 30){sub4g = 2;} else {sub4g =1;}

        if (sub5 >= 90){sub5g = 8;}    else if(sub5 >= 80){sub5g = 7;}
        else if(sub5 >= 70){sub5g = 6;} else if(sub5 >= 60){sub5g = 5;} else if(sub5 >= 50){sub5g = 4;}
        else if(sub5 >= 40){sub5g = 3;} else if(sub2 >= 30){sub5g = 2;} else {sub5g =1;}

        if (sub6 >= 90){sub6g = 8;}    else if(sub6 >= 80){sub6g = 7;}
        else if(sub6 >= 70){sub6g = 6;} else if(sub6 >= 60){sub6g = 5;} else if(sub6 >= 50){sub6g = 4;}
        else if(sub6 >= 40){sub6g = 3;} else if(sub2 >= 30){sub6g = 2;} else {sub6g =1;}

        if (sub7>= 90){sub7g = 8;}      else if(sub7 >= 80){sub7g = 7;}
        else if(sub7 >= 70){sub7g = 6;} else if(sub7 >= 60){sub7g = 5;} else if(sub7 >= 50){sub7g = 4;}
        else if(sub7 >= 40){sub7g = 3;} else if(sub7 >= 30){sub7g = 2;} else {sub7g =1;}

        return (eng3+math3+lo3+sub4g+sub5g+sub6g+sub7g);
    }
    private int Fomula8(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6,int sub7)
    {
        int eng3=0;  int math3=0;  int lo3=0;  int sub4g=0;
        int sub5g=0;   int sub6g=0;  int sub7g=0;

        if (sub1 >= 90){eng3 = 8;}     else if(sub1 >= 80){eng3 = 7;}
        else if(sub1 >= 70){eng3 = 6;} else if(sub1 >= 60){eng3 = 5;}   else if(sub1 >= 50){eng3 = 4;}
        else if(sub1 >= 40){eng3 = 3;} else if(sub1 >= 30){eng3 = 2;}     else {eng3 =1;}

        if (sub2 >= 90){math3 = 8;}    else if(sub2 >= 80){math3 = 7;}
        else if(sub2 >= 70){math3 = 6;} else if(sub2 >= 60){math3 = 5;} else if(sub2 >= 50){math3 = 4;}
        else if(sub2 >= 40){math3 = 3;} else if(sub2 >= 30){math3 = 2;}   else {math3 =1;}

        if(sub3 >= 90){lo3 = 8;}        else if(sub3 >= 80){lo3 = 7;}  else if(sub3 >= 70){lo3 = 6;} else if(sub3 >= 60){lo3 = 5;}
        else if(sub3 >= 50){lo3 = 4;}   else if(sub1 >= 40) {lo3 = 3;} else if(sub1 >= 30){lo3 = 2;}
        else {lo3 =0;}

        if (sub4 >= 90){sub4g = 8;}    else if(sub4 >= 80){sub4g = 7;}
        else if(sub4 >= 70){sub4g = 6;} else if(sub4 >= 60){sub4g = 5;} else if(sub4 >= 50){sub4g = 4;}
        else if(sub4 >= 40){sub4g = 3;} else if(sub2 >= 30){sub4g = 2;} else {sub4g =1;}

        if (sub5 >= 90){sub5g = 8;}    else if(sub5 >= 80){sub5g = 7;}
        else if(sub5 >= 70){sub5g = 6;} else if(sub5 >= 60){sub5g = 5;} else if(sub5 >= 50){sub5g = 4;}
        else if(sub5 >= 40){sub5g = 3;} else if(sub2 >= 30){sub5g = 2;} else {sub5g =1;}

        if (sub6 >= 90){sub6g = 8;}    else if(sub6 >= 80){sub6g = 7;}
        else if(sub6 >= 70){sub6g = 6;} else if(sub6 >= 60){sub6g = 5;} else if(sub6 >= 50){sub6g = 4;}
        else if(sub6 >= 40){sub6g = 3;} else if(sub2 >= 30){sub6g = 2;} else {sub6g =1;}

        if (sub7>= 90){sub7g = 8;}      else if(sub7 >= 80){sub7g = 7;}
        else if(sub7 >= 70){sub7g = 6;} else if(sub7 >= 60){sub7g = 5;} else if(sub7 >= 50){sub7g = 4;}
        else if(sub7 >= 40){sub7g = 3;} else if(sub7 >= 30){sub7g = 2;} else {sub7g =1;}

        return (eng3+math3+lo3+sub4g+sub5g+sub6g+sub7g);
    }
    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
    //    requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
      //  requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
