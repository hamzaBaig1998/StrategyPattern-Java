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
public class Duck {
    DanceBehavior danceBehavior;
    void setDanceBehavior(DanceBehavior danceBehavior){
        this.danceBehavior=danceBehavior;
    }
    void performDance(){
        danceBehavior.dance();
    }
}
