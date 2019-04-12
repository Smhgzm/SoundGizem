package com.example.smhgz.sound;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Typeface;
import android.widget.TextView;


public class ProfileFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);


          //profil adı yazı stili //
          /* TextView name =(TextView)getView().findViewById(R.id.name);
             Typeface typeface =Typeface.createFromAsset(getActivity().getAssets(),"fonts/CormoMedium.tff");
             name.setTypeface(typeface);*/



    }


}
