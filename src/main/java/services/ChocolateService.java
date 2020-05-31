package services;

import models.Chocolate;

import java.util.ArrayList;

public class ChocolateService {

    private static int nextId = 1;  // (1)

    private static ArrayList<Chocolate> inventory = new ArrayList();  // (2)


    public static Chocolate create(String name, String brand, int quantity, float price) {

        // (2)
        Chocolate createdChocolate = new Chocolate(nextId++, name, brand, quantity, price);

        // (3)
        inventory.add(createdChocolate);

        // (4)
        return createdChocolate;
    }
}

