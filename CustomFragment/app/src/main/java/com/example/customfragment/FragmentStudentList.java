package com.example.customfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {
    ArrayList<SinhVien> sinhVienArrayList;
    SinhVienAdapter adapter;


    TruyenSinhVien truyenSinhVien;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        truyenSinhVien = (TruyenSinhVien) getActivity();

        sinhVienArrayList = new ArrayList<>();
        addArraySV();

        adapter = new SinhVienAdapter(getActivity(),R.layout.row_student,sinhVienArrayList);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list,container,false);
    }

    private void addArraySV(){
        sinhVienArrayList.add(new SinhVien("Tuyen",1998,"go vap","tsfa@sjfsd"));
        sinhVienArrayList.add(new SinhVien("Tuyen1",1999,"ha noi","tsfa@245"));
        sinhVienArrayList.add(new SinhVien("Tuyen2",1997,"ben tre","123@sjfsd"));
        sinhVienArrayList.add(new SinhVien("Tuyen3",1996,"dong nai","tsfa@im"));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        truyenSinhVien.dataStudent(sinhVienArrayList.get(position));

        Toast.makeText(getActivity(), sinhVienArrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
    }
}
