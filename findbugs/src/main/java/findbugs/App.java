package findbugs;

public class App {
  public String getGreeting() {
    String foo = null;
    int bar = foo.length();
    return foo;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
