import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @org.junit.jupiter.api.Test
    void count1() {
        List<String> myList = TestUtils.readFileIntoList("day1.txt");
        int actual = Day1.count1(myList);
        assertEquals(7, actual);
    }
}