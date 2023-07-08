package com.drivenet.rsa.wantedcode.aps.subjects.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.drivenet.rsa.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private List<Province> provinceNamesList = null;
    private ArrayList<Province> arraylist;
    public PAdapter(Context context, List<Province> provinceNamesList) {
        mContext = context;
        this.provinceNamesList = provinceNamesList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<Province>();
        this.arraylist.addAll(provinceNamesList);
    }
    public class ViewHolder {
        TextView name;
        ImageView image;
    }
    @Override
    public int getCount() {
        return provinceNamesList.size();
    }
    @Override
    public Province getItem(int position) {
        return provinceNamesList.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        final ViewHolder holdera;
        if (view == null) {

            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_layout, null);
            holder.name = (TextView) view.findViewById(R.id.name);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(provinceNamesList.get(position).getAnimalName());

        return view;
    }
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        provinceNamesList.clear();
        if (charText.length() == 0) {
            provinceNamesList.addAll(arraylist);
        } else {
            for (Province wp : arraylist) {
                if (wp.getAnimalName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    provinceNamesList.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}
