package LivreClassMaven.com.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class LivreTest {
	Livre livre = new Livre("Harry Potter " , "J.K. Rolling " , "Bloomsbury Publishing " , 26 , "roman");
	Livre livre1 = new Livre("Harry Potter " , "J. Rolling " , "Bloomsbury Publishing " , 26 , "roman");
	
	@Test
	public void testEqualsLivre() {
		assertEquals(livre1, livre);
	}
}
