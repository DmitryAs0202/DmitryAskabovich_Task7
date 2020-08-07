package entities;

import java.util.Objects;

public class Cargo implements Comparable<Cargo> {

  public static final int MAX_CAPACITY = 250;

  private int cargoWeight;

  public Cargo(int cargoWeight) {
    this.cargoWeight = cargoWeight;
  }

  public int getCargoWeight() {
    return cargoWeight;
  }

  public void setCargoWeight(int cargoWeight) {
    this.cargoWeight = cargoWeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Cargo)) {
      return false;
    }
    Cargo cargo = (Cargo) o;
    return getCargoWeight() == cargo.getCargoWeight();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCargoWeight());
  }

  @Override
  public String toString() {
    return "Cargo{" +
        "cargoWeight=" + cargoWeight +
        '}';
  }

  @Override
  public int compareTo(Cargo o) {
    if (this.cargoWeight < o.cargoWeight) {
      return -1;
    } else if (this.cargoWeight == o.cargoWeight) {
      return 0;
    } else {
      return 1;
    }
  }
}
