package com.drivenet.rsa.wantedcode.aps.subjects.sub1;

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

public class sub1Adapter1 extends RecyclerView.Adapter<sub1Adapter1.ExampleViewHolder> {
    private ArrayList<sub1Item1> mExampleList;
    private Context context;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);

        }
    }

    public sub1Adapter1(ArrayList<sub1Item1> exampleList ,Context context) {
        mExampleList = exampleList;
        this.context=context;
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
        sub1Item1 currentItem = mExampleList.get(position);

        holder.name.setText(currentItem.getmText1());
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(context, currentItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<sub1Item1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
    private void show(Context context, sub1Item1 currentItem)
    {
        if (currentItem.getmText1().equals("Accounting"))
        {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Accounting");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }

        else if (currentItem.getmText1().equals("Agricultural Management Practices")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("AMP");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }
        else if (currentItem.getmText1().equals("Agricultural Sciences")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Agricultural Sciences");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }
        else if (currentItem.getmText1().equals("Agricultural Technology")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Agricultural Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }
        else if (currentItem.getmText1().equals("Business Studies")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Business Studies");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }
        else if (currentItem.getmText1().equals("Civil Technology")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Civil Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }  else if (currentItem.getmText1().equals("Computer Course Technology")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("CAT");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        }  else if (currentItem.getmText1().equals("Consumer Studies")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Consumer Studies");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        }  else if (currentItem.getmText1().equals("Dance studies")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Dance studies");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }  else if (currentItem.getmText1().equals("Design")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Design");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }  else if (currentItem.getmText1().equals("Dramatic Arts")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Dramatic Arts");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }  else if (currentItem.getmText1().equals("Economics")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Economics");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }  else if (currentItem.getmText1().equals("Electrical Technology")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Electrical Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }  else if (currentItem.getmText1().equals("Engineering Graphic and Design")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("EGD");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }  else if (currentItem.getmText1().equals("History")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("History");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }
        else if (currentItem.getmText1().equals("Hospitality Studies"))

        {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Hospitality Studies");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }

        else if (currentItem.getmText1().equals("Information Technology")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Information Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        }else if (currentItem.getmText1().equals("Life Sciences")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Life Sciences");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }
        else if (currentItem.getmText1().equals("Mechanical Technology")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Mechanical Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }


        else if (currentItem.getmText1().equals("Physical Sciences")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Physical Sciences");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }
        else if (currentItem.getmText1().equals("Religion Studies")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Religion Studies");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
        }

        else if (currentItem.getmText1().equals("Music")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Music");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        }

        else if (currentItem.getmText1().equals("Technical Sciences")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Technical Sciences");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        }

        else if (currentItem.getmText1().equals("Tourism")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Tourism");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();;

        }

        else if (currentItem.getmText1().equals("Visual Arts")) {
            VisionDatabase.getDatabase(context).getUpdate().sub1("Visual Arts");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

        }
    }
}