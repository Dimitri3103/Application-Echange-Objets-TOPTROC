package com.example.toptroc.Models;

public class ObjectModel {
    public ObjectModel(){
        //Constructeur Vide //
    }
    private int object_img;
    public ObjectModel(int object_img){
        this.object_img = object_img;
    }

    public int getObject_img() {
        return object_img;
    }

    public void setObject_img(int object_img) {
        this.object_img = object_img;
    }
}
