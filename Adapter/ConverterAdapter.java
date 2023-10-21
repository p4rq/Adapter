package Adapter;

public class ConverterAdapter {
    private Converter converter;
    public ConverterAdapter(String choice){
        if(choice.equalsIgnoreCase("Dollar")){
            converter = new DollarConverter();
        } else if (choice.equalsIgnoreCase("Euro")) {
            converter = new EuroConverter();
        } else if (choice.equalsIgnoreCase("Ruble")) {
            converter = new RubleConverter();
        }
    }
    public double convert(double amount){
        return converter.convert(amount);
    }
}
