/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dosen.entity;

/**
 *
 * @author dani
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String jurusan;
    private String alamat;
    private String email;
    private String telepon;

    public Mahasiswa() {

    }

    public Mahasiswa(String nim, String nama, String jurusan, String alamat, String email, String telepon) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.email = email;
        this.telepon = telepon;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Object getValue(int index) {
        switch (index) {
            case 0:
                return nim;
            case 1:
                return nama;
            case 2:
                return jurusan;
            case 3:
                return alamat;
            case 4:
                return email;
            case 5:
                return telepon;
            default:
                return null;
        }
    }
}
