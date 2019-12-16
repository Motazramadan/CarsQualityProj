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
public class Model {
    public static String model (int number){
    String mdl = "";
        switch (number) {
            case 1:
                mdl = "Sedan";
                return mdl;
            case 2:
                mdl = "Crossover";
                return mdl;
        }
        return mdl;
    }
}
