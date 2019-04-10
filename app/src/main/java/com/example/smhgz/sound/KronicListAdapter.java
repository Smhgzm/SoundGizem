package com.example.smhgz.sound;



import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class KronicListAdapter extends BaseAdapter {


    List<MenuFragment.MenuItem> list;
    LayoutInflater mInflater;
    Activity mActivity;
    FragmentManager fragmentManager;

    public KronicListAdapter(Activity activity, List<MenuFragment.MenuItem> list, FragmentManager fragmentManager)
    {
        this.mActivity = activity;
        this.list = list;
        this.mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.fragmentManager = fragmentManager;
    }

    public KronicListAdapter(FragmentActivity activity, List<KronicFragment.MenuItem> menuItems, FragmentManager supportFragmentManager) {
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView;
        MenuFragment.MenuItem item = list.get(position);
        rowView = mInflater.inflate(R.layout.kronic_row_layout, null);
        TextView text = rowView.findViewById(R.id.menu_row_text);
        //rowView.setTag(item.getTag());


        text.setText(item.getTitle());
        rowView.setTag(item.getTag());
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                switch (v.getTag().toString()) {
                    case "message" : {
                        fragment = new ProfileFragment();
                        Log.d("menu_log", "message fragment");
                        break;
                    }
                    case "location" : {
                        Log.d("menu_log", "location fragment");
                        break;
                    }
                }
                loadFragment(fragment);
            }
        });

        return rowView;
    }

    private boolean loadFragment(Fragment fragment)
    {
        if (fragment != null) {
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }

        return false;
    }

}


