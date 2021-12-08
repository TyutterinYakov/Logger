package reader;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.log4j.Logger;

public class FileReader implements Reader {

	
	final static Logger logger = Logger.getLogger(FileReader.class);

	
	
	public StringBuilder Read() {
		StringBuilder message = new StringBuilder();
		try {
			URI url = ClassLoader.getSystemResource("message.txt").toURI();
			logger.info("File path read");
			
			
			message = new StringBuilder(Files.readString(Paths.get(url)));
			logger.info("File read and written");
			
		} catch (URISyntaxException|NullPointerException | IOException e) {
			logger.error(e);
		}
		
		return message;
	}
	
	
	
	
	
}
