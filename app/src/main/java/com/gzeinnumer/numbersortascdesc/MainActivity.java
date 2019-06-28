package com.gzeinnumer.numbersortascdesc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Model> modelList = new ArrayList<>();
        modelList.add(new Model("chandru"));
        modelList.add(new Model("mani"));
        modelList.add(new Model("vivek"));
        modelList.add(new Model("david"));

        Collections.sort(modelList, new Comparator<Model>() {
            @Override
            public int compare(Model lhs, Model rhs) {
                return lhs.getName().compareTo(rhs.getName());
            }
        });

    }

    class Model{
        String name;

        public Model(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
