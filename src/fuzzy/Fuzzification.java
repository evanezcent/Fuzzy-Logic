/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Fuzzification {
    List<DataFuzzy> tesTulis = new ArrayList();
    List<DataFuzzy> Wawancara = new ArrayList();
    
    public void testulisFuzzy(int nilaiTulis){
        String tipe = "HMM";
        float nilaiFuzzy = 0;
        DataFuzzy test;
        
//        RENDAH
        if (0 < nilaiTulis && nilaiTulis <= 40){
            tipe = "RENDAH";
            nilaiFuzzy = 1;
        }
        else if (30 < nilaiTulis && nilaiTulis <= 50){
            tipe = "RENDAH";
            nilaiFuzzy =  (float)Math.abs((nilaiTulis - 50))/(50 - 30);
            System.out.println(nilaiFuzzy);
        }
        if (tipe.equals("RENDAH")){
            test = new DataFuzzy(tipe, nilaiFuzzy);
            tesTulis.add(test);
        }
        
//        SEDANG
        if (30 < nilaiTulis && nilaiTulis <= 50){
            tipe = "SEDANG";
            nilaiFuzzy = (float)1 - nilaiFuzzy;
            System.out.println(nilaiFuzzy);
        }
        else if (50 < nilaiTulis && nilaiTulis <= 65){
            tipe = "SEDANG";
            nilaiFuzzy = 1;
        }
        else if (65 < nilaiTulis && nilaiTulis <= 75){
            tipe = "SEDANG";
            nilaiFuzzy = (float)Math.abs((nilaiTulis - 75))/(75 - 65);
            System.out.println(nilaiFuzzy);
        }
        if (tipe.equals("SEDANG")){
            test = new DataFuzzy(tipe, nilaiFuzzy);
            tesTulis.add(test);
        }
        
//        TINGGI
        if (75 < nilaiTulis && nilaiTulis <= 85){
            tipe = "TINGGI";
            nilaiFuzzy = (float)1 - nilaiFuzzy;
            System.out.println(nilaiFuzzy);
        }
        else if ( 85 < nilaiTulis && nilaiTulis <=100){
            tipe =  "TINGGI";
            nilaiFuzzy = 1;
        }
        if (tipe.equals("TINGGI")){
            test = new DataFuzzy(tipe, nilaiFuzzy);
            tesTulis.add(test);
        }
    }
    
//    Wawancara
    public void wawancaraFuzzy(int nilaiWawancara){
        String tipe = "HMM";
        float nilaiFuzzy = 0;
        DataFuzzy test;
        
//        RENDAH
        if (0 < nilaiWawancara && nilaiWawancara <= 30){
            tipe = "RENDAH";
            nilaiFuzzy = 1;
        }
        else if (30 < nilaiWawancara && nilaiWawancara <= 50){
            tipe = "RENDAH";
            nilaiFuzzy =  -((nilaiWawancara - 50))/(50 - 30);
        }
        if (tipe.equals("RENDAH")){
            test = new DataFuzzy(tipe, nilaiFuzzy);
            Wawancara.add(test);
        }
        
//        SEDANG
        if (30 < nilaiWawancara && nilaiWawancara <= 50){
            tipe = "SEDANG";
            nilaiFuzzy = 1 - nilaiFuzzy;
        }
        else if (50 < nilaiWawancara && nilaiWawancara <= 65){
            tipe = "SEDANG";
            nilaiFuzzy = 1;
        }
        else if (65 < nilaiWawancara && nilaiWawancara <= 75){
            tipe = "SEDANG";
            nilaiFuzzy = -((nilaiWawancara - 75))/(75 - 65);
        }
        if (tipe.equals("SEDANG")){
            test = new DataFuzzy(tipe, nilaiFuzzy);
            Wawancara.add(test);
        }
        
//        TINGGI
        if (65 < nilaiWawancara && nilaiWawancara <= 75){
            tipe = "TINGGI";
            nilaiFuzzy = -((nilaiWawancara - 75))/(75 - 65);
        }
        else if (75 < nilaiWawancara && nilaiWawancara <= 85){
            tipe = "TINGGI";
            nilaiFuzzy = 1 - nilaiFuzzy;
        }
        else if ( 85 < nilaiWawancara && nilaiWawancara <=100){
            tipe =  "TINGGI";
            nilaiFuzzy = 1;
        }
        if (tipe.equals("TINGGI")){
            test = new DataFuzzy(tipe, nilaiFuzzy);
            Wawancara.add(test);
        }
    }
}
