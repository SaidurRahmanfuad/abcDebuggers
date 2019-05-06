package com.saidur.abcdebuggers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.SupportActivity;
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

import com.saidur.abcdebuggers.UI.DashboardFragment;
import com.saidur.abcdebuggers.UI.HomeFragment;
import com.saidur.abcdebuggers.UI.ProfileFragment;
import com.saidur.abcdebuggers.UI.SubscriptionFragment;
import com.saidur.abcdebuggers.UI.SupportFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
BottomNavigationView bottomNavigationView;
FragmentManager FM;
    FragmentTransaction FT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FM = getSupportFragmentManager();
        FT = FM.beginTransaction();
        FT.replace(R.id.show_content, new HomeFragment()).commit();



bottomNavigationView=findViewById(R.id.bottom_navid);
bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();
        switch (id) {
            case R.id.nav_home:
                FragmentTransaction fragmentTransaction1 = FM.beginTransaction();
                fragmentTransaction1.replace(R.id.show_content, new HomeFragment()).commit();
                break;
            case R.id.nav_profile:

            FragmentTransaction fragmentTransaction2 = FM.beginTransaction();
            fragmentTransaction2.replace(R.id.show_content, new ProfileFragment()).commit();
            break;
            case R.id.nav_dashboard:
                FragmentTransaction fragmentTransaction3 = FM.beginTransaction();
                fragmentTransaction3.replace(R.id.show_content, new DashboardFragment()).commit();
                break;
            case R.id.nav_subscription:
                FragmentTransaction fragmentTransaction4 = FM.beginTransaction();
                fragmentTransaction4.replace(R.id.show_content, new SubscriptionFragment()).commit();
                break;
            case R.id.nav_support:
                FragmentTransaction fragmentTransaction5 = FM.beginTransaction();
                fragmentTransaction5.replace(R.id.show_content, new SupportFragment()).commit();
                break;
        }
return true;
    }
});

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

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
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
