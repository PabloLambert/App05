package com.lambertsoft.app05;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by InnovaTI on 26-12-14.
 */
public class DetailFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanced) {
        View view = inflater.inflate(R.layout.fragment_rssitem_detail, container, false);
        return view;
    }

    public void setText(String text) {
        TextView detailsText = (TextView) getView().findViewById(R.id.detailsText);
        detailsText.setText(text);
    }
}
