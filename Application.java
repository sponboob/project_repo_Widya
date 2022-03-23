/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Master
 */
import data.Laptop3;

public class Application {
    public static void main(String[] args) {
        Laptop3 uts13 = new Laptop3("Widya", "Hp", "Intel Core3", 5, "Windows X", 64, "SSD M 2",1000,"PBalck","Best") ;
        System.out.println(uts13);
         Laptop3 uts23 = new Laptop3("Widya", "Hp", "Intel Core3", 5, "Windows X", 64, "SSD STA",1000,"PBalck","Good") ;
        System.out.println(uts23);
          Laptop3 uts33 = new Laptop3("Widya", "Hp", "Intel Core3", 5, "Windows X", 64, "HDD",1000,"PBalck","Middle") ;
        System.out.println(uts33);
    }
}