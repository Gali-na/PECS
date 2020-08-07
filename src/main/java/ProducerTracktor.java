import java.util.ArrayList;
import java.util.List;

public class ProducerTracktor implements MachineProducer<Tracktor> {
    private ArrayList<Tracktor> tracktors;

    public ProducerTracktor() {
        tracktors = new ArrayList<Tracktor>();
        tracktors.add(new Tracktor("uy-897"));
        tracktors.add(new Tracktor("uy-456"));
    }

    @Override
    public List<Tracktor> get() {
        return tracktors;
    }
}

