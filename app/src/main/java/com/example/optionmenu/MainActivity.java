package com.example.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    Menu menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       /* MenuItem red=menu.findItem(R.id.Red);
        MenuItem black=menu.findItem(R.id.Black);
        MenuItem yellow=menu.findItem(R.id.Yellow);
        MenuItem green=menu.findItem(R.id.Green);*/
        switch (item.getItemId()) {
            case R.id.Red:
                layout.setBackgroundColor(Color.RED);
                /*red.setEnabled(true);
                black.setEnabled(false);
                yellow.setEnabled(true);
                green.setEnabled(true);*/
               // break;
                return true;
            case R.id.Black:
                layout.setBackgroundColor(Color.BLACK);
               /* red.setEnabled(true);
                black.setEnabled(false);
                yellow.setEnabled(true);
                green.setEnabled(true);*/
               // break;
                return true;
            case R.id.Yellow:
                layout.setBackgroundColor(Color.YELLOW);
                /*red.setEnabled(true);
                black.setEnabled(true);
                yellow.setEnabled(false);
                green.setEnabled(true);*/
               // break;
                return true;
            case R.id.Green:
                layout.setBackgroundColor(Color.GREEN);
                /*red.setEnabled(true);
                black.setEnabled(true);
                yellow.setEnabled(true);
                green.setEnabled(false);*/
                //break;
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
