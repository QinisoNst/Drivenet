
package com.drivenet.rsa.wantedcode.careers.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.wantedcode.aps.showaps.port.nc.spu.ShowSpu;
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
import com.drivenet.rsa.Institutions.uniSA.wc.su;
import com.drivenet.rsa.Institutions.uniSA.wc.uct;
import com.drivenet.rsa.Institutions.uniSA.wc.uwc;

import java.util.ArrayList;

public class CareerAdapter extends RecyclerView.Adapter<CareerAdapter.ExampleViewHolder> {
    private ArrayList<CareerItem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1,mTextView2;
        public ImageView imageView;
        public CardView card_view;
        public ExampleViewHolder(View itemView) {
            super(itemView);
            card_view =  itemView.findViewById(R.id.card_view);
            mTextView1 = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.imageView4);

        }
    }

    public CareerAdapter(ArrayList<CareerItem> exampleList) {
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.career_item,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        CareerItem currentItem = mExampleList.get(position);


        holder.mTextView1.setText(currentItem.getText1());
        holder.imageView.setImageResource(currentItem.getText2());

        holder.mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(currentItem);
            }
        });
        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                show1(currentItem);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return mExampleList.size();
    }
    private void show(CareerItem currentItem)
    {
        if((currentItem.getText1().equals("University of Cape Town")))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uct()).addToBackStack(null).commit();
        }
        else if(currentItem.getText1().equals("University of the Witwatersrand"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwj()).addToBackStack(null).commit();
        }
        else if(currentItem.getText1().equals("University of the Western Cape"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwc()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Sol Plaatje University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new spu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Rhodes University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ru()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of the Free State"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufs()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Pretoria"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new up()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of KwaZulu-Natal"))
        {
            ;
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new kzn()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Johannesburg"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uj()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("North-West University" ))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nwu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Nelson Mandela University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nmu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of South Africa"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unisa()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Zululand"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unizulu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Walter Sisulu University for Technology"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new wsu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Limpopo"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ul()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Fort Hare"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufh()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Sefako Makgatho Health Sciences University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new smu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Mpumalanga"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ump()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Tshwane University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new tut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Venda"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new univen()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Stellenbosch University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new su()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Central University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Cape Peninsula University of Technology"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cput()).addToBackStack(null).commit();

            return;

        }
        else if(currentItem.getText1().equals("Durban University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new dut()).addToBackStack(null).commit();

            return;

        }
        else if(currentItem.getText1().equals("Mangosuthu University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new mut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Vaal University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new vut()).addToBackStack(null).commit();

            return;
        }
    }
    private void show1(CareerItem currentItem)
    {
        if((currentItem.getText1().equals("University of Cape Town")))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uct()).addToBackStack(null).commit();
        }
        else if(currentItem.getText1().equals("University of the Witwatersrand"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwj()).addToBackStack(null).commit();
        }
        else if(currentItem.getText1().equals("University of the Western Cape"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uwc()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Sol Plaatje University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowSpu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Rhodes University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ru()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of the Free State"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufs()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Pretoria"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new up()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of KwaZulu-Natal"))
        {
            ;
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new kzn()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Johannesburg"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uj()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("North-West University" ))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nwu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Nelson Mandela University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new nmu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of South Africa"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unisa()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Zululand"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new unizulu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Walter Sisulu University for Technology"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new wsu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Limpopo"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ul()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Fort Hare"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ufh()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Sefako Makgatho Health Sciences University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new smu()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Mpumalanga"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ump()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Tshwane University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new tut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("University of Venda"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new univen()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Stellenbosch University"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new su()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Central University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Cape Peninsula University of Technology"))
        {


            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new cput()).addToBackStack(null).commit();

            return;

        }
        else if(currentItem.getText1().equals("Durban University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new dut()).addToBackStack(null).commit();

            return;

        }
        else if(currentItem.getText1().equals("Mangosuthu University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new mut()).addToBackStack(null).commit();

            return;
        }
        else if(currentItem.getText1().equals("Vaal University of Technology"))
        {

            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new vut()).addToBackStack(null).commit();

            return;
        }
    }
    public void filterList(ArrayList<CareerItem> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}