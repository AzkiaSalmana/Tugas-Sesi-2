/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motor;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Motor {
    public boolean Isnyala;
    public int  kecepatan, perseneling;
    public String info;
    Motor(){
        Isnyala = false;
        kecepatan = 0;
        perseneling = 0;
            }
    public void NyalakanMatikan(){
        if (!Isnyala ) {
            System.out.println("motor berhasil dinyalakan");
            this.Isnyala = true;
        }
        else{
            this.Isnyala = false;
            this.kecepatan = 0;
            System.out.println("motor berhasil dimatikan");
        }
    }
    public void tambahPerseneling( ){
        if (perseneling < 6) {
            perseneling++;
            System.out.println("perseneling telah ditambah, perseneling saat ini :"+ this.perseneling);
        }       
    }
    public void kurangPerseneling(){
        if (perseneling >=  0) {
            perseneling--;
            System.out.println("perseneling dalam keadaan normal");
        }
        
        if (perseneling == 6 && kecepatan > 120){
            kecepatan = 120;
            System.out.println("perseneling : "+ perseneling);

        }
        else if (perseneling == 5 && kecepatan > 100){
            kecepatan = 100;
            System.out.println("perseneling : "+ perseneling);

        }
        else if (perseneling == 4 && kecepatan > 75){
            kecepatan = 75;
            System.out.println("perseneling :"+ perseneling);

        }
        else if (perseneling == 3 && kecepatan > 40){
            kecepatan = 40;
            System.out.println("perseneling :"+ perseneling);

        }
        else if (perseneling == 2 && kecepatan > 25){
            kecepatan = 25;
            System.out.println("perseneling : "+ perseneling);

        }
        else if (perseneling == 1 && kecepatan > 10){
            kecepatan = 10;
            System.out.println("perseneling : "+ perseneling);

        }
        else if (perseneling == 0 ){
            kecepatan = 0;
            System.out.println("perseneling saat ini : "+perseneling);

        }

    }
    public void tambahKecepatan(int kecepatan){
        if (Isnyala){
            if (perseneling == 0) {
                System.out.println("tambahkan perseneling dong");      
                }
            else if(perseneling == 1){
                this.kecepatan += kecepatan;
                System.out.println("kecepatan saat ini : "+this.kecepatan);
                if (kecepatan > 10) {
                    System.out.println("kecepatan sudah mencapai maksimal harap tambahkan perseneling");
                }
            }
            else if(perseneling == 2){
                this.kecepatan += kecepatan;
                System.out.println("kecepatan saat ini : "+this.kecepatan);
                if (kecepatan > 25) {
                    System.out.println("kecepatan sudah mencapai maksimal harap tambahkan perseneling");
                }
            }
            else if(perseneling == 3){
                this.kecepatan += kecepatan;
                System.out.println("kecepatan saat ini : "+this.kecepatan);
                if (kecepatan > 50) {
                    System.out.println("kecepatan sudah mencapai maksimal harap tambahkan perseneling");
                }
            }
            else if(perseneling == 4){
                this.kecepatan += kecepatan;
                System.out.println("kecepatan saat ini : "+this.kecepatan);
                if (kecepatan > 10) {
                    System.out.println("kecepatan sudah mencapai maksimal harap tambahkan perseneling");
                }
            }
            else if(perseneling == 5){
                this.kecepatan += kecepatan;
                System.out.println("kecepatan saat ini :"+this.kecepatan);
                if (kecepatan > 100) {
                    System.out.println("kecepatan sudah mencapai maksimal harap tambahkan perseneling");
                }
            }
            else if(perseneling == 6){
                this.kecepatan += kecepatan;
                System.out.println("kecepatan saat ini : "+this.kecepatan);
                if (kecepatan > 120) {
                    System.out.println("kecepatan sudah mencapai maksimal harap tambahkan perseneling");
                }
            }
           

        }
    }
    public void kurangKecepatan(int kecepatan){
        this.kecepatan -= kecepatan;
        System.out.println("kecepatan saat ini adalah "+ this.kecepatan);
    }
    
    public void infoMotor(){
        if (kecepatan >=0 && kecepatan <=50) {
            System.out.println("Motor dalam kecepatan rendah");
            System.out.println("kecepatan saat ini : "+ this.kecepatan);
        }
        else if (kecepatan >= 51 && kecepatan <=70) {
            System.out.println("Motor dalam kecepatan sedang");
            System.out.println("kecepatan saat ini : "+ this.kecepatan);
        }
        else if (kecepatan > 71) {
            System.out.println("Motor dalam kecepatan tinggi");
            System.out.println("kecepatan saat ini : "+ this.kecepatan);
        }
        
    }

    public static void main(String[] args) {
        Motor motorku = new Motor();
        
        //Menyalakan Motor
        motorku.NyalakanMatikan();
        
        //Menambah Perseneling
        motorku.tambahPerseneling();
        
        //Menambah Kecepatan Motor
        motorku.tambahKecepatan(40);
        
        //Info Kecepatan Motor
        motorku.infoMotor();
        
        //Menambah Kecepatan Motor 
        motorku.tambahKecepatan(20);
        
        //Menambah Perseneling
        motorku.tambahPerseneling();
        
        //Menambah Perseneling
        motorku.tambahPerseneling();
        
        //Menambah Kecepatan motor
        motorku.tambahKecepatan(10);
        
        //Info Kecepatan Motor
        motorku.infoMotor();


    }


}
