package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CreditCard {

  public static final DateFormat DATE_FORMAT = new SimpleDateFormat("MM/yy");

  private String number;
  private Date validity;

  public CreditCard(String number, Date validity) {
    this.number = number;
    this.validity = validity;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getValidity() {
    return DATE_FORMAT.format(this.validity);
  }

  public void setValidity(Date validity) {
    this.validity = validity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CreditCard)) {
      return false;
    }
    CreditCard card = (CreditCard) o;
    return Objects.equals(getNumber(), card.getNumber());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNumber());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Credit card: ");
    sb.append(number).append(", срок действия: ").append(getValidity());
    return sb.toString();
  }
}
