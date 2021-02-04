package com.example.recyclerfragchallenge;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Car> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<Car>();

        cars.add(new Car("Nissan", "Almera", "John Doe", "030999456"));
        cars.add(new Car("Mercedes", "E109", "Victory Scar", "03099456756"));
        cars.add(new Car("Volkswagen", "Tortoise", "Moskie Ra", "0304561256"));
        cars.add(new Car("Nissan", "Almera", "Jallet Wenip", "03099986456"));
        cars.add(new Car("Mercedes", "E349", "Poimy Whale", "03099456756"));
        cars.add(new Car("Volkswagen", "Poise", "Lykie Boom", "0904574256"));
        cars.add(new Car("Nissan", "Spidy", "Sally Noroe", "040996769456"));
        cars.add(new Car("Mercedes", "A009", "Loppy Soop", "08099426556"));
        cars.add(new Car("Volkswagen", "Snail", "Pie Chart", "0304561256"));
        cars.add(new Car("Nissan", "Palmera", "Jane Goe", "030999456"));
        cars.add(new Car("Mercedes", "T119", "Vic Par", "23098456756"));
        cars.add(new Car("Volkswagen", "Bat", "Molly Rake", "0304561256"));

    }
}
