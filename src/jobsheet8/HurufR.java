/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;
public class HurufR {
    public static void main(String[] args) {
        for (int n = 0;n < 2;n++) {
            System.out.println(" ");
        }
        int r,p;
        
        for (r = 0;r < 2;r++) {
            System.out.print(" 1 ");
            for (p = 0;p < r;p++) {
                System.out.print(" ");
        }
        System.out.println(" 11 ");
        }
        for (r = 0;r < 3;r++) {
            System.out.print(" 11 ");
            for (p = 0;p < r;p++) {
                System.out.print(" ");
            }
        }
        System.out.println(" 11 ");
    }
}
