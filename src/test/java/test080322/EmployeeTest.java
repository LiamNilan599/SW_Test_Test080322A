package test080322;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
