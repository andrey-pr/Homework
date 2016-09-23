package com.example.artem.homework.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.artem.homework.Config;
import com.example.artem.homework.R;

import java.util.ArrayList;

/**
 * Created by Artem on 23.09.2016.
 */
public class Fragment1 extends Fragment
{
    private ArrayList mData;
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, null);

        Config data = new Config();
        mData = data.getPerson();

        mRecyclerView = (RecyclerView) v.findViewById(R.id.rcView_recycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(v.getContext(), LinearLayoutManager.VERTICAL, false));
        mAdapter = new MyAdapter(v.getContext(), mData, this);
        mRecyclerView.setAdapter(mAdapter);
        return v;
    }
}
