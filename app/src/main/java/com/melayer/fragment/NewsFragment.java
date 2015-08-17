package com.melayer.fragment;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.melayer.material.R;
import com.melayer.web.IServiceListener;
import com.melayer.web.MyService;


public class NewsFragment extends Fragment {

    private View rootView;

    private TextInputLayout textInputUserName, textInputPassword;
    private EditText edtUserName, edtPassword;

    private Button btnLogin;

    public NewsFragment() {
    }

    public static NewsFragment newInstance() {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_news,container,false);

        textInputUserName  = (TextInputLayout) rootView.findViewById(R.id.textInputUserName);
        textInputUserName.setErrorEnabled(true);
        //textInputUserName.setError("User Name Cant be null");
        edtUserName = (EditText) rootView.findViewById(R.id.edtUserName);


        textInputPassword = (TextInputLayout) rootView.findViewById(R.id.textInputPassword);
        textInputPassword.setErrorEnabled(true);
        //textInputPassword.setError("Password Cant be null");
        edtPassword = (EditText) rootView.findViewById(R.id.edtPassword);

        btnLogin = (Button) rootView.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IServiceListener listener = new MyService();

            }
        });

        return rootView;
    }
}
