package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadrunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToRead = Paths.get("./resources/data.txt");
//		List<String> allLines = Files.readAllLines(pathFileToRead);
//		System.out.println(allLines);

		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("s"))
				.forEach(System.out::println);

	}

}
