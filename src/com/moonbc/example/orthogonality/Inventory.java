package com.moonbc.example.orthogonality;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Clothe> clothes= null;

    public List<Clothe> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothe> clothes) {
        this.clothes = clothes;
    }

    public Inventory() {
        clothes = new ArrayList<Clothe>();
    }

    public void addClothe(String serialNumber, String brandName, String color, String size, String fabric) {
        
        Clothe_Type clothe_type = new Clothe_Type(brandName, color, size, fabric);
        Clothe clothe= new Clothe(serialNumber,clothe_type );
        clothes.add(clothe);
    }
    
    public List<Clothe> search(Clothe_Type searchType) {
        
        List<Clothe> machingClothes = new ArrayList<Clothe>();
        
        for(Iterator<Clothe> i = clothes.iterator(); i.hasNext();) {
            Clothe clothe = i.next();
            Clothe_Type clothe_type = clothe.get_Type();
            
            if(clothe.get_Type().matches(searchType)) {
                machingClothes.add(clothe);
            }
        }
        
        
        return machingClothes;
        
    }
    
    public void print(List<Clothe> serachClothes) {
        for(Iterator<Clothe> i = serachClothes.iterator(); i.hasNext();) {
            Clothe clothe = i.next();
            Clothe_Type clothe_type = clothe.get_Type();
            System.out.println("Serial number = " + clothe.get_SerialNumber());
//            System.out.println("Type = " + clothe.get_Type());

            System.out.println("Serial number = " + clothe_type.get_BrandName());
            System.out.println("Color = " + clothe_type.get_Color());
            System.out.println("Fabric = " + clothe_type.get_Fabric());
            System.out.println("Size = " + clothe_type.get_Size());
            System.out.println("------------------------------------------------");
        }
        
    }
    
}
