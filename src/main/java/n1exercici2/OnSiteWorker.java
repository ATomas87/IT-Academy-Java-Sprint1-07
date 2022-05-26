package n1exercici2;

public class OnSiteWorker extends Worker {
    private double kilometerPrize;
    private double kilometers;

    public OnSiteWorker(String name, String surname, double hourPrize, double kilometerPrize, double kilometers) {
        super(name, surname, hourPrize);
        this.kilometerPrize = kilometerPrize;
        this.kilometers = kilometers;
    }

    public double getKilometerPrize() {
        return kilometerPrize;
    }

    public void setKilometerPrize(double kilometerPrize) {
        this.kilometerPrize = kilometerPrize;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double calculateSalary(double hours) {
        return (hours * this.getHourPrize()) + (this.kilometers * this.kilometerPrize);
    }

    @Deprecated
    public void printKilometers() {
        System.out.println(this.kilometers);
    }
}
