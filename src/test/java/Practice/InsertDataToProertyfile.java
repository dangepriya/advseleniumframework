package Practice;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertDataToProertyfile {

	public static void main(String[] args) throws Throwable {
		
		Properties pro = new Properties();
		pro.setProperty("url","./src/test/resources/InsertintoPropertyfile.properties.txt");
		pro.setProperty("username","standard_user");
		pro.setProperty("password","secret_sauce");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/InsertintoPropertyfile.properties.txt");
        pro.store(fos, "COMMONDATA");
        System.out.println("data written successfully.");
	}

}
