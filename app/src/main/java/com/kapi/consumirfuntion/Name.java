package com.kapi.consumirfuntion;

public class Name {
    private String nombre;
    private String capi;
    private String image;

    public  Name(){}
    public Name(String nombre,String capi,String image,String songURL){
        this.nombre = nombre;
        this.capi = capi;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapi() {
        return capi;
    }

    public void setCapi(String capi) {
        this.capi = capi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}