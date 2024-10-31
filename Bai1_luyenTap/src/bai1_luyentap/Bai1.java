/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1_luyentap;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=0,min=a>b?b:a;
        
        for(i=2;i<min;i++) {
            if(a%i==0&&b%i==0) {
                break;
            }
        }
        if(i==min) {
            System.out.println("\nKhong co mau chung\n");
        }
        else {
            System.out.println("Mau chung nho nhat la: "+i);
        }
        
    }
    
}
