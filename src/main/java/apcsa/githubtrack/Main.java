package apcsa.githubtrack;

// Implement your main application logic here
public class Main {
  public static void main(String[] args) {
    CString cString = CStringUtil.toCString("Hello, World!");
    System.out.println(CStringUtil.fromCString(cString));
  }
}