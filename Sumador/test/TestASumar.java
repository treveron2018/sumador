import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
    @Test
    public void testUnaCifra() {
        ASumar suma = new ASumar("5");
        String resultado = suma.mostrar();
        assertEquals("5 = 5",resultado );
    }
    
    @Test
    public void testNegativo() {
        ASumar suma = new ASumar("-5");
        String resultado = suma.mostrar();
        assertEquals(null,resultado );
    }

    @Test
    public void testMasDigitos() {
        ASumar suma = new ASumar("25");
        String resultado = suma.mostrar();
        assertEquals("2 + 5 = ",resultado );
    }
}
