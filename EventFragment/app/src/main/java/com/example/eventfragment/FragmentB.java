package com.example.eventfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    TextView txtB;
    EditText edtB;
    Button btnB;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b,container,false);

        txtB = (TextView) view.findViewById(R.id.textviewFragB);
        edtB = (EditText) view.findViewById(R.id.edtTextFragB);
        btnB = (Button) view.findViewById(R.id.btnFragB);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), edtB.getText(), Toast.LENGTH_SHORT).show();

                TextView textViewA = (TextView) getActivity().findViewById(R.id.textviewFragA);
                textViewA.setText(edtB.getText().toString());
            }
        });
        return view;
    }
}
