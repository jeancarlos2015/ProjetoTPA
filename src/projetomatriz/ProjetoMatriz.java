/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomatriz;

import cpd.Complexo;

/**
 *
 * @author estagiario33601
 */
public class ProjetoMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complexo comp = new Complexo();
        comp.interpret("10+10i");
        System.out.println(comp.toString());
    }
    
}
