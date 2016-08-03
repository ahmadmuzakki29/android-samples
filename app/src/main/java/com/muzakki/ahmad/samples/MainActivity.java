package com.muzakki.ahmad.samples;

import android.os.Bundle;
import android.util.Log;

import com.muzakki.ahmad.material.dashboard.DashboardActivity;
import com.muzakki.ahmad.material.dashboard.DashboardItem;

import java.util.ArrayList;

public class MainActivity extends DashboardActivity {

    private ArrayList<DashboardItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items = new ArrayList<>();
        items.add(new DashboardItem("Menu 1",R.drawable.picture));
        items.add(new DashboardItem("Menu 2",R.drawable.picture));
        items.add(new DashboardItem("Menu 3",R.drawable.picture));
        items.add(new DashboardItem("Menu 4",R.drawable.picture));
        items.add(new DashboardItem("Menu 5",R.drawable.picture));
        render();
    }

    @Override
    protected ArrayList<DashboardItem> getItems() {
        return items;
    }

    @Override
    protected void onMenuClick(int i) {
        Log.i("jeki","clicked:"+i);
    }


}
