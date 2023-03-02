package ru.netology;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = CashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void remain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = CashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
