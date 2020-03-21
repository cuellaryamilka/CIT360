package MyJson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Json.ObjectForJson;

public class ObjectToJson {

	public static void main(String[] args) throws JsonProcessingException {
		// creating object mapper which is the main tool to convert our object to JSON
				ObjectMapper mapper = new ObjectMapper();
				
				//creating an object from our ObjectForJson class
				Object myObject = convertJson();
				
				// converting the object into JSON
				try {
				String jsonString = mapper.writeValueAsString(myObject);
				System.out.println(jsonString);
				
				} catch (JsonGenerationException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				}
				
			}

			private static Object convertJson() {
				Object myObject = new Object();
				myObject.setId(1);
				myObject.setEmployee("Yamilka");
				
				String houseName[]= {"Marta, Kathy, Lori"};
				myObject.setHouseName(houseName);
				
				int price[]= {65, 55, 45};
				myObject.setPrice(price);
				
				
				
				return myObject;
			}

		}