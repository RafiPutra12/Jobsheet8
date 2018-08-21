/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;
import java.util.Scanner;
public class PraktikumNo1 {
     public static void main(String[] args) {
    //membuat variabel dan scanner
    boolean running=true;
    int counter=0;
    String jawab;
    Scanner scan = new Scanner(System.in);
    
    while(running) {
        System.out.println("Spakah anda ingin keluar?");
        System.out.print("jawab [yakin/tidak]>");
        jawab = scan.nextLine();
        
        //cek jawabannya jika yakin maka berhenti mengulang
        if( jawab.equalsIgnoreCase("yakin")) {
            running=false;
            
        }
        counter++;
    }
    System.out.println("Anda telah melakukan sebanyak" + counter + "kali");
}
}
