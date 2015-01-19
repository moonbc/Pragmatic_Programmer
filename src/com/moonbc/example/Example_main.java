package com.moonbc.example;

import com.moonbc.example.orthogonality.Clothe_Type;
import com.moonbc.example.orthogonality.Inventory;

public class Example_main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        
        inventory.addClothe("0001", "Prada", "Black", "100", "Silk");
        inventory.addClothe("0002", "Union", "Red", "100", "Silk");
        inventory.addClothe("0003", "Polo", "Black", "100", "Silk");
        inventory.addClothe("0004", "Prada", "White", "100", "Silk");
        
        Clothe_Type searchType= new Clothe_Type("Polo", "Black","100", "Silk" );
        
//        inventory.search(searchType);
        inventory.print(inventory.search(searchType));
        
//        inventory.print(inventory.getClothes());
        
    }
}
