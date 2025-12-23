/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.PracticalRoster;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import model.PracticalCandidate.PracticalCandidate;

/**
 *
 * @author 08188
 */
public abstract class PracticalRoster {
    File rosterFile;

    public PracticalRoster(File rosterFile) {
        this.rosterFile = rosterFile;
    }
    
    public boolean isListed(PracticalCandidate c){
        boolean listed;
        
        /*if(c.getName() ){
            
        }*/
        
        return false;
        
    }
    
    public int getTotal(){
        int total = 0;
        
        
        return total;
    }
    
    public void appenedSessionReport(File out, PracticalCandidate c, String ide, boolean internetDisabled, boolean listed){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(out, true));
            bw.append("Candidte: " + c.getName());
        } catch (IOException ex) {
            System.getLogger(PracticalRoster.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    
    
  
}
