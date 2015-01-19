package com.moonbc.example.orthogonality;

public class Clothe_Type {
    private String _BrandName;
    private String _Color;
    private String _Size;
    private String _Fabric;
    
    public Clothe_Type(String _BrandName, String _Color, String _Size, String _Fabric) {
        this._BrandName = _BrandName;
        this._Color = _Color;
        this._Size = _Size;
        this._Fabric = _Fabric;
    }

    public String get_BrandName() {
        return _BrandName;
    }

    public String get_Color() {
        return _Color;
    }

    public String get_Size() {
        return _Size;
    }

    public String get_Fabric() {
        return _Fabric;
    }
    
        
}
