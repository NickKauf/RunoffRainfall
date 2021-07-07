public class RunoffRainfall {
    public static void main(String[] args)
    {
        int roofLength = 5;
        int roofWidth = 5;
        int rainfallInches = 1;
        int lengthInches = roofLength * 12;
        int widthInches = roofWidth * 12;
        int dimensionSquareInches = lengthInches * widthInches;
        double rainfallCubicInches = dimensionSquareInches * rainfallInches;
        double rainfallGallons = rainfallCubicInches / 231;
        System.out.println(
                rainfallGallons
                        + " gallons of water fell on a "
                        + roofLength
                        + " ft by "
                        + roofWidth
                        +" ft roof."
        );


    }
}
