class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{(celsius + 273.15d), (celsius * 1.80d + 32d)};
    }
}