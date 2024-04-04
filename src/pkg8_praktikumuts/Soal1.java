
package pkg8_praktikumuts;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        /*mendekralasi variabel*/
        int num, temp, r, sum = 0;
        
        /*proses inputan*/
        System.out.println("masukan tiga digit integer : ");
        num = scanner.nextInt();
        
        /*menyimpan nilai */
        temp = num;
        
        /*proses pembalikan angka*/
        while(num>0){
            r = num % 10; 
            sum = (sum * 10) + r;
            num = num / 10;
        }
        
        /*pemeriksaan inputan awal dengan hasil*/
        if(temp == sum){
            System.out.println(temp+" adalah palindrom");
        }else{
            System.out.println(temp+" bukan palindrom");
        }
        
    }
    
}
