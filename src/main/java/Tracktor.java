public class Tracktor extends Machine {
    String model;

    public Tracktor() {
    }

    public Tracktor(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
// Добавьте несколько настраиваемых полей, которые могут быть только в Track
// Не удаляйте конструктор без полей
