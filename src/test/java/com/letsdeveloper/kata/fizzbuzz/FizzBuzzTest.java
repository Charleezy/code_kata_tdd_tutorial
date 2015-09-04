package com.letsdeveloper.kata.fizzbuzz;

import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;

/**
 * Created by cguan on 04/09/2015.
 */
public class FizzBuzzTest {
    @Test
    public void shouldReturnOneaAsNUmber(){
        String answer = FizzBuzz.getAnswerFor(1);
        Assert.assertThat(answer, CoreMatchers.is("1"));
    }
}
