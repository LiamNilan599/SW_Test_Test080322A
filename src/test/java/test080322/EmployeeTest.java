package test080322;
// Liam Nilan g00366621 08 03 22
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest
{
    @Test
    void ValidTitle()
    {
        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
        assertEquals("Mrs", test.getTitle());
    }

    @Test
    void ValidName()
    {
        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
        assertEquals("Brandy", test.getName());
    }
    @Test
    void Validpps()
    {
        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
        assertEquals("345fds", test.getPPS());
    }
    @Test
    void ValidPhone()
    {
        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
        assertEquals("0984321", test.getPhone());
    }
    @Test
    void ValidType()
    {
        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
        assertEquals("Full-time", test.getType());
    }
    @Test
    void ValidAge()
    {
        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
        assertEquals(24, test.getAge());
    }

    @Test
    void inValidTitle()
    {
        Employee test = new Employee("zhr","Brandy","345fds","0984321", "Full-time", 24);

    }

//    @Test
//    void ValidName()
//    {
//        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
//        assertEquals("Brandy", test.getName());
//    }
//    @Test
//    void Validpps()
//    {
//        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
//        assertEquals("345fds", test.getPPS());
//    }
//    @Test
//    void ValidPhone()
//    {
//        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
//        assertEquals("0984321", test.getPhone());
//    }
//    @Test
//    void ValidType()
//    {
//        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
//        assertEquals("Full-time", test.getType());
//    }
//    @Test
//    void ValidAge()
//    {
//        Employee test = new Employee("Mrs","Brandy","345fds","0984321", "Full-time", 24);
//        assertEquals(24, test.getAge());
//    }
}
