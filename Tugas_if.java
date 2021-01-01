/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuna
 */
import java.util.Scanner;

public class Tugas_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Nilai = " );
        nilai = Input.nextInt();
        
        if(nilai >= 90){
            System.out.println("grade = A");
        }else if(nilai >= 80){
            System.out.println("grade = B+");
        }else if(nilai >= 70 ){
            System.out.println("grade = B");
        }else if(nilai >= 60){
            System.out.println("grade = C+");
        }else{
            System.out.println("Program Selesai");
        }
}
}