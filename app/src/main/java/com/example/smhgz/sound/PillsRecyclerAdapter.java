package com.example.smhgz.sound;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class PillsRecyclerAdapter extends RecyclerView.Adapter<PillsRecyclerAdapter.MyViewHolder> {

    ArrayList<Pill> mPillList;
    LayoutInflater inflater;

    public PillsRecyclerAdapter(ReminderFragment context, ArrayList<Pill> pills) {
        inflater = LayoutInflater.from(context.getContext());
        this.mPillList = pills;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_pills, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pill selectedPill = mPillList.get(position);
        holder.setData(selectedPill, position);

    }

    @Override
    public int getItemCount() {
        return mPillList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView pillName;
        ImageView pillImage, deletepill;

        public MyViewHolder(View itemView) {
            super(itemView);
            pillImage = (ImageView) itemView.findViewById(R.id.img_reminder);
            pillName = (TextView) itemView.findViewById(R.id.txtPills);
            deletepill = (ImageView) itemView.findViewById(R.id.imgRecycleBin);
            deletepill.setOnClickListener(this);

        }

        public void setData(Pill selectedPill, int position) {

            this.pillName.setText(selectedPill.getPillName());
            this.pillImage.setImageResource(selectedPill.getImageID());


        }


        @Override
        public void onClick(View v) {


        }


    }
}