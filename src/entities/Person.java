package entities;

public class Person implements Comparable <Person> {

  private int id;

  public Person(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        '}';
  }

  @Override
  public int compareTo(Person o) {
    if (this.id > o.id) {
      return 1;
    }else if (this.id == o.id) {
      return 0;
    }else {
      return -1;
    }
  }
}

