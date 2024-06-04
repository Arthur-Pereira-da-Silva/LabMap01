package ObserverMVC;

import ObserverMVC.model.Assentos;
import java.util.List;

public interface Display {
    void update(List<Assentos> assentos);
}