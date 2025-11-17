import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class U4Project
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Exception Caught: Matrix.Backend.Main.UserNotRecognizedException: Biometric failure. Manual Override Intiated.\n...");
    try
      {
        TimeUnit.SECONDS.sleep(3);
      }
    catch(InterruptedException e)
      {
      }
    System.out.println("Override Successful. Welcome, administrator. Data corrupted. Enter new password:");
    String password = scan.nextLine();
    System.out.println("Password contains " +  password.length() + " characters.");
    System.out.println("Scramble initiated.");
  }
}
