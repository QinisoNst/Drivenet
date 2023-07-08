package com.drivenet.rsa.wantedcode.aps.subjects.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.wantedcode.aps.Aps;

import java.util.ArrayList;

public class lanAdapter1 extends RecyclerView.Adapter<lanAdapter1.ExampleViewHolder> {
    private ArrayList<lanItem1> mExampleList;
    private Context context;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);

        }
    }

    public lanAdapter1(ArrayList<lanItem1> exampleList, Context context) {
        mExampleList = exampleList;
        this.context = context;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_subandpro ,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        lanItem1 currentItem = mExampleList.get(position);

        holder.name.setText(currentItem.getmText1());
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentItem.getmText1().equals("Afrikaans"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;

                    VisionDatabase.getDatabase(context).getUpdate().lang("Afrikaans");
                }

                else if (currentItem.getmText1().equals("IsiNdebele"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("IsiNdebele");
                }
                else if (currentItem.getmText1().equals("IsiXhosa"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    
                    VisionDatabase.getDatabase(context).getUpdate().lang("IsiXhosa");
                }
                else if (currentItem.getmText1().equals("IsiZulu")) {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("IsiZulu");
                }
                else if (currentItem.getmText1().equals("Sepedi"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("Sepedi");
                }
                else if (currentItem.getmText1().equals("Sesotho"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("Sesotho");
                    return;
                }
                else if (currentItem.getmText1().equals("Siswati"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("Siswati");
                    return;
                }
                else if (currentItem.getmText1().equals("Tshivenda"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("Tshivenda");
                    return;
                }
                else if (currentItem.getmText1().equals("Xitsonga"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("Xitsonga");
                    return;
                }
                else if (currentItem.getmText1().equals("Sign language"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;
                    VisionDatabase.getDatabase(context).getUpdate().lang("Sign language");
                    return;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<lanItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}