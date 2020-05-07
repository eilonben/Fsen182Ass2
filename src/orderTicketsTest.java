
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class orderTicketsTest extends ShowStoryTest {
    @Test
    public void testOrderTickets() {
        String[] legalChairs = {"66", "65"};
        String[] nonLegal = {"%%", "2222"};
        assertTrue(orderTickets("Aladdin","Alice Bob","052663447",legalChairs));
        assertFalse(orderTickets("", "Bob Alice", "0544219412", legalChairs));
        assertFalse(orderTickets("Cats", "Bobby Alisson", "0507496351", nonLegal));
    }


    @Test
    public void testLegalDetails(){
        assertTrue(isLegalDetails("Alice Bobby","0555555555"));
        assertFalse(isLegalDetails("", "055444444"));
        assertFalse(isLegalDetails("Jaffar Evily", "0547999888"));
    }
    @Test
    public void testLegalPhone(){
        assertTrue(isLegalPhone("0546123456"));
        assertFalse(isLegalPhone("161212383"));
        assertFalse(isLegalPhone("087ghjk221"));
    }
}

