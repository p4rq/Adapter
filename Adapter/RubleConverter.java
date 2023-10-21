package Adapter;

public class RubleConverter implements Converter{
    @Override
    public double convert(double amount) {
        return amount/5;
    }
}
