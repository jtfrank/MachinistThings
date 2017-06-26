package me.joshfrank.machinistthings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] drillSizes = {"1/8 .1250\"", "3/16 .1875\"", "1/4 .2500\""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, drillSizes);

        ListView listView = (ListView) findViewById(R.id.drillsize_list);
        listView.setAdapter(adapter);
    }
}
