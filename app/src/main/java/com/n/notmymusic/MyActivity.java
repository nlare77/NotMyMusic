package com.n.notmymusic;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.n.notmymusic.listener.MyTabListener;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        GridView gridView = (GridView) findViewById(R.id.gridview);


       /* gridView.setAdapter(new ImageAdapter(this));



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {


                Intent intent = new Intent(v.getContext(),DetailActivity.class);
                startActivity(intent);


            }
           }); */


    }






        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.action_settings: settings(); return true;
            case R.id.action_search: search(); return true;
            case R.id.action_add: add(); return true;

        }
        return super.onOptionsItemSelected(item);
    }

    private void search() {
        Intent intent = new Intent(this,SearchFragment.class);
        startActivity(intent);
    }

    private void settings() {
        Intent intent = new Intent(this,SettingsFragment.class);
        startActivity(intent);
    }

    private void add() {
        Intent intent = new Intent(this,AddFragment.class);
        startActivity(intent);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }
    }
}
