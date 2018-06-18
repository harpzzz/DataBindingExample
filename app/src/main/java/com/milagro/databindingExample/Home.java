package com.milagro.databindingExample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.milagro.databindingExample.adapter.RecyclerViewAdapter;
import com.milagro.databindingExample.databinding.ActivityHomeBinding;
import com.milagro.databindingExample.model.User;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {


    RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);


        recyclerView = binding.recyclerView;

        List<User> users = new ArrayList<>();


       recyclerViewAdapter = new RecyclerViewAdapter(users);

       for(int i=0;i<5;i++){
           users.add(new User("Harpz "+i,""+i));
       }


       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(recyclerViewAdapter);


    }
}
