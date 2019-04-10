package com.example.lkwan.myteam;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ETC36_ChangeJilu extends AppCompatActivity {
    ListView lv;
    ArrayList<HashMap<String,Object>>listdate = new ArrayList<HashMap<String, Object>>();
    HashMap<String,Object>date;
    SimpleAdapter adapter;
    int a =0;
    TextView tv1;
    int max = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc36__change_jilu);
        lv = findViewById(R.id.lv);
        tv1 = findViewById(R.id.tv_chanji_jilu_item_heji);
        SharedPreferences sp = getSharedPreferences("etc36",MODE_PRIVATE);
        a = sp.getInt("lenth",0);
        Log.d("sadas",a+"----------------------------------------");
       for (int i = 0 ; i<a ;i++) {
           date = new HashMap<String, Object>();
           date.put("1",(i+1));//编号
           date.put("2",sp.getString("chepai"+(i+1),null));//车牌
           date.put("3",sp.getString("moeny"+(i+1),null));//充值金额
           date.put("4",sp.getString("time"+(i+1),null));//时间
           int aa = Integer.parseInt(sp.getString("moeny"+(i+1),null));
           max = max +aa;
           listdate.add(date);
       }
       String[] from = {"1","2","3","4"};
       int[] to = {R.id.tv_chanji_jilu_item_1,R.id.tv_chanji_jilu_item_2,R.id.tv_chanji_jilu_item_3,R.id.tv_chanji_jilu_item_4};
        adapter = new SimpleAdapter(ETC36_ChangeJilu.this,listdate,R.layout.activity_etc36_change_jilu_item,from,to);
        lv.setAdapter(adapter);
        tv1.setText(max+"");

    }
}
