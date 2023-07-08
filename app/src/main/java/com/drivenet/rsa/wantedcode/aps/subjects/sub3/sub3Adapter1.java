package com.drivenet.rsa.wantedcode.aps.subjects.sub3;

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

public class sub3Adapter1 extends RecyclerView.Adapter<sub3Adapter1.ExampleViewHolder> {
    private ArrayList<sub3Item1> mExampleList;
private Context context;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);

        }
    }

    public sub3Adapter1(ArrayList<sub3Item1> exampleList ,Context context) {
        mExampleList = exampleList;
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
        sub3Item1 currentItem = mExampleList.get(position);

        holder.name.setText(currentItem.getmText1());
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(context,currentItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<sub3Item1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
    private void show(Context context, sub3Item1 currentItem)
    {
        if (currentItem.getmText1().equals("Accounting")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
            VisionDatabase.getDatabase(context).getUpdate().sub3("Accounting");
        }

        else if (currentItem.getmText1().equals("Agricultural Management Practices")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
            VisionDatabase.getDatabase(context).getUpdate().sub3("AMP");
        }
        else if (currentItem.getmText1().equals("Agricultural Sciences")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Agricultural Sciences");

        }
        else if (currentItem.getmText1().equals("Agricultural Technology")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Agricultural Technology");
            return;
        }
        else if (currentItem.getmText1().equals("Business Studies")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Business Studies");
        }
        else if (currentItem.getmText1().equals("Civil Technology")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Civil Technology");

        }  else if (currentItem.getmText1().equals("Computer Course Technology")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("CAT");

        }  else if (currentItem.getmText1().equals("Consumer Studies")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Consumer Studies");

        }  else if (currentItem.getmText1().equals("Dance studies")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Dance studies");

        }  else if (currentItem.getmText1().equals("Design")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Design");

        }  else if (currentItem.getmText1().equals("Dramatic Arts")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Dramatic Arts");


        }  else if (currentItem.getmText1().equals("Economics")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Economics");

        }  else if (currentItem.getmText1().equals("Electrical Technology")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Electrical Technology");

        }  else if (currentItem.getmText1().equals("Engineering Graphic and Design")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("EGD");

        }  else if (currentItem.getmText1().equals("History")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("History");

        }
        else if (currentItem.getmText1().equals("Hospitality Studies")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Hospitality Studies");

        }

        else if (currentItem.getmText1().equals("Information Technology")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Information Technology");

        }else if (currentItem.getmText1().equals("Life Sciences")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Life Sciences");

        }
        else if (currentItem.getmText1().equals("Mechanical Technology")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Mechanical Technology");

        }


        else if (currentItem.getmText1().equals("Physical Sciences")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Physical Sciences");

        }
        else if (currentItem.getmText1().equals("Religion Studies")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Religion Studies");

        }

        else if (currentItem.getmText1().equals("Music")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Music");

        }

        else if (currentItem.getmText1().equals("Technical Sciences")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Technical Sciences");

        }

        else if (currentItem.getmText1().equals("Tourism")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Tourism");

        }

        else if (currentItem.getmText1().equals("Visual Arts")) {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();

            VisionDatabase.getDatabase(context).getUpdate().sub3("Visual Arts");

        }
    }
}