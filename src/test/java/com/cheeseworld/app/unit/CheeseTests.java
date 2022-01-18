package com.cheeseworld.app.unit;

import com.cheeseworld.app.Cheese;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheeseTests {

    @Test
    void eachCheeseHasAName() {
        assertThat(new Cheese("Rochefort|stinky french cheese|250gr").getName(), is("Rochefort"));
        assertThat(new Cheese("Manchego|gourmet spanish cheese|100gr").getName(), is("Manchego"));
        assertThat(new Cheese("Cabrales|super smelly cheese|100gr").getName(), is("Cabrales"));
    }

    @Test

    void aCheeseIsConsideredStinkyIfContainsStinkyOrSmellyInTheDescription () {
        assertThat(new Cheese("Rochefort|stinky french cheese|250gr").isStinky(), is(true));
        assertThat(new Cheese("Manchego|gourmet spanish cheese|100gr").isStinky(), is(false));
        assertThat(new Cheese("Cabrales|super smelly cheese|100gr").isStinky(), is(true));
    }

    @Test

    void aCheeseIsConsideredFrenchIfContainsFrenchDescription () {
        assertThat(new Cheese("Rochefort|stinky french cheese|250gr").isFrench(), is(true));
        assertThat(new Cheese("Manchego|gourmet spanish cheese|100gr").isFrench(), is(false));
        assertThat(new Cheese("Cabrales|super smelly cheese|100gr").isFrench(), is(false));
    }
    @Test

    void aCheeseHasItsWeightInGr () {
        assertThat(new Cheese("Rochefort|stinky french cheese|250gr").getWeightInGr(), is(250));
        assertThat(new Cheese("Manchego|gourmet spanish cheese|100gr").getWeightInGr(), is(100));
    }

    @Test

    void aCheeseHasDiscount () {
        assertThat(new Cheese("Rochefort|stinky french cheese|250gr").getDiscount(), is(false));
        assertThat(new Cheese("Manchego|gourmet spanish cheese discount |100gr").getDiscount(), is (true));
    }

}
