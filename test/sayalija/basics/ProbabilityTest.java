package sayalija.basics;

import junit.framework.Assert;
import org.junit.Test;

public class ProbabilityTest {

    @Test
    public void testGetProbabilityForCoin() throws Exception {
        Probability probability = new Probability(0.5);
        Assert.assertEquals(0.5, probability.getProbabilityValue());
        Probability inverseCoin = probability.not();
        Assert.assertEquals(0.5, inverseCoin.getProbabilityValue());
    }

    @Test
    public void testGetProbability() throws Exception {
        Probability probability = new Probability(0.4);

        Assert.assertEquals(0.4, probability.getProbabilityValue());
    }

    @Test
    public void testGetProbabilityByGivingOccurrence() throws Exception {
        Probability probability = new Probability(0.4);
        Probability expected = new Probability(1-0.4);

        Probability actual = probability.not();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProbabilityOfOneObjectAndAnotherObject() throws Exception {
        Probability probability1 = new Probability(0.4);
        Probability probability2 = new Probability(0.1);
        Probability expected = new Probability(0.4 * 0.1);

        Probability actual = probability1.and(probability2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProbabilityOfOneObjectOrAnotherObject() throws Exception {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.5);
        Probability expected = new Probability(0.75);

        Probability actual = probability1.or(probability2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProbabilityOfOneObjectXOrAnotherObject() throws Exception {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.5);
        Probability expected = new Probability(0.75);

        Probability actual = probability1.or(probability2);

        Assert.assertEquals(expected, actual);
    }

}
