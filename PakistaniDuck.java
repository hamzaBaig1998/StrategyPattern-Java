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
public class PakistaniDuck extends Duck{
    PakistaniDuck(){
        this.danceBehavior=new KhatakDance();
    }
}
