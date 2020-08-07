import entities.Cargo;
import entities.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Clinic cl = new Clinic();
    cl.clinicQueue();
    cl.eliminationRace();

    ListTask listTask = new ListTask();
    listTask.addingAndReading();
    listTask.jenga();

    SetTask st = new SetTask();
    st.bank();
    st.cargoManipulations(addCargo());
    st.unloadCargo(addCargo());

    SocialNetworkMap socialNetworkMap = new SocialNetworkMap(addUsers());
    socialNetworkMap.printUsers();
    socialNetworkMap.registration("Tim", "Tim Hanson");
    socialNetworkMap.registration("Tim2", "Tim Hanson");
    socialNetworkMap.printUsers();
    socialNetworkMap.removeUser("George345");
    socialNetworkMap.printUsers();

    List<Student> studentList = studentList();
    Collections.sort(studentList);
    studentList.forEach(student -> System.out.println(student));

    Collections.sort(studentList, new MarkComparator());
    System.out.println("-----------------------------");
    studentList.forEach(student -> System.out.println(student));

    Collections.sort(studentList, new AgeComparator());
    System.out.println("-----------------------------");
    studentList.forEach(student -> System.out.println(student));

    Collections.sort(studentList, (o1, o2) -> {
      if (o1.getForm() > o2.getForm()) {
        return 1;
      } else if (o1.getForm() == o2.getForm()) {
        return 0;
      } else {
        return -1;
      }
    });

    System.out.println("-----------------------------");
    studentList.forEach(student -> System.out.println(student));


  }

  public static Set<Cargo> addCargo() {
    Set<Cargo> cargoSet = new TreeSet<>();
    cargoSet.add(new Cargo(25));
    cargoSet.add(new Cargo(50));
    cargoSet.add(new Cargo(5));
    cargoSet.add(new Cargo(75));
    cargoSet.add(new Cargo(100));
    return cargoSet;
  }

  public static Map<String, String> addUsers() {
    Map<String, String> usersMap = new HashMap<>();
    usersMap.put("Tim", "Tim John");
    usersMap.put("George345", "George Hopkins");
    usersMap.put("Mike1989", "Michael De-Santo");
    usersMap.put("Kruger345", "James Kruger");
    usersMap.put("JustHouse", "Alex House");
    usersMap.put("Dutch", "Dutch van der Linde");
    usersMap.put("Kate22", "Kate Jackson");
    usersMap.put("joan1992", "Joana Armith");
    usersMap.put("jessVi", "Jessica Vicont");
    return usersMap;
  }

  public static List<Student> studentList() {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Laura Jackson", 9, 14, 8));
    studentList.add(new Student("Alex Bosh", 8, 14, 8));
    studentList.add(new Student("Tim Hankok", 10, 15, 9));
    studentList.add(new Student("George Aaron", 6, 14, 8));
    studentList.add(new Student("Lara Stivens", 10, 14, 8));
    studentList.add(new Student("Elliot Grand", 7, 15, 9));
    studentList.add(new Student("Mark Hide", 7, 14, 8));
    studentList.add(new Student("Zana Grew", 8, 14, 8));
    studentList.add(new Student("Barton Aahen", 6, 15, 9));
    studentList.add(new Student("Clara von Shtaufenberg", 9, 15, 9));
    studentList.add(new Student("Tom Barns", 10, 16, 11));
    studentList.add(new Student("Gerald Nilsen", 5, 15, 9));

    return studentList;
  }

}
