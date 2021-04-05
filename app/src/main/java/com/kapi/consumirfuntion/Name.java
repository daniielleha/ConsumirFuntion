package com.kapi.consumirfuntion;

public class Name {
    private String nombre;
    private String capi;
    private String region;
    private String sub;
    private String pob;
    private String image;

    public  Name(){}
    public Name(String nombre, String capi, String region, String sub, String pob, String image){
        this.nombre = nombre;
        this.capi = capi;
        this.region = region;
        this.sub = sub;
        this.pob = pob;
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

    public String getRegion(){
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSub(){
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getPob(){
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}