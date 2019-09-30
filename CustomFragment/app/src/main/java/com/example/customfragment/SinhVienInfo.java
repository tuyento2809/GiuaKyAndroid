package com.example.customfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SinhVienInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinh_vien_info);

        Intent intent = getIntent();
        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("thongtinsv");

        FragmentStudentInfo studentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentChiTiet);

        studentInfo.setInfo(sinhVien);
    }
}
