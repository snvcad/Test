import java.io.File; 
import org.apache.commons.io.FileUtils;

/* This is a simple Java program. 
   FileName : "HelloWorld.java". */
/* class HelloWorld 
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
      String htmlString = FileUtils.readFileToString(htmlTemplateFile);
      String title = "New Page";
      String body = "This is Body";
      htmlString = htmlString.replace("$title", title);
      htmlString = htmlString.replace("$body", body);
      File newHtmlFile = new File("path/new.html");
      FileUtils.writeStringToFile(newHtmlFile, htmlString);
    }
}
