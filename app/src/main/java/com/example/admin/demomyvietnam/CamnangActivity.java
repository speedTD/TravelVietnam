package com.example.admin.demomyvietnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CamnangActivity extends AppCompatActivity {
    private TextView txtten;
    private TextView txtnoidung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camnang);
        txtten=findViewById(R.id.ten_camnang);
        txtnoidung=findViewById(R.id.camnang_noidung);
        Intent intent=getIntent();
        intent.equals(null);
        txtten.setText(intent.getStringExtra(Constans.TEN_CAMNANG));
        txtnoidung.setText(intent.getStringExtra(Constans.ND_CAMNANG));
    }
}
