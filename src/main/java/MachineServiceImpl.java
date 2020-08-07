import java.util.List;
/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            ProducerBuldozers bulldozer = new ProducerBuldozers();
            return bulldozer.get();
        }
        if (type == Tracktor.class) {
            ProducerTracktor tracktor = new ProducerTracktor();
            return tracktor.get();
        }
        if (type == Excavator.class) {
            ProducerExcavators excavato = new ProducerExcavators();
            return excavato.get();
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.add(0, value);
        for (Machine machine : getAll(value.getClass())) {
            machines.add(machine);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine n : list) {
            n.doWork();
        }
    }
}
