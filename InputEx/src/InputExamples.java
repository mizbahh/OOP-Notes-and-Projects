
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InputExamples {

	public static void main(String[] args) {

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		try {
			String aLineOfInput = stdin.readLine();
			stdin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}




	}

}
