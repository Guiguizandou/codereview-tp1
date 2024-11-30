/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fr.isima;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author guhonore
 */
public class AwesomePasswordCheckerTest {
  
  public AwesomePasswordCheckerTest() {
  }

  /**
   * Test of computeMD5 method, of class AwesomePasswordChecker.
   */
  @Test
  public void testComputeMD5() {
    System.out.println("computeMD5");
    String input = "myawesomepassword";
    String expResult = "3729ad9ab30ed75be1f22a5f250f07ac";
    String result = AwesomePasswordChecker.computeMD5(input);
    assertEquals(expResult, result);
  }
  
}
