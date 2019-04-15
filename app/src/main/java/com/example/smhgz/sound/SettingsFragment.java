package com.example.smhgz.sound;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SettingsFragment extends Fragment {

    private FragmentActivity context;
    FragmentManager fragmentManager;
    RelativeLayout lyUser;
    RelativeLayout lyPass;
    RelativeLayout lyBlood;
    RelativeLayout lyGuideBook;
    RelativeLayout lyDob;
    RelativeLayout lyKronic;
    RelativeLayout lyNotify;
    RelativeLayout lyReminder;
    RelativeLayout lyDeleteAll;
    RelativeLayout lyExit;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = (FragmentActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_settings, container, false);
        ImageView imgView = (ImageView)v.findViewById(R.id.img_reminder);

        //Username Layout onClickmetod
        lyUser = v.findViewById(R.id.lyUser);
        lyUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateUserNameDialogFragment newFragment = new UpdateUserNameDialogFragment();
                newFragment.show(getFragmentManager(), "username");
            }
        });



        //Password Layout onClickmetod
        lyPass =v.findViewById(R.id.lyPass);
        lyPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdatePasswordDialogFragment newFragment =new UpdatePasswordDialogFragment();
                newFragment.show(getFragmentManager(), "password");
            }
        });




        //Bloodgroup Layout onClickmetod
        lyBlood = v.findViewById(R.id.lyBloodGroup);
        lyBlood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateBloodDialogFragment newFragment = new UpdateBloodDialogFragment();
                newFragment.show(getFragmentManager(), "bloodgroup");
            }
        });


/*        lyKronic =v.findViewById(R.id.lyKronic);
        lyKronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KronicFragment new Fragment() =new KronicFragment();
                newFragment.show(getFragmentManager(), "bloodgroup");
            }
        });*/

        lyReminder = v.findViewById(R.id.lyReminder);
        lyReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateUserNameDialogFragment newFragment = new UpdateUserNameDialogFragment();
                newFragment.show(getFragmentManager(), "reminder");
            }
        });

/*
        //fragment AddToGuideBook
        lyGuideBook=v.findViewById(R.id.lyGuideBook);
        lyGuideBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment =new AddToGuideFragment();
                loadFragment(fragment);
            }
        });
*/

        return v;


    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }

        return false;
    }



//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_settings, container, true);
//
//
//        imgReminder = (ImageView) find;
//
//   }


}

