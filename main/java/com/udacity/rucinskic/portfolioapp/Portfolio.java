package com.udacity.rucinskic.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Portfolio extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        ListView apps = (ListView) findViewById(R.id.portfolio_items);

        apps.addHeaderView(getLayoutInflater().inflate(R.layout.app_header, null));
        apps.setOnItemClickListener(this);
        apps.setAdapter(new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,
                        App.values())
        );

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        App app = App.get(position);
        String message = "Starting App " + app.getAppNumber() ;

        // Only 1 switch case now, but it will be converted to 6 cases later on.
        // OR I could place all the Intent logic into the enum, and just make this method 1 or 2 lines
        switch (app) {

            case CAPSTONE: message = "Starting Capstone App";

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
