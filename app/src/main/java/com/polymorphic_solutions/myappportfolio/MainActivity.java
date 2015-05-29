package com.polymorphic_solutions.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpotify = (Button) findViewById(R.id.btnSpotify);
        Button btnScores = (Button) findViewById(R.id.btnScores);
        Button btnLibrary = (Button) findViewById(R.id.btnLibrary);
        Button btnBuildIt = (Button) findViewById(R.id.btnBuildIt);
        Button btnReader = (Button) findViewById(R.id.btnReader);
        Button btnMyApp = (Button) findViewById(R.id.btnMyApp);

        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuildIt.setOnClickListener(this);
        btnReader.setOnClickListener(this);
        btnMyApp.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSpotify:
                Toast.makeText(MainActivity.this, "This wil launch the Spotify Streaming App", 1000).show();
                break;
            case R.id.btnScores:
                Toast.makeText(MainActivity.this, "This will launch my Scores App", 1000).show();
                break;
            case R.id.btnLibrary:
                Toast.makeText(MainActivity.this, "This will launch my Library App", 1000).show();
                break;
            case R.id.btnBuildIt:
                Toast.makeText(MainActivity.this, "This will launch my Build It Bigger App", 1000).show();
                break;
            case R.id.btnReader:
                Toast.makeText(MainActivity.this, "This will launch my XYZ Reader App", 1000).show();
                break;
            case R.id.btnMyApp:
                Toast.makeText(MainActivity.this, "This will launch My Own App", 1000).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "You didn't click a Button!", 1000).show();
                break;
        }
    }
}
