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
    RelativeLayout lyEducation;
    RelativeLayout lyJob;
    RelativeLayout lyGender;
    RelativeLayout lyMaritalStatus;
    RelativeLayout lyDob;
    RelativeLayout lyGuideBook;
    RelativeLayout lyKronic;
    RelativeLayout lyBlood;
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

        //Education Layout onClickmetod
        lyEducation =v.findViewById(R.id.lyEducation);
        lyEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateEducationDialogFragment newFragment =new UpdateEducationDialogFragment();
                newFragment.show(getFragmentManager(),"education");
            }
        });

        //Job Layout onClickmetod
        lyJob =v.findViewById(R.id.lyJob);
        lyJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateJobDialogFragment newFragment =new UpdateJobDialogFragment();
                newFragment.show(getFragmentManager(),"job");
            }
        });

        //Gender Layout onClickmetod
        lyGender=v.findViewById(R.id.lyGender);
        lyGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateGenderDialogFragment newFragment =new UpdateGenderDialogFragment();
                newFragment.show(getFragmentManager(),"gender");
            }
        });


        //MaritalStatus Layout onClickmetod
        lyMaritalStatus =v.findViewById(R.id.lyMaritalStatus);
        lyMaritalStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateMaritalStatusDialogFragment newFragment =new UpdateMaritalStatusDialogFragment();
                newFragment.show(getFragmentManager(),"marital_status");
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


        //fragment AddToGuideBook
        lyGuideBook=v.findViewById(R.id.lyGuideBook);
        lyGuideBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment =new AddToGuideFragment();
                loadFragment(fragment);
            }
        });


        lyKronic =v.findViewById(R.id.lyKronic);
        lyKronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment =new KronicFragment();
                loadFragment(fragment);
            }
        });

        return v;


    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            this.context.getSupportFragmentManager()
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

