package com.nini.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class fragmentMain extends Fragment {

    Button BtnArr[] = new Button[15];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        for (int i = 0; i < 15; i++) {
            int id = getResources().getIdentifier("butt_"+ i, "id","com.nini.menu");
            BtnArr[i] = rootView.findViewById(id);
            BtnArr[i].setText("This is Button NO." + (i+1));
        }

        /*
        int id = getResources().getIdentifier("butt_"+ 0, "id","com.nini.menu");
        Button btn = rootView.findViewById(id);
        btn.setText("fuckyou");
        */

        return rootView;
    }
}
