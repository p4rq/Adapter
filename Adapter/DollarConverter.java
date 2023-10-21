package Adapter;

public class DollarConverter implements Converter {

    @Override
    public double convert(double amount) {
        return amount / 480;
    }
}
