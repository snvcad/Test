import java.io.File; 
import java.lang.Object;
import org.apache.commons.io.*;
import org.apache.commons.io.FileUtils;

/* This is a simple Java program. 
   FileName : "HelloWorld.java". */
/* class UpdateContent 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        System.out.println("Hello, World"); 
    } 
} 

*/
class UpdateContent 
{
    public static void main(String args[]) {

      File htmlTemplateFile = new File("template.html");
      try {
      	String htmlString = FileUtils.readFileToString(htmlTemplateFile);
      	String title = "New Page";
      	String body = "This is Body";
      	htmlString = htmlString.replace("$title", title);
      	htmlString = htmlString.replace("$body", body);
      	File newHtmlFile = new File("C:/Project/GitHub/Test/index.html");
      	FileUtils.writeStringToFile(newHtmlFile, htmlString);
      } catch (Exception e) {
	 System.out.println ("Error" + e.toString());
      }	
  }
}

