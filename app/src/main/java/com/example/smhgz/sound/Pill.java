package com.example.smhgz.sound;

import android.support.v4.app.Fragment;

import java.util.ArrayList;

public class Pill extends Fragment {

    private String pillName;
    private int imageID;



//    Getter and setter
    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }


    public String getPillName() {
        return pillName;
    }

    public void setPillName(String pillName) {
        this.pillName = pillName;
    }



    public Pill() {
    }

    public Pill(int imageID, String pillName) {
        this.imageID = imageID;
        this.pillName = pillName;
    }


    public static ArrayList<Pill> getData() {
        ArrayList<Pill> pillList = new ArrayList<Pill>();
        int pillImages[] = {R.drawable.ic_add};
        String[] pillNames = {"Geleceği Yazanlar", "Paycell", "Tv+"};

        for (int i = 0; i < pillImages.length; i++) {
            Pill temp = new Pill();
            temp.setImageID(pillImages[i]);
            temp.setPillName(pillNames[i]);


            pillList.add(temp);

        }


        return pillList;


    }

}
