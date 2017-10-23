package com.example.user.recyclerview;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by user on 16.10.17.
 */

class CityRepository {

    public static final int WITHOUT_ORDER = 0;
    public static final int AZ_ORDER = 1;
    public static final int HZ_ORDER = 2;

    private City[] cities;
    private City[] sort_cities_hz;
    private City[] sort_cities_ab;

    private static final CityRepository ourInstance = new CityRepository();

    static CityRepository getInstance() {
        return ourInstance;
    }

    public City[] getCities(int order) {
        switch (order) {
            case WITHOUT_ORDER:
                return cities;
            case AZ_ORDER:
                if (sort_cities_ab == null) {
                    sort_cities_ab = Arrays.copyOf(cities, cities.length);
                    Arrays.sort(sort_cities_ab, new Comparator<City>() {
                        @Override
                        public int compare(City o1, City o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    return sort_cities_ab;
                } else
                    return sort_cities_ab;
            case HZ_ORDER:
                if (sort_cities_hz == null) {
                    sort_cities_hz = Arrays.copyOf(cities, cities.length);
                    Arrays.sort(sort_cities_hz, new Comparator<City>() {
                        @Override
                        public int compare(City o1, City o2) {
                            if (o1.getPopulation() > o2.getPopulation()) {
                                return -1;
                            } else if (o1.getPopulation() < o2.getPopulation()) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                    return sort_cities_hz;
                } else
                    return sort_cities_hz;
        }
        return cities;
    }


    private CityRepository() {
        cities = new City[100];

        cities[0] = new City("Ульяновск", 624518);
        cities[1] = new City("Нижний Новгород", 1261666);
        cities[2] = new City("Москва", 12330126);
        cities[3] = new City("Санкт-Петербург", 5256901);
        cities[4] = new City("Новосибирск", 1584138);
        cities[5] = new City("Екатеринбург", 1455514);
        cities[6] = new City("Казань", 1231878);
        cities[7] = new City("Челяинск", 1198858);
        cities[8] = new City("Омск", 1178391);
        cities[9] = new City("Самара", 1169719);
        cities[10] = new City("Ростов-на-Дону", 1125299);
        cities[11] = new City("Уфа", 1115560);
        cities[12] = new City("Красноярск", 1082933);
        cities[13] = new City("Пермь", 1048005);
        cities[14] = new City("Воронеж", 1039801);
        cities[15] = new City("Волгоград", 1015586);
        cities[16] = new City("Краснодар", 881476);
        cities[17] = new City("Саратов", 845300);
        cities[18] = new City("Тюмень", 744554);
        cities[19] = new City("Тольяти", 710567);
        cities[20] = new City("Ижевск", 646277);
        cities[21] = new City("Барнаул", 633301);
        cities[22] = new City("Иркутск", 623736);
        cities[23] = new City("Хабаровск", 616242);
        cities[24] = new City("Ярославль", 608079);
        cities[25] = new City("Владивосток", 606589);
        cities[26] = new City("Махачкала", 592976);
        cities[27] = new City("Томск", 572740);
        cities[28] = new City("Оренбург", 564443);
        cities[29] = new City("Кемеров", 556920);
        cities[30] = new City("Киров", 501234);
        cities[31] = new City("Липецк", 510987);
        cities[32] = new City("Пенза", 523456);
        cities[33] = new City("Набережные Челны", 529876);
        cities[34] = new City("Астрахань", 532537);
        cities[35] = new City("Рязань", 537658);
        cities[36] = new City("Новокузнецк", 552347);
        cities[37] = new City("Чебоксары", 498765);
        cities[38] = new City("Тула", 485432);
        cities[39] = new City("Калининград", 467876);
        cities[40] = new City("Балашиха", 450465);
        cities[41] = new City("Курск", 449089);
        cities[42] = new City("Ставрополь", 422577);
        cities[43] = new City("Улан-Удэ", 431922);
        cities[44] = new City("Севастопаль", 428753);
        cities[45] = new City("Тверь", 419383);
        cities[46] = new City("Магнитогорск", 418241);
        cities[47] = new City("Сочи", 411524);
        cities[48] = new City("Иваново", 406933);
        cities[49] = new City("Брянск", 406533);
        cities[50] = new City("Прокопьевск", 196089);
        cities[51] = new City("Люберцы", 197865);
        cities[52] = new City("Бийск", 203456);
        cities[53] = new City("Мытищи", 205674);
        cities[54] = new City("Псков", 209876);
        cities[55] = new City("Королёв", 221987);
        cities[56] = new City("Великий Новгород", 222357);
        cities[57] = new City("Старый Оскол", 223874);
        cities[58] = new City("Благовещенск", 224532);
        cities[59] = new City("Энгельс", 225179);
        cities[60] = new City("Ангарск", 226943);
        cities[61] = new City("Орск", 230987);
        cities[62] = new City("Братск", 231456);
        cities[63] = new City("Дзержинск", 231876);
        cities[64] = new City("Шахты", 235492);
        cities[65] = new City("НИжнекамск", 237290);
        cities[66] = new City("Нальчик", 239843);
        cities[67] = new City("Сыктывкар", 244321);
        cities[68] = new City("Химки", 244543);
        cities[69] = new City("Комсомольск-на-Амуре", 249660);
        cities[70] = new City("Таганрог", 250287);
        cities[71] = new City("Йошкар-Ола", 266456);
        cities[72] = new City("Новороссийск", 270987);
        cities[73] = new City("Нижневартовк", 274563);
        cities[74] = new City("Кострома", 277654);
        cities[75] = new City("Петрозаводск", 278654);
        cities[76] = new City("Стерлитамак", 280987);
        cities[77] = new City("Тамбов", 290456);
        cities[78] = new City("Грозный", 291123);
        cities[79] = new City("Мурманск", 298765);
        cities[80] = new City("Подольск", 299666);
        cities[81] = new City("Владикавказ", 306532);
        cities[82] = new City("Якутск", 307149);
        cities[83] = new City("Вологда", 313428);
        cities[84] = new City("Саранск", 314326);
        cities[85] = new City("Орёл", 318434);
        cities[86] = new City("Череповец", 318645);
        cities[87] = new City("Курган", 322456);
        cities[88] = new City("Волжский", 326843);
        cities[89] = new City("Смоленск", 329871);
        cities[90] = new City("Симферополь", 341134);
        cities[91] = new City("Калуга", 341234);
        cities[92] = new City("Чита", 347089);
        cities[93] = new City("Архангельск", 351278);
        cities[94] = new City("Нижний Тагил", 355678);
        cities[95] = new City("Владимир", 356743);
        cities[96] = new City("Сургут", 360987);
        cities[97] = new City("Белгород", 391236);
        cities[98] = new City("Балаково", 191260);
        cities[99] = new City("Армавир", 190429);
    }
}


