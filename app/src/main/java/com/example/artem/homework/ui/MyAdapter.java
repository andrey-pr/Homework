package com.example.artem.homework.ui;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.artem.homework.R;
import com.example.artem.homework.model.Person;

import java.util.ArrayList;

/**
 * Created by Artem on 22.09.2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder>{

    private Context mContext;
    private ArrayList mPersonsData;
    private Fragment1 f;

    public MyAdapter(Context context, ArrayList personsData, Fragment1 f) {
        this.mContext = context;
        this.mPersonsData = personsData;
        this.f = f;
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView personName;
        CardView mCv;

        public PersonViewHolder(View itemView) {
            super(itemView);
            this.personName = (TextView) itemView.findViewById(R.id.txt_name_person);
            this.mCv = (CardView) itemView.findViewById(R.id.cv);
        }
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = (Person) mPersonsData.get(position);
        holder.personName.setText(person.getmName());
        holder.mCv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm2 = f.getFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                ft2.add(R.id.container_fragment1, new Fragment2());
                ft2.commit();
                Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPersonsData.size();
    }



    public static AppCompatActivity getActivityFromContext(Context context) {
        if(context instanceof Activity) {
            return (AppCompatActivity) context;
        }
        if(context instanceof ContextWrapper && ((ContextWrapper)context).getBaseContext() instanceof Activity) {
            return  (AppCompatActivity) ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }
}
