import java.util.ArrayList;
import java.util.List;

public class ProducerExcavators implements MachineProducer<Excavator> {
    private ArrayList<Excavator> excavators;

    public ProducerExcavators() {
        excavators = new ArrayList<Excavator>();
        excavators.add(new Excavator("456456-345645"));
        excavators.add(new Excavator("7864-345645"));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}

