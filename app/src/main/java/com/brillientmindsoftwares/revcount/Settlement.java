package com.brillientmindsoftwares.revcount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ABKMAA5 on 9/18/2017.
 */

public class Settlement extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settlements, container, false);
        return rootView;
    }
}
