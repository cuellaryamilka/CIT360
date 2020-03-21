package MyJson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] args) throws JsonParseException, IOException {
		
			// creating object mapper which is the main tool to convert our object to JSON
			ObjectMapper mapper = new ObjectMapper();
					
			// converting the object into JSON
			try {
					Object myObject = mapper.readValue(new File("myJson.json"), Object.class);
					System.out.println(myObject.getHouseName()[0]);
					
			} catch (JsonGenerationException e) {
						e.printStackTrace();
			} catch (JsonMappingException e) {
						e.printStackTrace();
					}
					
	}
}
