/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author Hamza Baig
 */
public class Main {
    public static void main(String[] args){
        BhangraDance bhangra=new BhangraDance();
        PakistaniDuck pkDuck=new PakistaniDuck();
        pkDuck.performDance();
        pkDuck.setDanceBehavior(bhangra);
        pkDuck.performDance();
    }
}
