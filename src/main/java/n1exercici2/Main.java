package n1exercici2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        OnSiteWorker onSiteWorker = new OnSiteWorker("Antonio", "Tomás", 10, 0.10, 15);
        OnLineWorker onLineWorker = new OnLineWorker("Benito", "Martínez", 10);

        onSiteWorker.printKilometers();
        onLineWorker.printName();
    }
}
