/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_luyentap;

/**
 *
 * @author ACER
 */
public class Bai2 {
    
    public static void cach1() {
        int dem=0;
        int dem2=0;
        for(int i=1;i<=500;i++) {
            for(int j=i;j<=500;j++) {
                dem++;
                int chbp= i*i+j*j;
                if(chbp>250000)
                    break;
                int ch = (int)Math.sqrt(chbp);
                if(ch*ch==chbp)  {
                    System.out.println(i+" "+j+" "+ch+"\n");
                    dem2++;
                }
            }
        }
        System.out.println("So lan chay la "+dem);
        System.out.println("So lan chay la "+dem2);
    }
    
    public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    
    // cách 2 thiếu trường hợp
    public static void cach2() {
        int limit = (int)Math.sqrt(500)+1;
        int dem=0;
        for(int i=2;i<=limit;i++) {
            for(int j=1;j<=i;j++) {
                if((i-j)%2==1&& gcd(i,j)==1){
                    int a = i*i-j*j;
                    int b = 2*i*j;
                    int c = i*i+j*j;
                    int k=1;
                    while (k*a<=500&& k*b<=500&&c*k<=500&&a<=b) {
                        System.out.println(k*a+" "+k*b+" "+k*c);
                        k++;
                        dem++;
                        System.out.println(k*k*a*a+k*k*b*b-k*k*c*c);
                    }
                }
            }
        }
        System.out.println("dem: "+dem);
    }
    
    
    public static void main(String[] args) {
        cach1();
    }
    
    
}
