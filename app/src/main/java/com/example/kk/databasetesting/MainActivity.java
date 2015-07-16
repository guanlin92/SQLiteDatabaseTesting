package com.example.kk.databasetesting;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import SQLiteDatabase.DBHandler;
import SQLiteDatabase.VisitedPlace;


public class MainActivity extends ActionBarActivity {

    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VisitedPlace place = new VisitedPlace("Burger King", 1.1, 1.2);

        dbHandler = new DBHandler(this, null, null, 1);

        dbHandler.addVisitedPlace(place);

        //dbHandler.isExistInDatabase(place.get_name());

        //dbHandler.deleteVisitedPlace(place.get_name());

        //dbHandler.deleteAllContentInTable();

        //dbHandler.isTableEmpty();

    }

}
