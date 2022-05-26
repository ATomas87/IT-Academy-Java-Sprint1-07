package n1exercici1;

public class Main {
    public static void main(String[] args) {
        OnSiteWorker onSiteWorker = new OnSiteWorker("Antonio", "Tomás", 10, 0.10, 15);
        OnLineWorker onLineWorker = new OnLineWorker("Benito", "Martínez", 10);

        System.out.println(onSiteWorker.calculateSalary(162));
        System.out.println(onLineWorker.calculateSalary(162));
    }
}
