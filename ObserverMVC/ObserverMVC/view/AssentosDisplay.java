package ObserverMVC.view;

import java.util.List;

import ObserverMVC.Display;
import ObserverMVC.model.Assentos;

public class AssentosDisplay implements Display {

    @Override
    public void update(List<Assentos> assentos) {
        System.out.println("Atualização nos assentos recebida:");

        for (Assentos assento : assentos) {
            System.out.println("Assento " + assento.getNumero() + ": " + assento.getStatusColorido());
        }
    }
}
