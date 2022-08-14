package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private ArrayList<ItemModule> items;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        items = new ArrayList<>();
        items.add(new ItemModule(R.drawable.family_daughter,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_father,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_grandfather,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_grandmother,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_mother,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_older_brother,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_older_sister,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_son,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_younger_brother,"test","khrachobaka"));
        items.add(new ItemModule(R.drawable.family_younger_sister,"test","khrachobaka"));

        ListView listView = (ListView) findViewById(R.id.listview);
        adapter = new ListAdapter(this, items);
        listView.setAdapter(adapter);



    }
}
