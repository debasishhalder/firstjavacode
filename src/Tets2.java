import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tets2 {
	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<String>();
			/* "F:\\file", "write6.txt" */
			Files.lines(Paths.get("C:\\test", "test.txt"))
					.filter(line -> line.startsWith("European Case Law Identifier:")
							|| line.startsWith("Date of decision:") || line.startsWith("Case number:"))
					.forEach(System.out::println/*list::add*/);
			System.out.println(list);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
