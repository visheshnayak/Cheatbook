package com.faceless.cheatbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Student extends AppCompatActivity {
    TextView physics = (TextView) findViewById(R.id.phy);
    TextView math = (TextView) findViewById(R.id.math);
    TextView chemistry = (TextView) findViewById(R.id.chem);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void physics() {
        Intent iphy = new Intent(getBaseContext(), Physics.class);
        startActivity(iphy);
    }

    public void chemistry() {
        Intent ichem = new Intent(getBaseContext(), Chemistry.class);
        startActivity(ichem);
    }

    public void math() {
        Intent imath = new Intent(getBaseContext(), Maths.class);
        startActivity(imath);
    }

}
