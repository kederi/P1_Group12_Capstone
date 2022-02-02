package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testPrintMessage() {
        String filename = "LetterGame.csv";	
		File f = new File(filename);
		boolean fileExists = f.exists(); 
		assertTrue(fileExists);     
    }
    
}
