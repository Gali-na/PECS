public class Bulldozer extends Machine {
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

// Добавьте несколько пользовательских полей, которые могут быть только в бульдозере
// Не удаляйте конструктор без аргументов
