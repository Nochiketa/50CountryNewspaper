package com.example.nochiketa.grid;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] names;
    Integer[] img;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);

        names = new String[] {"USA", "India", "Bangladesh", "United Kingdom",
                "Russia", "Australia", "Canada", "France", "Germany", "Japan",
                "China", "South Africa", "Spain", "Pakistan", "Italy", "South Korea",
                "North Korea", "Indonesia", "Switzerland", "Argentina", "Turkey", "Vietnam"};

        img = new Integer[] {R.drawable.usa, R.drawable.india, R.drawable.bangladesh,
                R.drawable.uk, R.drawable.russia, R.drawable.australia, R.drawable.canada,
                R.drawable.france, R.drawable.germany, R.drawable.japan, R.drawable.china,
                R.drawable.southafrica, R.drawable.spain, R.drawable.pakistan, R.drawable.italy, R.drawable.southkorea,
                R.drawable.northkorea, R.drawable.indonesia, R.drawable.switzerland, R.drawable.argentina,
                R.drawable.turkey, R.drawable.vietnam};

        ListViewImageAdapter adapter = new ListViewImageAdapter(this, names, img);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view , int position, long id)
            {
                Intent k = new Intent(MainActivity.this, Main3Activity.class);
                k.putExtra("POS", position);
                startActivity(k);
            }
        });
    }
}