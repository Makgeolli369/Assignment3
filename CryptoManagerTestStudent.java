/*  Class: CMSC203 CRN 23239
 Program: Assignment #3
 Instructor: Professor Farnaz Eivazi
 Summary of Description: encryption and decryption through loops and bounds 
 Due Date: 10/23/2023
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Michael Lee
*/
package application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("APPLE TREE"));
		assertFalse(CryptoManager.isStringInBounds("apple tree"));
	    assertFalse(CryptoManager.isStringInBounds("Special characters!@#"));
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("EFG", CryptoManager.caesarEncryption("ABC", 4));
		assertEquals("", CryptoManager.caesarEncryption("", 1));
		assertEquals("URYY\\", CryptoManager.caesarEncryption("HELLO", 13));
		assertEquals("VJKU\"KU\"CPQVJGT\"VGUV", CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 2));
	}

	@Test
	void testBellasoEncryption() {
	    assertEquals("The selected string is not in bounds, Try again.", CryptoManager.bellasoEncryption("Icecream", "Oreos"));
	    assertEquals("XUJR%TSR", CryptoManager.bellasoEncryption("ICECREAM", "OREOS"));
	    assertEquals("IOQ\"[$PJ%T", CryptoManager.bellasoEncryption("HAMBURGERS", "AND FRIES"));
	}

	@Test
	void testCaesarDecryption() {
	    assertEquals("I AM HANGRY", CryptoManager.caesarDecryption("N%FR%MFSLW^", 5));
		assertEquals("THIS IS ABOUT ME", CryptoManager.caesarDecryption("[OPZ'PZ'HIV\\['TL", 7));
		assertEquals("WE TEST", CryptoManager.caesarDecryption("_M(\\M[\\",8));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("BURGERS AND FRIES", CryptoManager.bellasoDecryption("N* JM2 %O#P5TUQ% ", "LUNCH MENU"));
		assertEquals("TEST", CryptoManager.bellasoDecryption("(J&(", "TESTING"));
		assertEquals("CHEESE", CryptoManager.bellasoDecryption("SQ__TU", "PIZZA"));		
	}

}