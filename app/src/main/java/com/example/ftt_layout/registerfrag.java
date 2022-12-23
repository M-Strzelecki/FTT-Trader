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
 * Use the {@link registerfrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class registerfrag extends Fragment {
    Button btnReturn;
//    EditText inputEmail,inputPassword,inputConfirmPassword;
//    Button btnRegister;
//    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]";
//    ProgressDialog progressDialog;
//    FirebaseAuth mAuth;
//    FirebaseUser mUser;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public registerfrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment registerfrag.
     */
    // TODO: Rename and change types and number of parameters
    public static registerfrag newInstance(String param1, String param2) {
        registerfrag fragment = new registerfrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

//            inputEmail=getView().findViewById(R.id.edLoginEmail);
//            inputPassword=getView().findViewById(R.id.edPassword);
//            inputConfirmPassword=getView().findViewById(R.id.edConfirmPassword);
//            btnRegister=getView().findViewById(R.id.btnRegister);
//            progressDialog = new ProgressDialog(getView().getContext());
//            mAuth=FirebaseAuth.getInstance();
//            mUser=mAuth.getCurrentUser();
//
//            btnRegister.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    PerforAuth();
//                }
//            });

        }


    }

//    private void PerforAuth() {
//        String email=inputEmail.getText().toString();
//        String password=inputPassword.getText().toString();
//        String confirmPassword=inputConfirmPassword.getText().toString();
//
//        if (email.matches(emailPattern)){
//            inputEmail.setError("Enter correct email");
//        }else if(password.isEmpty() || password.length()<6){
//            inputPassword.setError("Enter proper password");
//        }else if(!password.equals(confirmPassword)){
//            inputConfirmPassword.setError("Password doesn't match");
//        }else {
//            progressDialog.setMessage("Please Wait A Moment...");
//            progressDialog.setTitle("Registration");
//            progressDialog.setCanceledOnTouchOutside(false);
//            progressDialog.show();
//
//            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if (task.isSuccessful()){
//                        progressDialog.dismiss();
//                        sendUserToNextActivity();
//                        Toast.makeText(getView().getContext(),"Registration Successfully",Toast.LENGTH_SHORT).show();
//                    }else {
//                        progressDialog.dismiss();
//                        Toast.makeText(getView().getContext(),""+task.getException(),Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//        }
//    }
//
//    private void sendUserToNextActivity() {
//        Intent intent=new Intent(getView().getContext(),loginfrag.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registerfrag, container, false);

    }

}