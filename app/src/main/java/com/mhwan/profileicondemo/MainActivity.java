package com.mhwan.profileicondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;

import com.mhwan.profileiconview.ProfileIconView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProfileIconView profileIconView = new ProfileIconView(getApplicationContext());
        addContentView(profileIconView, new ViewGroup.LayoutParams(120, 120));
        profileIconView.setCircleBackgroundColor(getResources().getColor(R.color.colorAccent));
        profileIconView.setIconResource(R.mipmap.ic_launcher);
    }
}
