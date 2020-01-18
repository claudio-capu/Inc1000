/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc1000;

/**
 *
 * @author Lenovo
 */
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        //Istanziare gli oggetti
        Inc1000 i1 = new Inc1000();
        Inc1000 i2 = new Inc1000();

        //Start & Join
        i1.start();
        i1.join();
        i2.start();
        i2.join();

        //Stampa
        System.out.println(Inc1000.cont);
    }

}
