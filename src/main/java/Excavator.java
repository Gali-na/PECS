public class Excavator extends Machine {
    String model;

    public Excavator() {
    }

    public Excavator(String model) {

        this.model = model;
    }

    @Override
    public void doWork() {

        System.out.println("Excavator started to work");
    }
}

