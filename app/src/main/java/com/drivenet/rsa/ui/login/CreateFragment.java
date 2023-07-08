package com.drivenet.rsa.ui.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class CreateFragment extends Fragment {
    private FirebaseAuth mAuth;
    private MainActivity mainActivity = new MainActivity();
    private static final String TAG = "EmailPassword";
    private EditText Username,Password, email, Phone;
    private Button button;
    private FirebaseFirestore fStore;
    private FirebaseAnalytics mFirebaseAnalytics;
    private String userId;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login1, container, false);
        final ProgressBar simpleProgressBar = (ProgressBar) view.findViewById(R.id.simpleProgressBar);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
        Username = (EditText)view.findViewById(R.id.username);
        Phone = (EditText)view.findViewById(R.id.phone);
        email = (EditText)view.findViewById(R.id.email);
        Password = (EditText)view.findViewById(R.id.password);
        button = (Button)view.findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String emails =email.getText().toString();
                String passwords =Password.getText().toString().trim();
                String username =Username.getText().toString();
                String phone =Phone.getText().toString();

                if(TextUtils.isEmpty(emails))
                {
                    Username.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(passwords))
                {
                    Password.setError("Password is Required");
                    return;
                }
                if(passwords.length()<6)
                {
                    Password.setError("Password must have 6 or more characters");
                    return;
                }
                simpleProgressBar.setVisibility(View.VISIBLE);
                createAccount(emails,passwords,username,phone,v);
            }
        });
        return view;
    }
    private void createAccount(String email , String password , String username , String phone , View v) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "createUserWithEmail:success");
                            final FirebaseUser user = mAuth.getCurrentUser();
                            user.sendEmailVerification().addOnCompleteListener(getActivity(), new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            // Email sent
                                        }
                                    });
                            Login(v);
                            reload1();
                            userId = mAuth.getCurrentUser().getUid();
                            DocumentReference documentReference = CreateFragment.this.fStore.collection("users").document(userId);
                            Map<String,Object> usera = new HashMap<>();
                            usera.put("Username",username);
                            usera.put("Email",email);
                            usera.put("Phone",phone);
                            documentReference.set(usera).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                             //       Toast.makeText(getContext(), "user profile saved userid.", Toast.LENGTH_SHORT).show();
                                }
                            });
                            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new LoginFragment()).addToBackStack(null).commit();
             //               Toast.makeText(getContext(), "create User With Email : success", Toast.LENGTH_SHORT).show();
               //             updateUI(user);
                        }
                        else
                            {
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(getContext(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
    }


    @Override
    public void onResume() {
        super.onResume();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            reload();
        }
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
        requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    private void reload() { }


    private void updateUI(FirebaseUser user) {

    }
    public void Login(View v)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName;
        switch (v.getId())
        {

            case R.id.button:
                btnName = "CreateClicked";
                break;
            default:
                btnName = "Nontlogin";
                break;

        }
        Log.d(TAG,"Button clicked"+btnName+params);
        home(btnName,params);
    }
    public void home(String btnName , Bundle params)
    {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

        mFirebaseAnalytics.logEvent(btnName ,params);
    }
    private void reload1() {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(
                getContext()

        );
        //Setting AlertDialog's Icon ,Title and Message
        builder.setIcon(R.drawable.icon);
        builder.setTitle("SignUp Succesfully !!!");
        builder.setMessage("Please Note before you can login you will have to Verify your email check your email for the Verification email ");
        //set NegativeButton so that if anyone clicks yes it will cancel the whole AlertDialog
        builder.setNegativeButton("OK" , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog , int which) {
                dialog.cancel();
            }
        });
        //creating  alertDialog to show AlertDialog
        androidx.appcompat.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();}

    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
        requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}