package Adapter;

public class EuroConverter implements Converter{
    @Override
    public double convert(double amount) {
        return amount/506;
    }
}
