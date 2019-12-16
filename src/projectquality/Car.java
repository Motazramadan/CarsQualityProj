/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquality;

/**
 *
 * @author motazramadan
 */
public class Car {
    public static String car (int number){
    String cr = "";
        switch (number) {
            case 1:
                cr = "BMW";
                return cr;
            case 2:
                cr = "Mercedes";
                return cr;
            case 3:
                cr = "Heyundai";
                return cr;
            case 4:
                cr = "Kia";
                return cr;
            case 5:
                cr = "Mg";
                return cr;
        }
        return cr;
    }
}
