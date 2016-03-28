package com.faceless.cheatbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Category extends AppCompatActivity {

    ImageButton stud = (ImageButton) findViewById(R.id.student);
    ImageButton dev = (ImageButton) findViewById(R.id.dev);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void student() {
        Intent istud = new Intent(getBaseContext(), Student.class);
        startActivity(istud);
    }

    public void developer() {
        Intent idev = new Intent(getBaseContext(), Developer.class);
        startActivity(idev);
    }

}
