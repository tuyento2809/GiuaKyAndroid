package com.example.customfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentStudentInfo extends Fragment {

    TextView txtHoTen, txtNamSinh, txtDiaChi, txtEmail;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info,container,false);

        anhXa();

        return view;
    }

    public void setInfo(SinhVien sv){
        txtHoTen.setText(sv.getHoTen());
        txtNamSinh.setText("nam sinh: "+sv.getNamSinh());
        txtDiaChi.setText("dia chi: "+sv.getDiaChi());
        txtEmail.setText("email "+sv.getEmail());
    }

    private void anhXa(){
        txtHoTen = (TextView) view.findViewById(R.id.txtName);
        txtNamSinh = (TextView) view.findViewById(R.id.txtNamSinh);
        txtDiaChi = (TextView) view.findViewById(R.id.txtDiaChi);
        txtEmail = (TextView) view.findViewById(R.id.txtEmail);
    }
}
