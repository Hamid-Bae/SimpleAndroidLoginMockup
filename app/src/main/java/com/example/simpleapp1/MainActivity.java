package com.example.simpleapp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnClickListener{
    ListView listView;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(listView)findViewById(listView);
        adapter=ArrayAdapter.createFromResource(context: this,R.array.hp_array,android.R.layout.simple_expandable_list_item_1)
        listView.getAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public  void onItemClick(AdapterView<?>parent, View view, int position, long )
}
