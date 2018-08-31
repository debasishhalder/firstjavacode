import java.io.*;
import java.util.*;

public class TestNew {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:/test/test.txt"))) {
			    String line;
			    while ((line = br.readLine()) != null) {
			    	if(line.contains(":")){
				        String[] values = line.split(":");
				        map.put(values[0], values[1]);
			    	}
			    }
			}catch(Exception ex){}
		
		System.out.println(map);
	}
}
