package com.example.lkwan.myteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ETC36_Change extends AppCompatActivity {
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc36__change);
        setupview();
    }

    public void doClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                break;
            case R.id.btn2:
                break;
            case R.id.btn3:
                break;
            case R.id.btn4:
                break;
        }
    }





    private void setupview() {
        edt1 = findViewById(R.id.edt1);

    }


}
