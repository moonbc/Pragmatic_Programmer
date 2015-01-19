package com.moonbc.example.orthogonality;

public class Clothe {
    private String _SerialNumber;
    private Clothe_Type _Type;
    public Clothe(String _SerialNumber, String brandname, String color, String size, String fabric) {
        this._SerialNumber = _SerialNumber;
        this._Type = new Clothe_Type(brandname, color, size, fabric);
    }
    public String get_SerialNumber() {
        return _SerialNumber;
    }
    public Clothe_Type get_Type() {
        return _Type;
    }
    
    
    
}
