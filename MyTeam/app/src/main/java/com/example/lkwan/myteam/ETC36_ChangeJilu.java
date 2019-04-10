package com.example.lkwan.myteam;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ETC36_ChangeJilu extends AppCompatActivity {
    ListView lv;
    ArrayList<HashMap<String,Object>>listdate = new ArrayList<HashMap<String, Object>>();
    HashMap<String,Object>date;
    SimpleAdapter adapter;
    int a =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc36__change_jilu);
        lv = findViewById(R.id.lv);
        SharedPreferences sp = getSharedPreferences("etc36",MODE_PRIVATE);
        a = Integer.parseInt(sp.getString("lenth",null));

//        for (int i = 0 ; i< ;i++)
//        date = new HashMap<String, Object>();





    }
}
