package com.ispeakcode.nabilnalakath.searchablespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> Names = new ArrayList<String>();

    SearchableSpinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1=findViewById(R.id.spinner1);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Names)
        {
            public View getView(int position , View convertView, ViewGroup parent)
            {
                View view1 = super.getView(position,convertView,parent);
                ((TextView)view1).setTextSize(20);
                return view1;
            }
        };
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        Names.add("Sam");


        Names.add("Chris");
        Names.add("Chris Jones");
        Names.add("Don Jones");

        Names.add("Ryan");
        Names.add("Jones");
        Names.add("Pfizer Jones");
        Names.add("Chris");
        Names.add("Don Jones");
        Names.add("Chris Jones");
        Names.add("Sam Jones");
        Names.add("Tony Jones");





    }





}
