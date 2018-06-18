package com.milagro.databindingExample.handler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.milagro.databindingExample.Home;
import com.milagro.databindingExample.model.User;

public class Loginhandler {

    Activity context;

    public Loginhandler(Activity context) {
        this.context = context;
    }



    public void onLoginClicked(View view, User user){

      //  user.setName("Harpz");

        context.startActivity(new Intent(context,Home.class));
        context.finish();
    }
}
