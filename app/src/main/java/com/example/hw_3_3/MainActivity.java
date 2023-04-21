package com.example.hw_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        extraHomeWorkOne();
        extraHomeWorkTwo();
    }

    private void initList() {
        ArrayList<Contact> arrayList = new ArrayList<>();
        arrayList.add(new Contact(R.drawable.img, "пеперонни", "599 сом"));
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Contact(R.drawable.ic_launcher_foreground, "name" + i, "surname" + i));
        }
        ContactAdapter contactAdapter = new ContactAdapter(arrayList);
        RecyclerView recyclerView;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(contactAdapter);
    }

    private void extraHomeWorkOne() {
        int[] one = {9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233};
        Arrays.sort(one);
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.println(one[i]);
        }
    }

    private void extraHomeWorkTwo() {
        int[] two = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i : two) {
            if ((i & 1) == 1) {
                odd.add(i);
            } else {
                even.add(i);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.println(odd);
        System.out.println(even);

    }
}