package com.latihan3.dewi.moviecategory;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    HashMap<String, List<String>> Movies_category;
    List<String> Movie_list;
    ExpandableListView Exp_list;
    MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Movie Categori");

        Exp_list = (ExpandableListView)findViewById(R.id.expList);
        Movies_category = DataProvider.getInfo();
        Movie_list = new ArrayList<String>(Movies_category.keySet());

        adapter = new MoviesAdapter(this, Movies_category, Movie_list);
        Exp_list.setAdapter(adapter);
    }


}
