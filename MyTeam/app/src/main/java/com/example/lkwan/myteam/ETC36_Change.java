package com.example.lkwan.myteam;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ETC36_Change extends AppCompatActivity {
    EditText edt1;
    TextView tv1;
    int lenth = 0;
    String moeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc36__change);
        setupview();
    }

    public void doClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                edt1.setText("10");
                break;
            case R.id.btn2:
                edt1.setText("50");
                break;
            case R.id.btn3:
                edt1.setText("100");
                break;
            case R.id.btn4:
                lenth = lenth+1;
                if (edt1.getText().toString().equals("")){
                    Toast.makeText(ETC36_Change.this,"请输入充值金额！",Toast.LENGTH_SHORT).show();
                }else {
                    moeny = edt1.getText().toString();
                }




                SharedPreferences sp = getSharedPreferences("etc36",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
                Date date = new Date(System.currentTimeMillis());
                String time = simpleDateFormat.format(date);
                editor.putString("time"+lenth,time);//时间
                editor.putInt("id"+lenth,lenth);//ID
                editor.putString("chepai"+lenth,tv1.getText().toString());//车牌号
                editor.putString("moeny"+lenth,moeny);//充值金额
                editor.putInt("lenth",lenth);
                editor.commit();
                Toast.makeText(ETC36_Change.this,"充值成功！",Toast.LENGTH_SHORT).show();
                edt1.setText("");
                break;
        }
    }





    private void setupview() {
        edt1 = findViewById(R.id.edt1);
        tv1 = findViewById(R.id.tv1);
    }


}
