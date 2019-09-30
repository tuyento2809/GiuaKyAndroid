package com.example.customfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TruyenSinhVien{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void dataStudent(SinhVien sv) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragment_info);

        if(fragmentStudentInfo != null && fragmentStudentInfo.isInLayout()){
            fragmentStudentInfo.setInfo(sv);
        }else {
            Intent intent = new Intent(MainActivity.this,SinhVienInfo.class);
            intent.putExtra("thongtinsv", sv);
            startActivity(intent);
        }

    }
}
