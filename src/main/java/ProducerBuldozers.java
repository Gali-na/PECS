import java.util.ArrayList;
import java.util.List;

public class ProducerBuldozers implements MachineProducer<Bulldozer> {
    private ArrayList<Bulldozer> bulldozers;

    public ProducerBuldozers() {
        bulldozers = new ArrayList<Bulldozer>();
        bulldozers.add(new Bulldozer("UT-456"));
        bulldozers.add(new Bulldozer("UT-t56"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}

