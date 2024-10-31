/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_luyentap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Bai3 {
    
    public static void cach1(int n,int a,int b) {
        Random rd = new Random();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = rd.nextInt(a, b);
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        int max =a-1;
        int min = b+1;
        for(int i=0;i<n;i++) {
            if(arr[i]<0&&arr[i]>max)  {
                max = arr[i];
            }
            if(arr[i]>0 && arr[i]<min) {
                min = arr[i];
            }
        }
        
        if(max==a-1) {
            System.out.println("khong co so am lon nhat");
        }
        else {
            System.out.println("so am lon nhat la: "+max);
        }
        if(min==b+1) {
            System.out.println("khong co so duong nho nhat");
        }
        else {
            System.out.println("so duong nho nhat la: "+min);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        cach1(n,a,b);
               
    }
    
}
