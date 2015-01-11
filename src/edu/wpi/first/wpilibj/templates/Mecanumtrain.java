/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author robotics
 */
public class Mecanumtrain {
    private Jaguar fleft;
    private Jaguar fright;
    private Jaguar bleft;
    private Jaguar bright;
   
    private final int FRONT_LEFT_PORT=3;
    private final int FRONT_RIGHT_PORT=1;
    private final int BACK_LEFT_PORT=4;
    private final int BACK_RIGHT_PORT=2;
    
    public Mecanumtrain(){
    
        fleft = new Jaguar(FRONT_LEFT_PORT); 
        fright = new Jaguar(FRONT_RIGHT_PORT);
        bleft = new Jaguar(BACK_LEFT_PORT); 
        bright = new Jaguar(BACK_RIGHT_PORT);
        
    }
    public void set(double vertical, double horizontal, double rotation){
 
        
    }

}
