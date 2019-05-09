/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

/**
 *
 * @author ASUS
 */
public class FuzzyRules {
    
    public String kategoriTulis(int x){
        if (0 < x && x <= 40) return "RENDAH";
        else if (40 < x && x <= 80) return "SEDANG";
        else if ( 80 < x && x <= 100) return "TINGGI";
        else return "NOT FOUND";
    }
    
    public String kategoriWawancara(int x){
        if (0 < x && x <= 40) return "RENDAH";
        else if (40 < x && x <= 80) return "SEDANG";
        else if ( 80 < x && x <= 100) return "TINGGI";
        else return "NOT FOUND";
    }
    
    public String theDecission(int a, int b){
        if (kategoriTulis(a).equals("RENDAH")){
            if (kategoriWawancara(b).equals("RENDAH")) return "TOLAK";
            else if (kategoriWawancara(b).equals("SEDANG")) return "TOLAK";
            else if (kategoriWawancara(b).equals("TINGGI")) return "TERIMA";
            else return "ERROR";
        }
        else if (kategoriTulis(a).equals("SEDANG")){
            if (kategoriWawancara(b).equals("RENDAH")) return "TOLAK";
            else if (kategoriWawancara(b).equals("SEDANG")) return "TERIMA";
            else if (kategoriWawancara(b).equals("TINGGI")) return "TERIMA";
            else return "ERROR";
        }
        else if (kategoriTulis(a).equals("TINGGI")){
            if (kategoriWawancara(b).equals("RENDAH")) return "TOLAK";
            else if (kategoriWawancara(b).equals("SEDANG")) return "TERIMA";
            else if (kategoriWawancara(b).equals("TINGGI")) return "TERIMA";
            else return "ERROR";
        }
        else return "ERROR";
    }
    
}
