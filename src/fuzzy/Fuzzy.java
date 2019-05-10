/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Fuzzy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int scoreTulis, scoreWawancara;
        float totalTulis, totalWawancara;
        Fuzzification Fuzzy = new Fuzzification();
        FuzzyRules fuzzyRules = new FuzzyRules();
        
        System.out.print("Masukan Nilai Tes Tulis : ");
        scoreTulis = x.nextInt();
        System.out.print("Masukan Nilai Tes Wawancara : ");
        scoreWawancara = y.nextInt();
        
        System.out.println("");
        System.out.println("TES TULIS");
        Fuzzy.testulisFuzzy(scoreTulis);
        if (Fuzzy.tesTulis.size() <= 1){
            System.out.println("Hasil Tulis : "+ Fuzzy.tesTulis.get(0).nilaiFuzzy);
            System.out.println("Kategori Tulis : " + Fuzzy.tesTulis.get(0).tipe);
            totalTulis = Fuzzy.tesTulis.get(0).nilaiFuzzy;
        }
        else{
            System.out.println("Hasil Tulis : "+ Fuzzy.tesTulis.get(0).nilaiFuzzy + "||" + Fuzzy.tesTulis.get(1).nilaiFuzzy);
            System.out.println("Kategori Tulis : " + Fuzzy.tesTulis.get(0).tipe + "||" + Fuzzy.tesTulis.get(1).tipe);
        }        
        
        System.out.println("");
        System.out.println("WAWANCARA");
        Fuzzy.wawancaraFuzzy(scoreWawancara);
        if (Fuzzy.Wawancara.size() <= 1){
            System.out.println("Hasil Wawancara : "+ Fuzzy.Wawancara.get(0).nilaiFuzzy);
            System.out.println("Kategori Wawancara : " + Fuzzy.Wawancara.get(0).tipe);
        }
        else{
            System.out.println("Hasil Wawancara : "+ Fuzzy.Wawancara.get(0).nilaiFuzzy + "||" + Fuzzy.Wawancara.get(1).nilaiFuzzy);
            System.out.println("Kategori Wawancara : " + Fuzzy.Wawancara.get(0).tipe + "||" + Fuzzy.Wawancara.get(1).tipe);
        }
        
        System.out.println("");
        System.out.println("Keputusan Akhir adalah anda :");
        System.out.println(fuzzyRules.theDecission(scoreTulis, scoreTulis));
    }
    
}
