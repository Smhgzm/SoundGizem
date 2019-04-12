package com.example.smhgz.sound;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class ReminderFragment extends Fragment {



        RecyclerView recyclerView;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_reminder);

            recyclerView = (RecyclerView) recyclerView.findViewById(R.id.recylerview);

            PillsRecyclerAdapter productAdapter = new PillsRecyclerAdapter(this,Pill.getData());
            recyclerView.setAdapter(productAdapter);

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity());
            linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(linearLayoutManager);

        }

    private void setContentView(int fragment_reminder) {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reminder, container, false);
    }
}