package sayalija.probability;

public class ProbabilityOfTwoObjects {
    double probability;
    ProbabilityOfTwoObjects(ProbabilityOfTwoObjects probability1, ProbabilityOfTwoObjects probability2){

    }

    public double getProbabilityValue(){
        return this.probability;
    }

    public double getInverseProbability() {
        return 1 - this.probability;
    }
}
