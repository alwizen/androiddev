package com.croxzz.alwizen.testv;

public class Berita {
    private String id_berita;
    private String judul_berita;
    private String gambar_berita;
    private String nama_kategori;
    private String nama_user;
    private String timestamp_berita;

    public Berita(){

    }

    public Berita (String id_berita, String judul_berita, String gambar_berita, String nama_kategor, String  nama_user, String timestamp_berita){
        this.id_berita = id_berita;
        this.judul_berita = judul_berita;
        this.gambar_berita = gambar_berita;
        this.nama_kategori = nama_kategor;
        this.nama_user = nama_user;
        this.timestamp_berita = timestamp_berita;
    }

    public String getId_berita() {
        return id_berita;
    }

    public void setId_berita(String id_berita) {
        this.id_berita = id_berita;
    }

    public String getJudul_berita() {
        return judul_berita;
    }

    public void setJudul_berita(String judul_berita) {
        this.judul_berita = judul_berita;
    }

    public String getGambar_berita() {
        return gambar_berita;
    }

    public void setGambar_berita(String gambar_berita) {
        this.gambar_berita = gambar_berita;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getTimestamp_berita() {
        return timestamp_berita;
    }

    public void setTimestamp_berita(String timestamp_berita) {
        this.timestamp_berita = timestamp_berita;
    }
}