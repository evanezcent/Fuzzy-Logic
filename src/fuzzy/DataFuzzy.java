/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 */
public class DataFuzzy {
    String tipe;
    float nilaiFuzzy;
    DecimalFormat df = new DecimalFormat("#.##");

    public DataFuzzy(String tipe, float nilaiFuzzy) {
        this.tipe = tipe;
        this.nilaiFuzzy = nilaiFuzzy;
    }
    
}
