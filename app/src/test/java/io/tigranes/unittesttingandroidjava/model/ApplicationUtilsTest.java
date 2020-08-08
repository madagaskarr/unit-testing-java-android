package io.tigranes.unittesttingandroidjava.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import utils.ApplicationUtils;


public class ApplicationUtilsTest {

    @Test
    public void testCurrentTameStampFormat() {
        String date = ApplicationUtils.getCurrentTimeStampForMatted();
        String currentHardcodedDate = "August 2020";
        Assertions.assertEquals(date, currentHardcodedDate);
    }
}
