import java.util.List;

//  Параметризуйте этот сервис и добавьте его реализацию в отдельный класс.

public interface MachineService<T> {
    // Вернуть список машин.
    //В реализации этого метода используйте свои реализации MachineProducer.
    // Обратите внимание, что «Тип класса» не параметризован.
    // Рассмотрите возможность параметризации этого класса <PARAMETRIZE_ME> с определенным ограничением по шаблону
    // @param type - любой класс подкласса Machine. Например: Track.class или Bulldozer.class
    // @ вернуть список машин

    List<? extends T> getAll(Class<? extends T> type);
    // List<? extendsT> getAll(Class <? extends T> type);
    //Заполните список машин переданным значением
    //Замените объект параметризованным значением.
    //Этот метод должен хорошо работать с любым типом машины, переданной как 'значение'
    //@param machines - список машин для заполнения значением
    // @param value - любой объект машинного подкласса

    //public void fill(List<Class <? super T>> machines, Class value);
    public void fill(List<? super T> machines, T value);

    // Вызовите метод doWork () с каждой машины.
    // Этот метод должен принимать список бульдозеров, а также список гусениц.
    // @param machines - список машин

    void startWorking(List<? extends T> machines);
}

