
package pkg8_praktikumuts;

import java.util.Scanner;

public class Soal3 {
    /*method reverse untuk mengembalikan bilangan bulat*/
    public static int reverse(int num) {
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = sum * 10 + r;
            num = num /10;
        }
        return sum;
    }

    /*method untuk mengecek palindrome*/
    public static boolean isPalindrome(int num) {
        int sum = reverse(num);
        return num == sum;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*proses inputan*/
        System.out.print("Masukkan bilangan bulat: ");
        int num = scanner.nextInt();

        /*pemeriksaan inputan awal dengan hasil
        dengan menggunakan method isPalindrome
        */
        if (isPalindrome(num)) {
            System.out.println(num + " adalah bilangan palindrom.");
        } else {
            System.out.println(num + " bukan bilangan palindrom.");
        }


    }
}

