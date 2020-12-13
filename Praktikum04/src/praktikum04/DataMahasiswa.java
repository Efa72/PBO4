/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum04;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;

public class DataMahasiswa {
    //atribut
    int pilih;
    int pilih2;
    
    // atribut menyimpan data mahasiswa
    ArrayList<String> nim = new ArrayList<>();
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> tglLahir = new ArrayList<>();
    ArrayList<Integer> gender = new ArrayList<>();
    
    // method //
    // menu
    void menu(){
        while (true){
            System.out.println("Data Mahasiswa");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Data \n" + "2. Hapus Data \n" + "3. Cari Data \n" + "4. Tampil Data \n" + "5. Keluar");
            System.out.print("Pilih nomor menu : ");
            Scanner input = new Scanner(System.in);
            pilih = input.nextInt();
            if (pilih == 1){
                this.tambahData();
            }
            else if (pilih == 2){
                this.hapusData();
            }
            else if (pilih == 3){
                this.cariData();
            }
            else if (pilih == 4){
                this.tampilData();
            }
            else if (pilih == 5){
                break;
            }
            else {
                break;}
        }
    }
    
    // tambah data
    void tambahData (){
        System.out.println("Data Mahasiswa - Tambah Data");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data");
        System.out.print("Nim                           : ");
        nim.add(input.nextLine());
        System.out.print("Nama                          : ");
        nama.add(input.nextLine());
        System.out.print("Tanggal Lahir(DD/MM/YYYY)     : ");
        tglLahir.add(input.nextLine());
        System.out.print("Jenis Kelamin 0=P, 1=L (0/1)  : ");
        gender.add(input.nextInt());
        System.out.println("Data Mahasiswa Tersimpan");
        System.out.println(" ");
    }

    // hapus data
    void hapusData(){
        System.out.println("Data Mahasiswa - Hapus Data");
        System.out.println("Masukan NIM untuk menghapus data mahasiswa");
        System.out.print("Nim : ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int x = nim.indexOf(a);
        nim.remove(x);
        nama.remove(x);
        tglLahir.remove(x);
        gender.remove(x);
        System.out.println("Data Mahasiswa Terhapus");
        System.out.println(" ");
    }
    
    // cari data
    void cariData(){
        System.out.println("Data Mahasiswa - Cari Data");
        System.out.println("(1)Berdasarkan NIM \n" + "(2)Berdasarkan Nama");
        System.out.print("Pilih menu (1/2) : ");
        Scanner ans = new Scanner(System.in);
        pilih2 = ans.nextInt();
        if (pilih2 == 1){
            System.out.print("NIM Mahasiswa :");
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            int x = nim.indexOf(a);
            System.out.println("Data Mahasiswa");
            System.out.println("NIM             : " + nim.get(x));
            System.out.println("Nama            : " + nama.get(x));
            System.out.println("Tanggal Lahir   : " + tglLahir.get(x));
            System.out.println("Jenis Kelamin   : " + gender.get(x));
            System.out.println("Keterangan      : 0 = Perempuan"); 
            System.out.println("Keterangan      : 1 = Laki-laki"); 
            System.out.println(" ");
        }
        else if (pilih2 == 2){
            System.out.print("Nama Mahasiswa :");
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            int x = nama.indexOf(a);
            System.out.println("Data Mahasiswa");
            System.out.println("NIM             : " + nim.get(x));
            System.out.println("Nama            : " + nama.get(x));
            System.out.println("Tanggal Lahir   : " + tglLahir.get(x));
            System.out.println("Jenis Kelamin   : " + gender.get(x));
            System.out.println("Keterangan      : 0 = Perempuan"); 
            System.out.println("Keterangan      : 1 = Laki-laki");
            System.out.println(" ");
        }
        else {
            System.out.println("Input yang anda masukkan salah");
        }
    }

    // tampil data
    void tampilData(){
        System.out.println("Data Semua Mahasiswa");
        System.out.println("NIM             : " + this.nim);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Tanggal Lahir   : " + this.tglLahir);
        System.out.println("Jenis Kelamin   : " + this.gender); 
        System.out.println("Keterangan      : 0 = Perempuan"); 
        System.out.println("Keterangan      : 1 = Laki-laki"); 
        System.out.println(" ");
    }
}
   