package com.example.FitnessAndFood;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DietVegan5 extends Fragment {

    RecyclerView recyclerView;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.diet_vegan,container,false);

        recyclerView = v.findViewById(R.id.rv_dietvegan);

        veganList();


        return v;
    }

    public void veganList(){

        ArrayList<Integer> iconList = new ArrayList<>();
        ArrayList<String> mealTitle= new ArrayList<>();
        ArrayList<String> mealList1= new ArrayList<>();
        ArrayList<String> mealList2= new ArrayList<>();

        iconList.add(R.drawable.breakfast);
        iconList.add(R.drawable.snacks);
        iconList.add(R.drawable.lunch);
        iconList.add(R.drawable.dinner);

        mealTitle.add("BREAKFAST");
        mealTitle.add("SNACKS");
        mealTitle.add("LUNCH");
        mealTitle.add("DINNER");

        mealList1.add("~ 1 cup of tea or hot cocoa without sugar or milk");
        mealList1.add("~ Any no-salted nuts");
        mealList1.add("~ 1 grapefuit or orange");
        mealList1.add("~ Fat-free yogurt or milk with some berries");

        mealList2.add("~ 2 scrambled eggs (no butter or oil)");
        mealList2.add("");
        mealList2.add("~ Cooked or baked beans (soybeans, lentiles, black beans etc.)");
        mealList2.add("~ Cooked black bean pasta or chickpea pasta");

        DietVeganRVAdapter dietVeganRVAdapter =
                new DietVeganRVAdapter(getActivity(),iconList,mealTitle,mealList1,mealList2);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(dietVeganRVAdapter);

    }


}