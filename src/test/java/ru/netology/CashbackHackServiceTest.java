package ru.netology;

import org.junit.Test;
import ru.netology.service.CashbackHackService;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = CashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = CashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
