package com.example.lkwan.myteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ETC36_Yue extends AppCompatActivity {
    EditText edt1;
    TextView tv1;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc36__yue);
        setupview();
    }

    public void doClick(View view) {
        switch (view.getId()){
            case R.id.btnSelect:
                if (edt1.getText().toString().equals("")){
                    Toast.makeText(ETC36_Yue.this,"请输入车牌编号！",Toast.LENGTH_SHORT).show();
                }else {
                    a = edt1.getText().toString();
                }
                if (a.equals("1")){
                    tv1.setText("103");
                }else if (a.equals("2")){
                    tv1.setText("100");
                }else if (a.equals("3")){
                    tv1.setText("90");
                }else {
                    Toast.makeText(ETC36_Yue.this,"并未查询到这辆车！",Toast.LENGTH_SHORT).show();

                }




                break;
        }
    }

    private void setupview() {
        edt1 = findViewById(R.id.edtSelect);
        tv1 = findViewById(R.id.tvSelectYue);
    }

}
