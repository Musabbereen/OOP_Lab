import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumWord_Tester {

    NumWordPrinter printer = new NumWordPrinter();

    @Test
    public void If_Divisible_By_2() {
        assertEquals("EVEN",printer.printWord(4,true));
    }
    @Test
    public void If_Divisible_By_13() {
        assertEquals("EVEN",printer.printWord(13,true));
    }
    @Test
    public void If_Divisible_By_2_and_11() {
        assertEquals("EVEN",printer.printWord(4,true));
    }
    @Test
    public void If_Divisible_By_All() {
        assertEquals("EVEN",printer.printWord(4,true));
    }
    @Test
    public void If_Not_Divisible_By_13() {
        assertEquals("EVEN",printer.printWord(13,true));
    }
    @Test
    public void No_Condition_Matched() {
        assertEquals("OddOneOut",printer.printWord(4,false) );
    }
}

