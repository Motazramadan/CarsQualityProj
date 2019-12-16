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
public class Color {

    public static String color(int number) {
        String col = "";
        switch (number) {
            case 1:
                col = "Red";
                return col;
            case 2:
                col = "Blue";
                return col;
            case 3:
                col = "Black";
                return col;
            case 4:
                col = "White";
                return col;
            case 5:
                col = "Yellow";
                return col;
        }
        return col;
    }
}
