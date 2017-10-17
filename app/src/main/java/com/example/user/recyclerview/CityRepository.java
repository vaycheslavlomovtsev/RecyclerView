package com.example.user.recyclerview;

/**
 * Created by user on 16.10.17.
 */

class CityRepository {
    private City[] cities;
    private static final CityRepository ourInstance = new CityRepository();

    static CityRepository getInstance() {
        return ourInstance;
    }

    public City[] getCities() {
        return cities;
    }

    private CityRepository() {
        cities = new City[2];

        cities[0] = new City("Ulaynovsk", 640);
        cities[1] = new City("Nizhnii", 340);
    }

}
