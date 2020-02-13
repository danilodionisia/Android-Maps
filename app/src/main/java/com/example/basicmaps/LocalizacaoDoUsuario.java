package com.example.basicmaps;

import com.google.firebase.database.DatabaseReference;

public class LocalizacaoDoUsuario {

    String latitude, longitude, usuario;

    public LocalizacaoDoUsuario() {
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void salvaLocalizacao(){

        ConexaoFirebase reference = new ConexaoFirebase();
        DatabaseReference conn = reference.check();

        conn.child("localizacao").push().setValue(this);
    }
}
