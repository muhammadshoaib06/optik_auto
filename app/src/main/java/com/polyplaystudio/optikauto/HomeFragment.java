package com.polyplaystudio.optikauto;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    Intent intent, exitIntent;
    ImageView arrivingImgView, exitImgView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        arrivingImgView = rootView.findViewById(R.id.arriving_image);
        exitImgView = rootView.findViewById(R.id.exit_image);

        intent = new Intent(getActivity(), ArrivingScanActivity.class);
        arrivingImgView.setOnClickListener(v -> startActivity(intent));

        exitIntent = new Intent(getActivity(), ExitScanActivity.class);
        exitImgView.setOnClickListener(v -> startActivity(exitIntent));

        return rootView;
    }
}