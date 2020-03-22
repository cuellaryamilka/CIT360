package MyURL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URL_request {

	public static void main(String[] args) {
		
		try {
			String url = "https://developer.android.com/reference/java/net/HttpURLConnection.html";
			URL obj = new URL (url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			int responseCode = con.getResponseCode();
			System.out.println("\n Sending 'GET' request to URL:" + url);
			
			System.out.println("Response Code: " + responseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader (con.getInputStream()));
			
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) !=null) {
				response.append(inputLine);
			}
			in.close();
			
			//print in String
			System.out.println(response.toString());
			

					
		} catch (Exception e) {
			System.out.println(e);
					
					
		}
	}

}
