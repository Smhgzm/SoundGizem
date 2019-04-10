package com.example.smhgz.sound;

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

    public PillsRecyclerAdapter(ReminderFragment context, ArrayList<Pill> products) {
        inflater = LayoutInflater.from(context);
        this.mPillList = products;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_pills, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pill selectedProduct = mPillList.get(position);
        holder.setData(selectedProduct, position);

    }

    @Override
    public int getItemCount() {
        return mPillList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView productName, productDescription;
        ImageView productImage, deleteproduct;

        public MyViewHolder(View itemView) {
            super(itemView);
            productName = (TextView) itemView.findViewById(R.id.productName);
            productDescription = (TextView) itemView.findViewById(R.id.productDescription);
            productImage = (ImageView) itemView.findViewById(R.id.productImage);
            deleteproduct = (ImageView) itemView.findViewById(R.id.deleteproduct);
            deleteproduct.setOnClickListener(this);

        }

        public void setData(Pill selectedProduct, int position) {

            this.productName.setText(selectedProduct.getProductName());
            this.productDescription.setText(selectedProduct.getProductDescription());
            this.productImage.setImageResource(selectedProduct.getImageID());


        }


        @Override
        public void onClick(View v) {


        }


    }
}