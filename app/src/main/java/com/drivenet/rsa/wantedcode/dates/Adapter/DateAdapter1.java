package com.drivenet.rsa.wantedcode.dates.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.database.database.VisionDatabase;
import com.drivenet.rsa.wantedcode.dates.showdate.ShowDates;
import com.drivenet.rsa.Institutions.uniSA.ec.nmu;
import com.drivenet.rsa.Institutions.uniSA.ec.ru;
import com.drivenet.rsa.Institutions.uniSA.ec.ufh;
import com.drivenet.rsa.Institutions.uniSA.ec.wsu;
import com.drivenet.rsa.Institutions.uniSA.fs.cut;
import com.drivenet.rsa.Institutions.uniSA.fs.ufs;
import com.drivenet.rsa.Institutions.uniSA.g.smu;
import com.drivenet.rsa.Institutions.uniSA.g.tut;
import com.drivenet.rsa.Institutions.uniSA.g.uj;
import com.drivenet.rsa.Institutions.uniSA.g.unisa;
import com.drivenet.rsa.Institutions.uniSA.g.up;
import com.drivenet.rsa.Institutions.uniSA.g.uwj.uwj;
import com.drivenet.rsa.Institutions.uniSA.g.vut;
import com.drivenet.rsa.Institutions.uniSA.k.dut;
import com.drivenet.rsa.Institutions.uniSA.k.kzn;
import com.drivenet.rsa.Institutions.uniSA.k.mut;
import com.drivenet.rsa.Institutions.uniSA.k.unizulu;
import com.drivenet.rsa.Institutions.uniSA.l.ul;
import com.drivenet.rsa.Institutions.uniSA.l.univen;
import com.drivenet.rsa.Institutions.uniSA.m.ump;
import com.drivenet.rsa.Institutions.uniSA.nc.spu;
import com.drivenet.rsa.Institutions.uniSA.nw.nwu;
import com.drivenet.rsa.Institutions.uniSA.wc.cput;

import com.drivenet.rsa.Institutions.uniSA.wc.uct;
import com.drivenet.rsa.Institutions.uniSA.wc.uwc;

import java.util.ArrayList;

public class DateAdapter1 extends RecyclerView.Adapter<DateAdapter1.ExampleViewHolder> {
    private ArrayList<DateItem1> mExampleList;

    private Context context;
    
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        private TextView head1;
        private Button button;



        public ExampleViewHolder(View itemView) {
            super(itemView);
            head1 = itemView.findViewById(R.id.head1);
            button = itemView.findViewById(R.id.button);
        }
    }

    public DateAdapter1(ArrayList<DateItem1> exampleList , Context context) {
        mExampleList = exampleList;
        this.context =context;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_date , parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        DateItem1 currentItem = mExampleList.get(position);

        holder.head1.setText(currentItem.getmText1());
        holder.head1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(currentItem);
            }
        });
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show1(currentItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    private void show1(DateItem1 currentItem){
        if((currentItem.getmText1().equals("University of Cape Town")))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Cape Town");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("University of the Witwatersrand"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of the Witwatersrand");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("University of the Western Cape"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of the Western Cape");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("Sol Plaatje University"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Sol Plaatje University");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("Rhodes University"))
        {

            VisionDatabase.getDatabase(context).getUpdate().settinguni("Rhodes University");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of the Free State"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of the Free State");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of Pretoria"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Pretoria");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of KwaZulu-Natal"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of KwaZulu-Natal");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of Johannesburg"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Johannesburg");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("North-West University" ))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("North-West University");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("Nelson Mandela University"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Nelson Mandela University");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of South Africa"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of South Africa");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of Zululand"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Zululand");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("Walter Sisulu University for Technology"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Walter Sisulu University for Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of Limpopo"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Limpopo");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of Fort Hare"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Fort Hare");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("Sefako Makgatho Health Sciences University"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Sefako Makgatho Health Sciences University");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("University of Mpumalanga"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Mpumalanga");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("Tshwane University of Technology"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Tshwane University of Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();

        }
        else if(currentItem.getmText1().equals("University of Venda"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("University of Venda");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();

        }
        else if(currentItem.getmText1().equals("Central University of Technology"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Central University of Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();


        }
        else if(currentItem.getmText1().equals("Cape Peninsula University of Technology"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Cape Peninsula University of Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();

        }
        else if(currentItem.getmText1().equals("Durban University of Technology"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Cape Peninsula University of Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("Mangosuthu University of Technology"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Mangosuthu University of Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("Vaal University of Technology"))
        {
            VisionDatabase.getDatabase(context).getUpdate().settinguni("Vaal University of Technology");
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowDates()).addToBackStack(null).commit();

        }
    }


    private void show(DateItem1 currentItem){
        if((currentItem.getmText1().equals("University of Cape Town")))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uct()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("University of the Witwatersrand"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwj()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("University of the Western Cape"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwc()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("Sol Plaatje University"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new spu()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("Rhodes University"))
        {
            
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ru()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of the Free State"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufs()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of Pretoria"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new up()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of KwaZulu-Natal"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new kzn()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of Johannesburg"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uj()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("North-West University" ))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nwu()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("Nelson Mandela University"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nmu()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of South Africa"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unisa()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of Zululand"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unizulu()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("Walter Sisulu University for Technology"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new wsu()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of Limpopo"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ul()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of Fort Hare"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufh()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("Sefako Makgatho Health Sciences University"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new smu()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("University of Mpumalanga"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ump()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("Tshwane University of Technology"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new tut()).addToBackStack(null).commit();
            
        }
        else if(currentItem.getmText1().equals("University of Venda"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new univen()).addToBackStack(null).commit();
            
        }
        else if(currentItem.getmText1().equals("Central University of Technology"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cut()).addToBackStack(null).commit();

            
        }
        else if(currentItem.getmText1().equals("Cape Peninsula University of Technology"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cput()).addToBackStack(null).commit();
            
        }
        else if(currentItem.getmText1().equals("Durban University of Technology"))
        {
           
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new dut()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("Mangosuthu University of Technology"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new mut()).addToBackStack(null).commit();
        }
        else if(currentItem.getmText1().equals("Vaal University of Technology"))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new vut()).addToBackStack(null).commit();
            
        }
    }

    public void filterList(ArrayList<DateItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}