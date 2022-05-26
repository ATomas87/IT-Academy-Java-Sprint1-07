package n1exercici2;

public class OnLineWorker extends Worker {
    public static final double TARIFA_INTERNET= 45;
    public OnLineWorker(String name, String surname, double hourPrize) {
        super(name, surname, hourPrize);
    }

    @Override
    public double calculateSalary(double hours) {
        return (hours * this.getHourPrize()) + TARIFA_INTERNET;
    }

    @Deprecated
    public void printName(){
        System.out.println(this.getName());
    }
}
