package com.drivenet.rsa.wantedcode.Appling;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.wantedcode.aps.showaps.ShowAps;
import com.drivenet.rsa.database.Student.Applying;
import com.drivenet.rsa.database.Student.Student;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.homefragments.HomeFragment1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;


public class Applying3 extends Fragment  {
    private Button button;
    private List<Applying> applying;
    private List<Student> student;
    private FirebaseAnalytics mFirebaseAnalytics;
    private static final String TAG = "Applying3";
    private EditText EditText1,EditText2,EditText3,EditText4,EditText5,EditText6,EditText7,EditText8,EditText9,EditText10,EditText11;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apply_3, container, false);
        button = (Button) view.findViewById(R.id.Submit);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
        EditText1 = (EditText) view.findViewById(R.id.edittext_number_1a);
        EditText2 = (EditText) view.findViewById(R.id.edittext_number_2a);
        EditText3 = (EditText) view.findViewById(R.id.edittext_number_3a);
        EditText4 = (EditText) view.findViewById(R.id.edittext_number_4a);
        EditText5 = (EditText) view.findViewById(R.id.edittext_number_5a);
        EditText6 = (EditText) view.findViewById(R.id.edittext_number_6a);
        EditText7 = (EditText) view.findViewById(R.id.edittext_number_7a);
        EditText8 = (EditText) view.findViewById(R.id.edittext_number_8a);
        EditText9 = (EditText) view.findViewById(R.id.edittext_number_9a);
        EditText10 = (EditText) view.findViewById(R.id.edittext_number_10a);
        EditText11 = (EditText) view.findViewById(R.id.edittext_number_11a);

        applying = VisionDatabase.getDatabase(getContext()).getSelect().getAppling();
        student = VisionDatabase.getDatabase(getContext()).getSelect().getStudent();

        home();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (EditText1.getText().toString().equals(""))
                {
                    EditText1.setError("Place fill in missing info");
                }
                else if (EditText2.getText().toString().equals(""))
                {
                    EditText2.setError("Place fill in missing info");
                }
                else if (EditText3.getText().toString().equals(""))
                {
                    EditText3.setError("Place fill in missing info");
                }
                else if (EditText4.getText().toString().equals(""))
                {
                    EditText4.setError("Place fill in missing info");
                }
                else if (EditText5.getText().toString().equals(""))
                {
                    EditText5.setError("Place fill in missing info");
                }
                else if (EditText6.getText().toString().equals(""))
                {
                    EditText6.setError("Place fill in missing info");
                }
                else if (EditText7.getText().toString().equals(""))
                {
                    EditText7.setError("Place fill in missing info");
                }
                else if (EditText8.getText().toString().equals(""))
                {
                    EditText8.setError("Place fill in missing info");
                }
                else if (EditText9.getText().toString().equals(""))
                {
                    EditText9.setError("Place fill in missing info");
                }
                else if (EditText10.getText().toString().equals(""))
                {
                    EditText10.setError("Place fill in missing info");
                }
                else if (EditText11.getText().toString().equals(""))
                {
                    EditText11.setError("Place fill in missing info");
                }
                else
                {
                    VisionDatabase.getDatabase(getContext()).getUpdate().apply3
                            (
                                    EditText1.getText().toString(),EditText2.getText().toString(),
                                    EditText3.getText().toString(),EditText4.getText().toString(),
                                    Integer.parseInt(EditText5.getText().toString()),Integer.parseInt(EditText6.getText().toString()),
                                    Integer.parseInt(EditText7.getText().toString()),EditText8.getText().toString(),
                                    EditText9.getText().toString(),EditText10.getText().toString(),
                                    EditText11.getText().toString()
                            );
                    if(home1().equals("Applying"))
                    {
                        reload();
                        MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container , new ShowAps()).addToBackStack(null).commit();
                    }
                    else
                        {
                            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container , new HomeFragment1()).addToBackStack(null).commit();
                        }
                }
            }
        });
        return view;

    }

    private String home1()
    {
        String Title =" ";
        for(Student usr : student)
        {
            Title = usr.getType();
        }
  //        Toast.makeText( getContext(), Title, Toast.LENGTH_LONG).show();

        return Title;
    }
    private void home()
    {
        String Title =" ";
        String Initials =" ";
        String First_Names =" ";
        String Surname =" ";
        int Birthdate  =0;
        int Citizenship_Code =0;
        int ID__Passport_Number =0;
        String Gender =" ";
        String Home_Language =" ";
        String Prefered_Language =" ";
        String Population_Group =" ";

        for(Applying usr : applying)
        {
            Title = usr.getTitle();
            Initials =usr.getInitials();
            First_Names = usr.getFirst_Names();
            Surname = usr.getSurname();
            Birthdate= usr.getBirthdate();
            Citizenship_Code= usr.getCitizenship_Code();
            ID__Passport_Number = usr.getID__Passport_Number();
            Gender = usr.getGender();
            Home_Language = usr.getHome_Language();
            Prefered_Language = usr.getPrefered_Language();
            Population_Group = usr.getPopulation_Group();
        }
        if(Title.equals(" "))
        {
            EditText1.setHint("");
            EditText2.setHint("");
            EditText3.setHint("");
            EditText4.setHint("");
            EditText5.setHint("");
            EditText6.setHint("");
            EditText7.setHint("");
            EditText8.setHint("");
            EditText9.setHint("");
            EditText10.setHint("");
            EditText11.setHint("");
        }
        else
        {
            EditText1.setText(Title);
            EditText2.setText(Initials);
            EditText3.setText(First_Names);
            EditText4.setText(Surname);
            EditText5.setText(Birthdate+"" );
            EditText6.setText(Citizenship_Code  +"" );
            EditText7.setText(ID__Passport_Number+"");
            EditText8.setText(Gender);
            EditText9.setText(Home_Language);
            EditText10.setText(Prefered_Language);
            EditText11.setText(Population_Group);
        }
    }
    private void reload() {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(
                getContext()

        );
        //Setting AlertDialog's Icon ,Title and Message
        builder.setIcon(R.drawable.icon);
        builder.setTitle("Aps !!!");
        builder.setMessage("You can use the APS and select a university to see courses requirements  ");
        //set NegativeButton so that if anyone clicks yes it will cancel the whole AlertDialog
        builder.setNegativeButton("OK" , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog , int which) {
                dialog.cancel();
            }
        });
        //creating  alertDialog to show AlertDialog
        androidx.appcompat.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void Login(View v)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName;
        switch (v.getId())
        {
            case R.id.Submit:
                btnName = "Applying3_button";
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