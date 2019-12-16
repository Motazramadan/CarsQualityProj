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
public class ProjectQuality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=1,y=2,z=3; 
        System.out.println(Car.car(z));
        System.out.println(Color.color(y));
        System.out.println(Model.model(x));
        
        x=2;y=3;z=1;
        System.out.println(Car.car(z));
        System.out.println(Color.color(y));
        System.out.println(Model.model(x));
    }
    
}
