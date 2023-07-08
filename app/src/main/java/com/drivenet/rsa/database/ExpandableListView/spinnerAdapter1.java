package com.drivenet.rsa.database.ExpandableListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.drivenet.rsa.R;

public class spinnerAdapter1 extends BaseAdapter {
    Context context;

    String[] institutionNames;
    LayoutInflater inflter;

    public spinnerAdapter1(Context applicationContext, String[] institutionNames) {
        this.context = applicationContext;
        this.institutionNames = institutionNames;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return institutionNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items3, null);

        TextView names = (TextView) view.findViewById(R.id.textView1);

        names.setText(institutionNames[i]);
        return view;
    }
}