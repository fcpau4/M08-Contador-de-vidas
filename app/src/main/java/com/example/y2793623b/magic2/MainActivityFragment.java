package com.example.y2793623b.magic2;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    private MenuItem men_reset;

    private Button bt_veneno1;
    private Button bt_vida1;
    private Button bt_veneno2;
    private Button bt_vida2;
    private Button bt_veneno3;
    private Button bt_vida3;
    private Button bt_veneno4;
    private Button bt_vida4;
    private Button bt_up;
    private Button bt_down;

    private TextView txt_1;
    private TextView txt_2;

    private int vidaContlor1 = 20;
    private int vidaContlor2 = 20;
    private int venenoContlor1 = 0;
    private int venenoContlor2 = 0;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_main, container, false);


        bt_veneno1 = (Button) view.findViewById(R.id.btVeneno1);
        bt_veneno2 = (Button) view.findViewById(R.id.btVeneno2);
        bt_veneno3 = (Button) view.findViewById(R.id.btVeneno3);
        bt_veneno4 = (Button) view.findViewById(R.id.btVeneno4);

        bt_vida1 = (Button) view.findViewById(R.id.btVida1);
        bt_vida2 = (Button) view.findViewById(R.id.btVida2);
        bt_vida3 = (Button) view.findViewById(R.id.btVida3);
        bt_vida4 = (Button) view.findViewById(R.id.btVida4);

        bt_up = (Button) view.findViewById(R.id.btUp);
        bt_down = (Button) view.findViewById(R.id.btDown);

        txt_1 = (TextView) view.findViewById(R.id.txt1);
        txt_2 = (TextView) view.findViewById(R.id.txt2);

        bt_veneno1.setTextColor(Color.GREEN);
        bt_veneno2.setTextColor(Color.GREEN);
        bt_veneno3.setTextColor(Color.GREEN);
        bt_veneno4.setTextColor(Color.GREEN);


        bt_veneno1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                venenoContlor1 ++;
                txt_1.setText(vidaContlor1 + " / " + venenoContlor1);
            }
        });

        bt_veneno2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                venenoContlor1 --;
                txt_1.setText(vidaContlor1 + " / " + venenoContlor1);
            }
        });

        bt_vida1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v)
            {
                vidaContlor1 ++;
                txt_1.setText(vidaContlor1 + " / " + venenoContlor1);
            }
        });

        bt_vida2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vidaContlor1 --;
                txt_1.setText(vidaContlor1 + " / " + venenoContlor1);
            }
        });


        bt_veneno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                venenoContlor2 ++;
                txt_2.setText(vidaContlor2 + " / " + venenoContlor2);
            }
        });

        bt_veneno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                venenoContlor2 --;
                txt_2.setText(vidaContlor2 + " / " + venenoContlor2);
            }
        });


        bt_vida3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vidaContlor2 ++;
                txt_2.setText(vidaContlor2 + " / " + venenoContlor2);
            }
        });

        bt_vida4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vidaContlor2 --;
                txt_2.setText(vidaContlor2 + " / " + venenoContlor2);
            }
        });

        bt_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vidaContlor2 --;
                vidaContlor1 ++;
                txt_1.setText(vidaContlor1 + " / " + venenoContlor1);
                txt_2.setText(vidaContlor2 + " / " + venenoContlor2);

            }
        });

        bt_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vidaContlor1 --;
                vidaContlor2 ++;
                txt_1.setText(vidaContlor1 + " / " + venenoContlor1);
                txt_2.setText(vidaContlor2 + " / " + venenoContlor2);
            }
        });



        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.reset)
        {
            refrescar();
        }

        return super.onOptionsItemSelected(item);
    }

    private void refrescar() {

        vidaContlor1 = 20;
        vidaContlor2 = 20;
        venenoContlor1 = 0;
        venenoContlor2 = 0;
        txt_1.setText(vidaContlor1 + " / " + venenoContlor1);
        txt_2.setText(vidaContlor2 + " / " + venenoContlor2);

        Snackbar.make(getView(), "se ha reiniciado la partida", Snackbar.LENGTH_LONG).setAction("Action", null).show();

    }

}
