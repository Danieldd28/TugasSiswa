/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ProjectPakChandra;

import java.util.Scanner;

/**
 *
 * @author MJ
 */
public class Siswa {

    private String nama;// ti String untuk menampung kalimat atau kata
    private int absen;//int untuk menampung bilangan bulat
    private String alamat;
    private int telp;
    private int kelas;
    private int nilai;

    public Siswa() {
        nama = "Mochamad Aldino";
        absen = 24;
        alamat = "Jalan sama kamu ";
        telp = 0123445;
        kelas = 10;
    }

    public int getNilai() {// untuk mendapatkan nilai atau memanggil nilai
        return nilai;//mengembalikan nilai
    }

    public int getAbsen() {
        return absen;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getTelp() {
        return telp;
    }

    public int getKelas() {
        return kelas;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public void setNama(String n) {
        this.nama = n;
    }

    public void setAlamat(String a) {
        this.alamat = a;
    }

    public void setTelp(int t) {
        this.telp = t;
    }

    public void setKelas(int k) {
        this.kelas = k;
    }

    public void setNilai(int nilai) {// memperbarui nilai dari variabel
        this.nilai = nilai;// untuk mengakses objek(akses)
    }

    public void Tampil() {
        System.out.println("\tData Siswa");
        System.out.println("Nama   : " + nama);
        System.out.println("Absen  : " + absen);
        System.out.println("Alamat : " + alamat);
        System.out.println("Telp   : " + telp);
        System.out.println("Kelas  : " + kelas);

        System.out.println();

    }

    public String ubaydino() {
        return "Danieldd28";
    }

    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.ubaydino();
        Scanner input = new Scanner(System.in);// untuk mendapatkan inpt pengguna

        System.out.println(siswa1.ubaydino());
        System.out.println("Masukkan nilai pertama:");
        double nilai1 = input.nextDouble();

        System.out.println("Masukkan nilai kedua");
        double nilai2 = input.nextDouble();

        System.out.println("Masukkan nilai ketiga:");
        double nilai3 = input.nextDouble();

        Siswa siswa2 = new Siswa();//membbuat objek baru

        siswa1.Tampil();
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        System.out.println("Rata-rata    : " + rataRata);

        if (rataRata >= 75) {
            System.out.println("Siswa lulus ");
        } else {
            System.out.println("Siswa tidak lulus ");
        }
    }
}
