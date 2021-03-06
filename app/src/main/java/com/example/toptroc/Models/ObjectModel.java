package com.example.toptroc.Models;

public class ObjectModel {
    public ObjectModel(){
        //Constructeur Vide //
    }
    private int object_img;
    private String nomUser,contactUser,nomObjet,descriptionObjet;

    public ObjectModel(int object_img,String nomUser,String contactUser,String nomObjet,String descriptionObjet){
        this.object_img = object_img;
        this.nomUser = nomUser;
        this.contactUser = contactUser;
        this.nomObjet = nomObjet;
        this.descriptionObjet = descriptionObjet;
    }

    public int getObject_img() {
        return object_img;
    }

    public void setObject_img(int object_img) {
        this.object_img = object_img;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getContactUser() {
        return contactUser;
    }

    public void setContactUser(String contatUser) {
        this.contactUser = contatUser;
    }

    public String getNomObjet() {
        return nomObjet;
    }

    public void setNomObjet(String nomObjet) {
        this.nomObjet = nomObjet;
    }

    public String getDescriptionObjet() {
        return descriptionObjet;
    }

    public void setDescriptionObjet(String descriptionObjet) {
        this.descriptionObjet = descriptionObjet;
    }
}
