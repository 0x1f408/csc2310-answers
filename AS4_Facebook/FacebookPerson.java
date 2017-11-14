// simple implementation of a facebook user
public class FacebookPerson{

  // This is the FacebookPerson class
  private String myname;
  private String mood;
  private Facebook fb;

  public FacebookPerson(String name){
      myname = name;
      mood ="initial mood";
      fb = new Facebook();
  }

  public void setMood(String newMood){
     mood = newMood;
     fb.setContent(mood);
  }

  public String getMood(){
      return mood;
  }
  
  public String getName(){
		return myname;
  }
  
	public String getFacebookContent(){
		return fb.getContent();
	}
}