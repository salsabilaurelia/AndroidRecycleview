package com.salsabila.androidrecycleview;

public class item {

    String nama;
    String NIM;
    int image;

    public item(String nama, String NIM, int image) {
        this.nama = nama;
        this.NIM = NIM;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
