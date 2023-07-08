package com.drivenet.rsa.profile.Courseoption.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.ExpandableListView.showman;
import com.drivenet.rsa.database.Student.coursepicker;
import com.drivenet.rsa.database.database.VisionDatabase;

import java.util.List;


public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ExampleViewHolder> {
    private List<coursepicker> mExampleList;
    private Context context;
    int name;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        TextView text_view_title, text_view_priority, text_view_description ,text_view_priority4;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            text_view_description = itemView.findViewById(R.id.text_view_description);
            text_view_priority = itemView.findViewById(R.id.text_view_priority);
            text_view_title = itemView.findViewById(R.id.text_view_title);
            text_view_priority4 = itemView.findViewById(R.id.text_view_priority4);
        }
    }

    public CourseAdapter(Context context, List<coursepicker> exampleList, int name) {
        mExampleList = exampleList;
        this.context = context;
        this.name = name;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item,parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        coursepicker currentItem = mExampleList.get(position);
        holder.text_view_title.setText(currentItem.getProgrammes());
        holder.text_view_description.setText(currentItem.getUniversity());
        holder.text_view_priority.setText(String.valueOf(currentItem.getAps()));
        holder.text_view_priority4.setText(String.valueOf(name));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, currentItem.getProgrammes(), Toast.LENGTH_SHORT).show();
                VisionDatabase.getDatabase(context).getUpdate().holder(
                        currentItem.getAps(),
                        currentItem.getUniversity(),
                        currentItem.getProgrammes(),
                        currentItem.getFaculty(),
                        currentItem.getCareers(),
                        currentItem.getRequirements(),
                        currentItem.getYear(),
                        currentItem.getNotes(),
                        name
                );
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new showman()).addToBackStack(null).commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        return  mExampleList.size();
    }

}