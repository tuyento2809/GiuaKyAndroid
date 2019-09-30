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

public class FragmentA extends Fragment {

    TextView txtA;
    EditText edtA;
    Button btnA;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a,container,false);

        txtA = (TextView) view.findViewById(R.id.textviewFragA);
        edtA = (EditText) view.findViewById(R.id.edtTextFragA);
        btnA = (Button) view.findViewById(R.id.btnFragA);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), edtA.getText(), Toast.LENGTH_SHORT).show();

                TextView textViewMain = (TextView) getActivity().findViewById(R.id.txtMain);
                textViewMain.setText("changeXasd");
            }
        });

        return view;
    }
}
