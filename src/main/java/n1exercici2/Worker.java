package n1exercici2;

public abstract class Worker {
    private String name;
    private String surname;
    private double hourPrize;

    public Worker(String name, String surname, double hourPrize) {
        this.name = name;
        this.surname = surname;
        this.hourPrize = hourPrize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHourPrize() {
        return hourPrize;
    }

    public void setHourPrize(double hourPrize) {
        this.hourPrize = hourPrize;
    }

    public double calculateSalary(double hours) {
        return this.hourPrize * hours;
    }
}
