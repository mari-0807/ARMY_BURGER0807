package com.example.army_burger;

public class Promociones {
    private String nombre, descripcion;
    private int imgpromo;

    public Promociones() {
    }

    public Promociones(String nombre, String descripcion, int imgpromo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imgpromo = imgpromo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public int getImgpromo(){
        return imgpromo;
    }

    public void setImgpromo(int imgpromo){
        this.imgpromo = imgpromo;
    }


}
