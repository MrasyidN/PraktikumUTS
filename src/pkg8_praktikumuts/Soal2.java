
package pkg8_praktikumuts;

import java.util.Scanner;

public class Soal2 {
    
    /*method untuk membuat pattern A
    dengan menggunakan loop for 
    untuk mencetak angka dengan spasi 
    */
    public static void patternA(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    /*method untuk membuat pattern B
    dengan menggunakan loop for 
    untuk mencetak angka dengan spasi 
    */
    public static void patternB(int num){
        for(int i = num; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    /*method untuk membuat pattern C
    dengan menggunakan loop for 
    untuk mencetak angka dengan spasi 
    */
    public static void patternC(int num){
        for(int i = 1; i<=num; i++){
            for(int j = num; j>i; j--){
                System.out.print("  ");
            }for(int k= i; k>=1; k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
    
    /*method untuk membuat pattern D
    dengan menggunakan loop for 
    untuk mencetak angka dengan spasi 
    */
    public static void patternD(int num){
        for(int i = num; i>=1; i--){
            for(int j =num; j>i; j--){
                System.out.print("  ");
            }for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
    }
    
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        
        /*inputan untuk memilih pattern*/
        System.out.println("Jenis pattern = A, B, C, D");
        char pattern = scanner.next().charAt(0);
        
        /*inputan untuk memasukan nomor*/
        System.out.println("input nomor");
        int num = scanner.nextInt();
        
        /*switch case berdasarkan inputan yang telah diinput*/
        switch(pattern){
            case 'A':
                patternA(num);
                break;
            case 'B':
                patternB(num);
                break;
            case 'C':
                patternC(num);
                break;
            case 'D':
                patternD(num);
                break;
            default:
                System.out.println("tidak ada pola");
        }
    }
    
    
    
}
