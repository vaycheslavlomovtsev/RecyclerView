package com.example.user.recyclerview;

import android.support.annotation.NonNull;

import java.lang.*;
import java.lang.Comparable;

/**
 * Created by user on 16.10.17.
 */

public class City  {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}