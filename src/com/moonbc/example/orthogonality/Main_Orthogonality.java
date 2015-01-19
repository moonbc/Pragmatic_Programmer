package com.moonbc.example.orthogonality;

public class Main_Orthogonality {

   public Main_Orthogonality () {

    }

   public void excute(){
       Inventory inventory = new Inventory();
       inventory.addClothe("0001", "Prada", "Black", "100", "Silk");
       inventory.addClothe("0002", "Union", "Red", "100", "Silk");
       inventory.addClothe("0003", "Polo", "Black", "100", "Silk");
       inventory.addClothe("0004", "Prada", "White", "100", "Silk");
       
       Clothe_Type searchType= new Clothe_Type("Union", "Red", "100", "Silk");
       
//       inventory.search(searchType);
       inventory.print(inventory.search(searchType));
//       inventory.print(inventory.getClothes());
   }
    
}
