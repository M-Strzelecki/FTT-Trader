package com.example.ftt_layout;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link loginfrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class loginfrag extends Fragment {

//    EditText inputEmail,inputPassword;
//    Button btnLogin;
//    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]";
//    ProgressDialog progressDialog;
//    FirebaseAuth mAuth;
//    FirebaseUser mUser;

    public Button btnSignIn;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public loginfrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment loginfrag.
     */
    // TODO: Rename and change types and number of parameters
    public static loginfrag newInstance(String param1, String param2) {
        loginfrag fragment = new loginfrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        inputEmail=getView().findViewById(R.id.edLoginEmail);
//        inputPassword=getView().findViewById(R.id.edLoginPassword);
//        btnLogin=getView().findViewById(R.id.btnSignIn);
//        progressDialog = new ProgressDialog(getView().getContext());
//        mAuth=FirebaseAuth.getInstance();
//        mUser=mAuth.getCurrentUser();

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                perfromLogin();
//            }
//        });

    }

//    private void perfromLogin() {
//        String email=inputEmail.getText().toString();
//        String password=inputPassword.getText().toString();
//
//        if (email.matches(emailPattern)){
//            inputEmail.setError("Enter correct email");
//        }else if(password.isEmpty() || password.length()<6){
//            inputPassword.setError("Enter proper password");
//        }else {
//            progressDialog.setMessage("Please Wait Logging In...");
//            progressDialog.setTitle("Login");
//            progressDialog.setCanceledOnTouchOutside(false);
//            progressDialog.show();
//
//            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if (task.isSuccessful()){
//                        progressDialog.dismiss();
//                        sendUserToNextActivity();
//                        Toast.makeText(getView().getContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
//                    }else {
//                        progressDialog.dismiss();
//                        Toast.makeText(getView().getContext(),""+task.getException(),Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//        }
//    }
//    private void sendUserToNextActivity() {
//        Intent intent=new Intent(getView().getContext(),home.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loginfrag,container,false);
        btnSignIn = view.findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin = new Intent(getActivity(), home.class);
                startActivity(signin);

            }
        });
        return view;
    }

}