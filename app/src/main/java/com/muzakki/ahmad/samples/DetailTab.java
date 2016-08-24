package com.muzakki.ahmad.samples;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.muzakki.ahmad.material.detail.DetailTabActivity;

public class DetailTab extends DetailTabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleSubtitle("KOREO\r\nhdhdgf","kok iso ngakoni");
        render();
    }

    @Override
    protected View getTabView(int i, ViewGroup parent, Bundle savedInstanceState) {
        return null;
    }
}
