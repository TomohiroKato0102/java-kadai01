package gitTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class javaKadai01 {
	public static void main(String[] args) {

		try (BufferedReader reader = Files.newBufferedReader(
				Paths.get(".", "gitTest", "scores.csv"))) {
			var line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
