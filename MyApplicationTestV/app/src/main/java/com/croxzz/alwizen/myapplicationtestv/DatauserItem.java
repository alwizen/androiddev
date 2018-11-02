package com.croxzz.alwizen.myapplicationtestv;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DatauserItem{

	@SerializedName("timestamp_berita")
	private String timestampBerita;

	@SerializedName("nama_user")
	private String namaUser;

	@SerializedName("id_berita")
	private String idBerita;

	@SerializedName("gambar_berita")
	private String gambarBerita;

	@SerializedName("judul_berita")
	private String judulBerita;

	@SerializedName("nama_kategori")
	private String namaKategori;

	public void setTimestampBerita(String timestampBerita){
		this.timestampBerita = timestampBerita;
	}

	public String getTimestampBerita(){
		return timestampBerita;
	}

	public void setNamaUser(String namaUser){
		this.namaUser = namaUser;
	}

	public String getNamaUser(){
		return namaUser;
	}

	public void setIdBerita(String idBerita){
		this.idBerita = idBerita;
	}

	public String getIdBerita(){
		return idBerita;
	}

	public void setGambarBerita(String gambarBerita){
		this.gambarBerita = gambarBerita;
	}

	public String getGambarBerita(){
		return gambarBerita;
	}

	public void setJudulBerita(String judulBerita){
		this.judulBerita = judulBerita;
	}

	public String getJudulBerita(){
		return judulBerita;
	}

	public void setNamaKategori(String namaKategori){
		this.namaKategori = namaKategori;
	}

	public String getNamaKategori(){
		return namaKategori;
	}

	@Override
 	public String toString(){
		return 
			"DatauserItem{" + 
			"timestamp_berita = '" + timestampBerita + '\'' + 
			",nama_user = '" + namaUser + '\'' + 
			",id_berita = '" + idBerita + '\'' + 
			",gambar_berita = '" + gambarBerita + '\'' + 
			",judul_berita = '" + judulBerita + '\'' + 
			",nama_kategori = '" + namaKategori + '\'' + 
			"}";
		}
}