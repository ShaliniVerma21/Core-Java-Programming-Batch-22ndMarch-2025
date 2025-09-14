package Day22;
	// Program 8: Copying content from one file to another

	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class p16{
	    public static void main(String[] args) {
	        try {
	            FileReader reader = new FileReader("demo2.txt");
	            FileWriter writer = new FileWriter("demo_copy.txt");

	            int ch;
	            while ((ch = reader.read()) != -1) { // Read character by character
	                writer.write(ch);
	            }

	            reader.close();
	            writer.close();
	            System.out.println("File copied successfully.");
	        } catch (IOException e) {
	            System.out.println("An error occurred during copy.");
	            e.printStackTrace();
	        }
	    }
	}
