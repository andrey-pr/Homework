package com.example.artem.homework.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.artem.homework.R;

/**
 * Created by Artem on 23.09.2016.
 */
public class Fragment2 extends Fragment{
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment2, null);
        btn = (Button) v.findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm2 = getFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                ft2.add(R.id.container_fragment1, new Fragment1());
                ft2.commit();
                Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
