package com.ItCompany.cicdjava;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
class MainTest {

    Main main = new Main();

    @Test
    public void message_success() {
        String excepted = "hell";

        String actual = main.message();

        assertEquals(excepted, actual);
    }
}