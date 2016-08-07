package com.muzakki.ahmad.samples;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.muzakki.ahmad.material.dashboard.DashboardActivity;
import com.muzakki.ahmad.material.dashboard.HomeFragment;

public class MainActivity extends DashboardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected String[] getMenuItems() {
        return new String[]{"Home","Profile"};
    }

    @Override
    protected Fragment getFragmentInstance(int pos) {
        return HomeFragment.newInstance();
    }

}
