package sayalija.basics;

public class Probability {

    double probability;

    Probability(double probability) {
        if (probability < 0 || probability > 1)
            throw new IllegalArgumentException();
        this.probability = probability;
    }

    Probability(double totalOccurrence, double favourableOccurrence) {
        this(favourableOccurrence / totalOccurrence);
    }

    public double getProbabilityValue() {
        return this.probability;
    }

    public Probability not() {
        return new Probability(1 - this.probability);
    }

    public Probability and(Probability probability) {
        return new Probability(this.getProbabilityValue() *
                probability.getProbabilityValue());
    }

    public Probability or(Probability probability) {
        return new Probability(this.getProbabilityValue() +
                probability.getProbabilityValue() - this.and(probability).getProbabilityValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(probability);
        return (int) (temp ^ (temp >>> 32));
    }
}
