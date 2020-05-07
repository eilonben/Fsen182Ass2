import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class addShowTest extends ShowStoryTest {
    @Test
    public void testAddShow(){
        assertTrue(addShow("Aladdin","Broadway","The Shell","25.12.2018","30"));
        assertFalse(addShow("","Broadway","The Shell","28.12.2022","40"));
        assertFalse(addShow("Little Mermaid","Broadway","The Bowl","14.12.2018","jghae"));
    }
    @Test
    public void testUpdateHour(){
        assertTrue(updateHour("bob","Aladdin","21:30"));
        assertFalse(updateHour("","Little Mermaid","20:30"));
        assertFalse(updateHour("bob","Aladdin","98:20"));
    }
    @Test
    public void testLogin(){
        assertTrue(login("bob","password"));
        assertFalse(login("bob","notpassword"));
        assertFalse(login("77338","password"));
    }

}