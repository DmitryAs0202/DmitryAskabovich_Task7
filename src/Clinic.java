import entities.Person;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Clinic {

  public void clinicQueue() {
    Deque<Person> queue = new LinkedList<>();
    for (int i = 1; i < 11; i++) {
      queue.offer(new Person(i));
      if (i % 3 == 0) {
        System.out.println("Заходит последний: " + queue.pollLast());
      }
      if (i > 3) {
        System.out.println(queue.poll());
      }
    }
    System.out.println("Очередь пуста: " + queue.isEmpty());
  }

  public void eliminationRace() {
    Deque<Person> personDeque = new LinkedList<>();
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      personDeque.add(new Person(random.nextInt(20)));
    }
    for (int i = 0; i < 4; i++) {
      Collections.shuffle((List) personDeque);
      System.out.println(personDeque);
      System.out.println(personDeque.pollLast());
    }
    System.out.println(personDeque);

  }


}
