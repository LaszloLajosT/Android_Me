package com.example.android.android_me.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BodyPartFragment extends Fragment {

    // Mandatory constructor for instantiating the fragment
    public BodyPartFragment() {
    }

    /**
     *  Inflates the fragment layout and sets any image resources
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = rootView.findViewById(R.id.body_part_image_view);

        // Set the image resource to display
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        // Return root view
        return rootView;

    }
}
