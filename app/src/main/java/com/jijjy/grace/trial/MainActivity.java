package com.jijjy.grace.trial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello hello", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

//    MenuItem m1 = (MenuItem) findViewById(R.id.nav_gallery);
//    MenuItem m2 = (MenuItem) findViewById(R.id.nav_camera);
//    MenuItem m3 = (MenuItem) findViewById(R.id.nav_manage);
//    MenuItem m4 = (MenuItem) findViewById(R.id.nav_send);
//    MenuItem m5 = (MenuItem) findViewById(R.id.nav_share);
//    MenuItem m6 = (MenuItem) findViewById(R.id.nav_slideshow);

    //    @Override
//    public  void  onClick(){
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch(v.getId()){
//
//                    case R.id.nav_camera: /** Start a new Activity MyCards.java */
//                        Intent intent = new Intent(getBaseContext(), x.class);
//                        startActivity(intent);
//                        break;
//
//                    case R.id.nav_gallery: /** AlerDialog when click on Exit */
//                        Intent gallery = new Intent(getBaseContext(), yow.class);
//                        startActivity(gallery);
//                        break;
//                }
//            }
//        });
//    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
//            Intent in = new Intent(getApplicationContext(), x.class);
//            startActivity(in);

//            Toast.makeText(MainActivity.this, "Moving to Camera!", Toast.LENGTH_SHORT).show();
//             Handle the camera action
        } else if (id == R.id.nav_gallery) {

//            Toast.makeText(MainActivity.this, "Moving to Gallery!", Toast.LENGTH_SHORT).show();
//            Intent ind = new Intent(getApplicationContext(), yow.class);
//            startActivity(ind);

        } else if (id == R.id.nav_slideshow) {

            Toast.makeText(MainActivity.this, "Moving to Slideshow!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_manage) {

            Toast.makeText(MainActivity.this, "Moving to Tools!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_share) {

            Toast.makeText(MainActivity.this, "Starting to Share!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_send) {

            Toast.makeText(MainActivity.this, "Starting Send!", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}