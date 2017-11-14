// simple Facebook implementation
public class Facebook{

   // This is the Facebook class
   
   private String content;

   public Facebook(){
	content = "initial_content";
   }
   
   public void setContent(String newContent){
	content = newContent+"_content";
   }
	public String getContent(){
		return content;
	}
   
}