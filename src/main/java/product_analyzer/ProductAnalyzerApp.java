package product_analyzer;

import product_analyzer.domain.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductAnalyzerApp {

    public static void main(String[] args) {
        //todo: task1 generate collection of Laptops(1_000 items), use ProductCollection class as storage.
        //      you can modify any class in product_analyzer.domain package if you need.
        int ArrayCapacity = 1_000;
        Collection<Laptop> LaptopCollection = new ArrayList<>();
        for (int i = 0; i < ArrayCapacity; i++) {
            LaptopCollection.add(new Laptop("Laptop # " + i));
        }
        for (Laptop laptop : LaptopCollection) {
            System.out.println(laptop.name);
        }
        //todo: task2 generate collection of Phones(1_000 items). It doesn't exist, you need to create it. Use ProductCollection class as storage.
        //      you can modify any class in product_analyzer.domain package if you need.
        Collection<Phone> PhoneCollection = new ArrayList<>();
        for (int i = 0; i < ArrayCapacity; i++) {
            PhoneCollection.add(new Phone("Phone # " + i));
        }
        for (Phone phone : PhoneCollection) {
            System.out.println(phone.name);
            //todo: task3[optional] generate collections in task1 and task2 in thread, generate 10_000 items in total, you need to create 10 threads, each you generate 1_000 items.
            //      make sure the result is correct, fix bug is there will be a need.
        }
        Person john = new Person("John");
        Person jane = new Person("Jane");

        List<Person> people = new ArrayList<>();
        people.add(john);
        people.add(jane);

        //todo: print names
        people.forEach((person -> System.out.println(person.name)));
    }
}
