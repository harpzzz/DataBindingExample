package com.milagro.databindingExample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.milagro.databindingExample.databinding.ActivityLoginBinding;
import com.milagro.databindingExample.handler.Loginhandler;
import com.milagro.databindingExample.model.User;

public class Login extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        user = new User();
        user.setName("mharpreetsingh@gmail.com");
        user.setPassword("123456789");
        binding.setUser(user);

        Loginhandler loginhandler = new Loginhandler(this);
        binding.setLoginhandler(loginhandler);
    }
}
