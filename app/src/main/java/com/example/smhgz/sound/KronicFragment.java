package com.example.smhgz.sound;



import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class KronicFragment extends Fragment {

    private FragmentActivity context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = (FragmentActivity) context;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.kronic_illnesses, container, false);

        ListView list = view.findViewById(R.id.list_menu);
        KronicListAdapter adapter = new KronicListAdapter(getActivity(), menuItems(), this.context.getSupportFragmentManager());
        list.setAdapter(adapter);
        return view;
    }

    public List<MenuItem> menuItems() {
        List<MenuItem> items = new ArrayList<>();

        items.add(new MenuItem(R.string.kronic_astim, "astım"));
        items.add(new MenuItem(R.string.kronic_addison, "share"));
        items.add(new MenuItem(R.string.kronic_alzheimer, "rate_us"));
        items.add(new MenuItem(R.string.kronic_behcet, "feedback"));
        items.add(new MenuItem(R.string.kronic_bobrek, "contact"));
        items.add(new MenuItem(R.string.kronic_cilt, "about_us"));
        items.add(new MenuItem(R.string.kronic_dismenore, "exit"));
        items.add(new MenuItem(R.string.kronic_endokrin, "exit"));
        items.add(new MenuItem(R.string.kronic_fibromyalji, "exit"));
        items.add(new MenuItem(R.string.kronic_gastrit, "exit"));
        items.add(new MenuItem(R.string.kronic_göz, "exit"));
        items.add(new MenuItem(R.string.kronic_hormon, "exit"));
        items.add(new MenuItem(R.string.kronic_immun, "exit"));
        items.add(new MenuItem(R.string.kronic_kalpdamar, "exit"));
        items.add(new MenuItem(R.string.kronic_kanser, "exit"));
        items.add(new MenuItem(R.string.kronic_karaciğer, "exit"));
        items.add(new MenuItem(R.string.kronic_kas, "exit"));
        items.add(new MenuItem(R.string.kronic_kulak, "exit"));
        items.add(new MenuItem(R.string.kronic_kusing, "exit"));
        items.add(new MenuItem(R.string.kronic_lyme, "exit"));
        items.add(new MenuItem(R.string.kronic_meniere, "exit"));
        items.add(new MenuItem(R.string.kronic_migren, "exit"));
        items.add(new MenuItem(R.string.kronic_ms, "exit"));
        items.add(new MenuItem(R.string.kronic_norolojik, "exit"));
        items.add(new MenuItem(R.string.kronic_parkinson, "exit"));
        items.add(new MenuItem(R.string.kronic_psyco, "exit"));
        items.add(new MenuItem(R.string.kronic_romatizma, "exit"));
        items.add(new MenuItem(R.string.kronic_sle, "exit"));
        items.add(new MenuItem(R.string.kronic_solunum, "exit"));
        items.add(new MenuItem(R.string.kronic_tiroid, "exit"));
        items.add(new MenuItem(R.string.kronic_tuberkuloz, "exit"));
        items.add(new MenuItem(R.string.kronic_ulser, "exit"));
        items.add(new MenuItem(R.string.kronic_verem, "exit"));
        items.add(new MenuItem(R.string.kronic_yuksek_tansiyon, "exit"));

        return items;
    }


    class MenuItem {

        int title;
        String tag;

        MenuItem(int title, String tag) {

            this.title = title;
            this.tag = tag;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }


        public int getTitle() {
            return title;
        }

        public void setTitle(int title) {
            this.title = title;
        }
    }
}

