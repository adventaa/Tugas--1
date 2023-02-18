/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_1;

/**
 *
 * @author ADVENTA
 */
public class Tugas_1 {
    public static void main(String[] args) {
        System.out.println(paijo(3));
    }
    public static int paijo(int x) {
        if (x == 0) { //base case
            return 0; //base case

        }
        return 2 * paijo(x - 1) + x * x; //making progress
    }
}
