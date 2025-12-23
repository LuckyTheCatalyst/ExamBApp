/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PracticalCandidate;

import java.io.File;
import utils.PracticalRoster.PracticalRoster;

/**
 *
 * @author 08188
 */
public class PracticalCandidate extends PracticalRoster{
    
    private String name;
    private String language;
    private String duration;

    public PracticalCandidate(String name, String language, String duration, File rosterFile) {
        super(rosterFile);
        this.name = name;
        this.language = language;
        this.duration = duration;
    }

    

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getDuration() {
        return duration;
    }
    
    
    
}
