package com.faceless.cheatbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Developer extends AppCompatActivity {
    TextView html = (TextView) findViewById(R.id.html);
    TextView git = (TextView) findViewById(R.id.git);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void html() {
        Intent ihtml = new Intent(getBaseContext(), Html.class);
        startActivity(ihtml);
    }

    public void git() {
        Intent igit = new Intent(getBaseContext(), Git.class);
        startActivity(igit);
    }

}
