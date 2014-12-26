package com.lambertsoft.app05;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * Created by InnovaTI on 26-12-14.
 */
public class MyListFragment extends Fragment {

    private OnItemSelectedListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View view = (View) inflater.inflate(R.layout.fragment_rsslist_overview, container, false);
        Button button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
        return view;
    }

    public interface OnItemSelectedListener {
        public void onRssItemSelected(String link);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof  OnItemSelectedListener) {
            listener = (OnItemSelectedListener) activity;
        } else {
            throw  new ClassCastException(activity.toString() + "must implement listener");
        }
    }

    public void updateDetail() {
        String newTime = String.valueOf(System.currentTimeMillis());
        listener.onRssItemSelected(newTime);
    }
}
