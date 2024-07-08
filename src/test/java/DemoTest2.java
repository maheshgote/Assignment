import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class DemoTest2 {

	@Test(dataProvider = "getdata")
	public void checklogin(String uname, String pass) {
		System.out.println(uname+  " " + pass);
		
	}
	
	@DataProvider()
	public Object getdata(){
		
//		ArrayList <Object[]> obj = new ArrayList<Object[]>();
//		
//		Object names[]= {"Ramesh","suresh"};
//		Object names1[]= {"suraj","rajesh"};
//		Object names2[]= {"kiran","kamlesh"};
//		obj.add(names);
//		obj.add(names1);
//		obj.add(names2);
//		return obj.iterator();
		
//		Object [] data=new Object[2];
//		List data[] = new Object[5];
		ArrayList <Object[]> data = new ArrayList<Object[]>();

        // Add your username and password pairs
        data.add(new Object[]{"user1", "pass1"});
        data.add(new Object[]{"user2", "pass2"});
        data.add(new Object[]{"user3", "pass3"});

        return data.iterator();
		
//		File file = new File("path of file");
//		FileInputStream fileStream = new FileInputStream(file);
//		XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
//		return null;
	}
	
	@Test
    public void hello(){
    	System.out.println("test");
    
    	
    }
}
