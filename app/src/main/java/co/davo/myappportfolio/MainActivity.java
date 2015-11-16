/*
 * Copyright (c) 2015. David Faulkner. All rights reserved.
 */

package co.davo.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //Spotify button onClick method
    public void displaySpotifyToast(View v) {
        Toast toast = Toast.makeText(this, "This button will launch my spotify app!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    //Scores button onClick method
    public void displayScoresToast(View v) {
        Toast toast = Toast.makeText(this, "This button will launch my scores app!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    //Library button onClick method
    public void displayLibraryToast(View v) {
        Toast toast = Toast.makeText(this, "This button will launch my library app!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    //Build it button onClick method
    public void displayBuildItToast(View v) {
        Toast toast = Toast.makeText(this, "This button will launch my build it app!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    //XYZ button onClick method
    public void displayXyzToast(View v) {
        Toast toast = Toast.makeText(this, "This button will launch my xyz reader app!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    //Capstone button onClick method
    public void displayCapstoneToast(View v) {
        Toast toast = Toast.makeText(this, "This button will launch my capstone app!",
                Toast.LENGTH_SHORT);
        toast.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
