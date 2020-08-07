import entities.Brick;
import entities.Person;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTask {

  public void addingAndReading() {
    LinkedList<Person> personList = new LinkedList<>();

    for (int i = 0; i < 5; i++) {
      personList.addFirst(new Person(i));
      personList.addLast(new Person(10 - i));
    }
    System.out.println(personList);
    for (int i = 0; i < personList.size(); i++) {
      System.out.println(personList.pollLast());
      System.out.println(personList.pollFirst());
    }
  }

  public void jenga() {
    List<Brick> brickList = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      brickList.add(new Brick(i));
    }

    System.out.println(brickList);

    for (int i = 0; i < 20; i++) {
      Brick brick = brickList.get(random.nextInt(brickList.size() - 2));
      if (brick.equals(brickList.get(0))) {
        continue;
      }
      System.out.println(brickList.remove(brickList.indexOf(brick)));
      System.out.println(brickList);
      brickList.add(brick);
      System.out.println(brickList);
    }
  }

}
