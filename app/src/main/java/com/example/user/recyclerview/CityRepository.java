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
        cities = new City[30];

        cities[0] = new City("Ульяновск", 624518);
        cities[1] = new City("Нижний Новгород", 1261666);
        cities[2] = new City("Москва",12330126 );
        cities[3] = new City("Санкт-Петербург",525690 );
        cities[4] = new City("Новосибирск",1584138 );
        cities[5] = new City("Екатеринбург",1455514 );
        cities[6] = new City("Казань",1231878 );
        cities[7] = new City("Челяинск", 1198858);
        cities[8] = new City("Омск", 1178391);
        cities[9] = new City("Самара", 1169719);
        cities[10] = new City("Ростов-на-Дону",1125299 );
        cities[11] = new City("Уфа", 1115560);
        cities[12] = new City("Красноярск", 1082933);
        cities[13] = new City("Пермь", 1048005);
        cities[14] = new City("Воронеж",1039801 );
        cities[15] = new City("Волгоград",1015586 );
        cities[16] = new City("Краснодар",881476 );
        cities[17] = new City("Саратов",845300 );
        cities[18] = new City("Тюмень",744554 );
        cities[19] = new City("Тольяти",710567 );
        cities[20] = new City("Ижевск",646277 );
        cities[21] = new City("Барнаул",633301 );
        cities[22] = new City("Иркутск",623736 );
        cities[23] = new City("Хабаровск",616242 );
        cities[24] = new City("Ярославль",608079 );
        cities[25] = new City("Владивосток",606589 );
        cities[26] = new City("Махачкала",592976 );
        cities[27] = new City("Томск",572740 );
        cities[28] = new City("Оренбург",564443 );
        cities[29] = new City("Кемеров",556920 );
    }

}
