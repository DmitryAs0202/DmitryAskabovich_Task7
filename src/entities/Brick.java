package entities;

import java.util.Objects;

public class Brick {
  private int id;

  public Brick(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Brick{" +
        "id=" + id +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Brick)) {
      return false;
    }
    Brick brick = (Brick) o;
    return id == brick.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
