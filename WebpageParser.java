import java.io.File; 
import java.io.IOException; 
import org.jsoup.Jsoup; 
import org.jsoup.nodes.Document; 
import org.jsoup.nodes.Element;
public class WebpageParser {
	public static void main(String[] args) throws IOException
	{
	    Document doc = Jsoup.parse(new File("C:\\Users\\shubham.singh\\Downloads\\sample.htm"),"utf-8");  
	    Element el = doc.getElementById("table1");
	    String str=el.text();
	    System.out.println(str);
		
	}

}
