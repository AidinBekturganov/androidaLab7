package com.example.lab7;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {


    private String[] names = {"Oleg", "Sergei", "Vladimir", "Vanya", "Fedor", "Heras", "Chingiz", "Aidar", "Shi", "Chu", "Chan", "Fedor", "Heras", "Fedor", "Heras", "Shin", "Penkin", "Shin", "Penkin", "Shin", "Penkin", "Shin", "Penkin", "Heras", "Chingiz", "Aidar"};
    private String[] lastNames = {"Shin", "Penkin", "Putin", "Naval", "Shil", "Hex", "Jask", "Avai", "Djig", "Wond", "Jack", "Shin", "Penkin", "Shin", "Penkin", "Shin", "Penkin", "Shin", "Penkin", "Shin", "Penkin", "Shin", "Penkin", "Vanya", "Fedor", "Heras"};
    private List<Student> studentList = new ArrayList<>();

    private int[] images = {R.drawable.download11, R.drawable.dwadwad, R.drawable.images, R.drawable.images2,
            R.drawable.images3, R.drawable.images4, R.drawable.images5, R.drawable.images6, R.drawable.images7, R.drawable.images8,
            R.drawable.images8, R.drawable.images9, R.drawable.images10, R.drawable.images5, R.drawable.images7, R.drawable.images5, R.drawable.images7, R.drawable.images5, R.drawable.images7, R.drawable.images5, R.drawable.images7, R.drawable.images5,
            R.drawable.images7, R.drawable.images3, R.drawable.images4, R.drawable.images5};
    private RecyclerView recyclerView;


    private void prepareTheList()
    {
        int count = 0;
        for(String name : names)
        {
            Student student = new Student(name, lastNames[count], images[count]);
            studentList.add(student);
            count++;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_third, container, false);
        recyclerView = view.findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        prepareTheList();
        RecyclerAdapter adapter = new RecyclerAdapter(studentList);
        recyclerView.setAdapter(adapter);


        return view;

    }
}