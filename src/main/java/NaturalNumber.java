public class NaturalNumber{

    private final int number;

    public NaturalNumber(int number) throws IllegalArgumentException{
        if(number<=0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    this.number=number;
    }

    public Classification getClassification()  {
        int factorSum=0, factor;
                for (int no = 1; no <= number / 2; no++) {
                    if (number % no == 0)
                        factorSum += no;
                }
                if (factorSum == number)
                    return Classification.PERFECT;
                else if (factorSum > number)
                    return Classification.ABUNDANT;
                else
                    return Classification.DEFICIENT;
    }
}
