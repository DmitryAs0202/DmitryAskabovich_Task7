package entities;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private String name;
  private int mark;
  private int age;
  private int form;

  public Student(String name, int mark, int age, int form) {
    this.name = name;
    this.mark = mark;
    this.age = age;
    this.form = form;
  }

  @Override
  public int compareTo(Student o) {
    return this.name.compareTo(o.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMark() {
    return mark;
  }

  public void setMark(int mark) {
    this.mark = mark;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getForm() {
    return form;
  }

  public void setForm(int form) {
    this.form = form;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return mark == student.mark &&
        age == student.age &&
        Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mark, age);
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", mark=" + mark +
        ", age=" + age +
        ", form=" + form +
        '}';
  }
}
