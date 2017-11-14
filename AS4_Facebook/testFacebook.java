//This is the test class that will be used by the TAs to grade your homework.
//Do not modify this class

public class testFacebook{

  // This is the testFacebook class

  public static void main (String[] argc){
      System.out.println();
      FacebookPerson p1 = new FacebookPerson("John");
      System.out.println(p1.getName()+ "' mood is "+ p1.getMood() +".");
      System.out.println(p1.getName()+ "' facebook content is "+ p1.getFacebookContent() +".");

      p1.setMood("happy");
      System.out.println(p1.getName()+ "' mood is "+ p1.getMood() +".");
      System.out.println(p1.getName()+ "' facebook content is "+ p1.getFacebookContent() +".");

      p1.setMood("sad");
      System.out.println(p1.getName()+ "' mood is "+ p1.getMood() +".");
      System.out.println(p1.getName()+ "' facebook content is "+ p1.getFacebookContent() +".");
  }

}