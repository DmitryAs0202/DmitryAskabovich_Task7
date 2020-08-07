import entities.Cargo;
import entities.CreditCard;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {

  public void bank() {
    Set<CreditCard> creditCards = new HashSet<>();
    creditCards.add(new CreditCard("4589 5287 2458 4569", new Date("31 December 2022")));
    creditCards.add(new CreditCard("4589 5478 5248 2485", new Date("31 May 2021")));
    creditCards.add(new CreditCard("5432 2548 5246 5214",
        new Date("30 September 2021")));
    creditCards.add(new CreditCard("1265 2584 2545 5247", new Date("30 April 2020")));
    creditCards.add(new CreditCard("7458 2546 5214 5287", new Date("30 November 2021")));
    creditCards.add(new CreditCard("4589 5478 5248 1245", new Date("31 May 2021")));
    creditCards.add(new CreditCard("5432 2548 5246 5217",
        new Date("30 September 2021")));

    creditCards.forEach(creditCard -> System.out.println(creditCard));

  }

  public void cargoManipulations(Set<Cargo> cargoSet) {
    int cargoSum = 0;
    Iterator<Cargo> cargoIterator = cargoSet.iterator();
    while (cargoIterator.hasNext()) {
      cargoSum += cargoIterator.next().getCargoWeight();
    }

    if (cargoSum < Cargo.MAX_CAPACITY) {
      System.out.println("Можно догрузить еще: " + (Cargo.MAX_CAPACITY - cargoSum));
      System.out.println(cargoSet);
    } else if (cargoSum == Cargo.MAX_CAPACITY) {
      System.out.println("Набрано максимальное количество груза!");
    } else {
      Iterator<Cargo> cargoIterator1 = cargoSet.iterator();
      while (cargoIterator1.hasNext()) {
        Cargo tempCargo = cargoIterator1.next();
        int weight = tempCargo.getCargoWeight();
        if (cargoSum - weight <= Cargo.MAX_CAPACITY) {
          System.out.println("Достаточно выгрузить: " + tempCargo);
          cargoSet.remove(tempCargo);
          System.out.println(cargoSet);
          return;
        }
      }
    }
  }

  public void unloadCargo(Set<Cargo> cargoSet) {
    Iterator<Cargo> cargoIterator = cargoSet.iterator();

    while (cargoIterator.hasNext()) {
      System.out.println("Выгружается " + cargoIterator.next());
      cargoIterator.remove();
    }
  }

}
