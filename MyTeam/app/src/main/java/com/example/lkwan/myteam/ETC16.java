package com.example.lkwan.myteam;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ETC16 extends AppCompatActivity {

    Fragment f1,f2,f3;
    FragmentManager manager;
    FragmentTransaction fragmentTransaction;
    TextView tv1,tv2,tv3,t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc16);
        tv1 =findViewById(R.id.tv_gerenxinxi);
        tv2 = findViewById(R.id.tv_chongzhijilu);
        tv3 = findViewById(R.id.tv_fazhishezhi);

        t1 = findViewById(R.id.tv_gerenxinxi_1);
        t2 = findViewById(R.id.tv_gerenxinxi_2);
        t3 = findViewById(R.id.tv_gerenxinxi_3);

        manager = getSupportFragmentManager();
        fragmentTransaction = manager.beginTransaction();
        f1 = new ETC16_Fragment();
        fragmentTransaction.replace(R.id.fragment,f1);
        fragmentTransaction.commit();



        tv1.setOnClickListener(new Onclick());
        tv2.setOnClickListener(new Onclick());
        tv3.setOnClickListener(new Onclick());





    }
public class Onclick implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        manager = getSupportFragmentManager();
        fragmentTransaction = manager.beginTransaction();
        switch (v.getId()){
            case R.id.tv_gerenxinxi:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.INVISIBLE);
                t3.setVisibility(View.INVISIBLE);
                vin(fragmentTransaction);
                f1 = new ETC16_Fragment();
                fragmentTransaction.replace(R.id.fragment,f1);
                fragmentTransaction.commit();

                break;
            case R.id.tv_chongzhijilu:
                t1.setVisibility(View.INVISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.INVISIBLE);
                vin(fragmentTransaction);
                f2 = new ETC16_Fragment1();
                fragmentTransaction.replace(R.id.fragment,f2);
                fragmentTransaction.commit();

                break;
            case R.id.tv_fazhishezhi:
                t1.setVisibility(View.INVISIBLE);
                t2.setVisibility(View.INVISIBLE);
                t3.setVisibility(View.VISIBLE);
                vin(fragmentTransaction);
                f3 = new ETC16_Fragment2();
                fragmentTransaction.replace(R.id.fragment,f3);
                fragmentTransaction.commit();

                break;
        }

    }
}


    public void vin(FragmentTransaction fragmentTransaction){
        if (f1 !=null){
                fragmentTransaction.remove(f1);
        }
        if (f2 !=null){
            fragmentTransaction.remove(f2);
        }
        if (f3 !=null){
            fragmentTransaction.remove(f3);
        }

    }


}
