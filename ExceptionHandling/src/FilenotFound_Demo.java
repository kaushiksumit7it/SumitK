import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound_Demo {

	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("E://file.txt");
		// try {
	//	try {
//			try {
				FileReader fr = new FileReader(file);
				m1();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} 
	}
	
	public static void m1() throws FileNotFoundException
	{
		
	}
}