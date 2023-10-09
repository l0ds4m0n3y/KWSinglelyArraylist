import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class singleListTest {
    
    static KWSingleLinkedList<String> myList = new KWSingleLinkedList<>();
    @BeforeAll
    static void setUp(){
        myList.add("zero");
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");

    }

    @Test
    void testRemove(){
        assertEquals(5, myList.size());
        myList.remove(0);        
        myList.remove(0);
        myList.remove(0);
        myList.remove(0);
        myList.remove(0);  
        assertEquals(true, myList.isEmpty());
    }

    @Test
    void restRemove2(){
        assertEquals(5, myList.size());
        myList.remove("zero");
        myList.remove("one");
        myList.remove("two");
        myList.remove("three");
        myList.remove("four");
        assertEquals(false, myList.remove("five"));
        assertEquals(true, myList.isEmpty());
    }
    @Test
    void testAdd(){
        myList.add("five");
        assertEquals("five", myList.get(5));
        assertEquals(true, myList.remove("five"));
        myList.add2(4, "four2");
        assertEquals("four2", myList.get(4));
    }
}
