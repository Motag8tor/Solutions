import org.junit.*;
import static org.junit.Assert.*;

public class Tests
{
    @Test
    public void test1()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { 1, 3, 3, 4, 5 }));
    }

    @Test
    public void test2()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.killSwitch(new int[] { 2, 4, 5, 6 }));
    }
    
    @Test
    public void test3()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { -1, -1 }));
    }
    
    @Test
    public void test4()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { -2, 3, 5 }));
    }
    
    @Test
    public void test5()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { 1, 2, 3, 4 }));
    }
    
    @Test
    public void test6()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { -2, -3, 1 }));
    }
    
    @Test
    public void test7()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { -2, 3, 1 }));
    }
    
    @Test
    public void test8()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.killSwitch(new int[] { 0 }));
    }
    
    @Test
    public void test9()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.killSwitch(new int[] { -33, -101, 50, 6187, 0, -0, 5, 1 }));
    }
    
    @Test
    public void test10()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.killSwitch(new int[] { 2, 4 }));
    }
    
    @Test
    public void test11()
    {
        Solution solution = new Solution();

        assertEquals(false, solution.killSwitch(new int[] { 2, 2, 2 ,2 ,2 }));
    }
    
    @Test
    public void test12()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { 500000, 1021, 4123, 2319, -42811, 3249, 10438, 13461, -87421, 100000, 504379 }));
    }
    
    @Test
    public void test13()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { 0, 0, 0, 0, -42811, 0, 10438, 0, -87421, -504379, -624173 }));
    }
    
    @Test
    public void test14()
    {
        Solution solution = new Solution();

        assertEquals(true, solution.killSwitch(new int[] { 8, 6, 3, 3, 2, 2 }));
    }
}
