/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teddyenigme;

/**
 *
 * @author stagjava
 */
public class Singleton {

    private static Singleton instance = new Singleton();
    protected String value = this.toString();
    
    protected Singleton() {}
    public static Singleton getInstance() { return instance; }
}
