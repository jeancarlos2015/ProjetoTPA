/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import cpd.Complexo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joao
 */
public class testElemento {
    
    @Test
    public void testComplexo(){
        Complexo complexo = new Complexo();
        complexo.interpret("10+20i");
        assertTrue(complexo.getImaginario()==20);
    }
}
