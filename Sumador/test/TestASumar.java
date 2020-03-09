import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

    @Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar("5");
        String resultado = sumi.mostrar();
        assertEquals("5 = 5",resultado );
    }
    
    @Test
    public void testNegativo() {
        ASumar sumi = new ASumar("-5");
        String resultado = sumi.mostrar();
        assertEquals("",resultado );
    }
    
    @Test
    public void testMasCifras() {
        ASumar sumi = new ASumar("123456789");
        String resultado = sumi.mostrar();
        assertEquals("45",resultado );
    }

}