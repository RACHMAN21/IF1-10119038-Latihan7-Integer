/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rsoftware.if1.latihan7;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF1
 * NIM   : 10119038
 * Deskripsi Program : Menampilkan angka dalam bentuk bilangan bulat
 * 
 */

public class IF110119038Latihan7 {
    
    public static void main(String[]args) {
        
        byte b;
        short s;
        int i;
        long l;
        
        b = 120;
        s = 32767;
        i = 1_000_000_000;
        l = 90000000000L;
        
        System.out.println("byte  : " + b);
        System.out.println("short : " + s);
        System.out.println("int   : " + i);
        System.out.println("long  : " + l);
    }
}