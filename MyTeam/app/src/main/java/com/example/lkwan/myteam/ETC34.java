package com.example.lkwan.myteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ETC34 extends AppCompatActivity {
    ImageButton img1 ,img2 ,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc34);
    }

    public void doClick(View view) {
        switch (view.getId()){
            case R.id.imgbtn1:
                Intent intent = new Intent(ETC34.this,ETC36_Change.class);
                startActivity(intent);
                break;
            case R.id.imgbtn2:
                Intent intent1 = new Intent(ETC34.this,ETC36_Change.class);
                startActivity(intent1);
                break;
            case R.id.imgbtn3:
                Intent intent2 = new Intent(ETC34.this,ETC36_Change.class);
                startActivity(intent2);
                break;

        }
    }
}
