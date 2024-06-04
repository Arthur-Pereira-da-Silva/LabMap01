package ObserverMVC.controller;

import java.util.List;

import ObserverMVC.Display;
import ObserverMVC.model.Assentos;

public class ViewListener implements Display {
  private List<Assentos> assentos;

  @Override
  public void update(List<Assentos> listaAssentosAtualizada) {
    setAssentos(listaAssentosAtualizada);
  }

  public List<Assentos> getAssentos() {
    return assentos;
  }

  public void setAssentos(List<Assentos> assentos) {
    this.assentos = assentos;
  }

  public void mostrarAssentos() {
    System.out.println("Número - Status");
    for (Assentos assento : assentos) {
      System.out.println(assento.getNumero() + " - " + assento.getStatusColorido());
    }
  }
}
