import java.util.Map;

public class SocialNetworkMap {

  private Map<String, String> users;

  public SocialNetworkMap(Map<String, String> users) {
    this.users = users;
  }

  public void printUsers() {
    for (Map.Entry<String, String> entry : users.entrySet()) {
      System.out.println("Nickname:" + entry.getKey() + " Name: " + entry.getValue());
    }
  }

  public void registration(String nick, String name) {
    if (users.containsKey(nick)) {
      System.out.println("Пользователь с таким ником уже существует");
    } else {
      users.put(nick, name);
    }
  }

  public void removeUser(String nick) {
    if (users.containsKey(nick)) {
      users.remove(nick);
      System.out.println("Пользователь " + nick + " удален");
    } else {
      System.out.println("Нет такого пользователя!");
    }
  }

  public Map<String, String> getUsers() {
    return users;
  }

  public void setUsers(Map<String, String> users) {
    this.users = users;
  }

  @Override
  public String toString() {
    return "SocialNetworkMap{" +
        "users=" + users +
        '}';
  }
}
