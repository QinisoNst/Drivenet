package com.drivenet.rsa.ui.login;

import android.app.AlertDialog;
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
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.welcome.welcome;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginFragment extends Fragment {
    private FirebaseAuth mAuth;
    private MainActivity mainActivity = new MainActivity();
    private static final String TAG = "EmailPassword";
    private EditText Username,Password ;
    private TextView forget;
    private FirebaseAnalytics mFirebaseAnalytics;
    private Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        final ProgressBar simpleProgressBar = (ProgressBar) view.findViewById(R.id.simpleProgressBar);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

        Username = (EditText)view.findViewById(R.id.email);
        Password = (EditText)view.findViewById(R.id.password);
        forget = (TextView)view.findViewById(R.id.ForgotPassword);
        button = (Button)view.findViewById(R.id.button);

        mAuth = FirebaseAuth.getInstance();

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String emails =Username.getText().toString();
                String passwords =Password.getText().toString();
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
                signIn(emails,passwords,v);
            }
        });
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText resetMail =  new EditText(v.getContext());
                AlertDialog.Builder passwordRestDialog = new AlertDialog.Builder(v.getContext());
                passwordRestDialog.setTitle("Rest Password ?");
                passwordRestDialog.setMessage("Enter Your Email to Receive Reset Link");
                passwordRestDialog.setView(resetMail);
                passwordRestDialog.setPositiveButton("No" , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog , int which) {
                    }
                });
                passwordRestDialog.setPositiveButton("Yes" , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog , int which) {
                        String mail = resetMail.getText().toString();
                        mAuth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(getContext(), "Reset link sent to your email", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(getContext(), "Error ! reset link sent not sent to your email"+e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
                passwordRestDialog.create().show();
            }
        });
        return view;
    }
    private void signIn(String email , String password , View v)
    {
        Login(v);
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            if(user.isEmailVerified())
                            {
                            //    Toast.makeText(getContext(), "Sign In With Email : success", Toast.LENGTH_SHORT).show();
                            //
                                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new welcome()).addToBackStack(null).commit();

                            }
                            else
                            {
                                reload();
                            }
                            updateUI(user);
                        } else {
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(getContext(), "SignIn Failed",Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
    }
    @Override
    public void onResume() {
        super.onResume();
        mainActivity.hideBottomNav();
        mainActivity.hidetoolbar();
        requireActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    private void reload() {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(
            getContext()

    );
        //Setting AlertDialog's Icon ,Title and Message
        builder.setIcon(R.drawable.icon);
        builder.setTitle("Login failed !!!");
        builder.setMessage("Please check your email for the verified email");
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
                btnName = "LoginClicked";
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

    @Override
    public void onStop() {
        super.onStop();
        mainActivity.showBottomNav();
        mainActivity.showtoolbar();
        requireActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}