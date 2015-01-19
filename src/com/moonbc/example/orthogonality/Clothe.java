package com.moonbc.example.orthogonality;

public class Clothe {
    private String _SerialNumber;
    private Clothe_Type _Type;
    public Clothe(String _SerialNumber, Clothe_Type type) {
        this._SerialNumber = _SerialNumber;
        this._Type = type;
    }
    public String get_SerialNumber() {
        return _SerialNumber;
    }
    public Clothe_Type get_Type() {
        return _Type;
    }
    
    
    
}
