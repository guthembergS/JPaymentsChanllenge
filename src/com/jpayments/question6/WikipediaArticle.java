package com.jpayments.question6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WikipediaArticle {

	
	public int getTopicCount(String topic) throws IOException {
			
			String url = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page="+topic;
		    URL obj = new URL(url);
		    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		    con.setRequestMethod("GET");
		    int responseCode = con.getResponseCode();
		    BufferedReader in = new BufferedReader(
		            new InputStreamReader(con.getInputStream()));
		    String inputLine;
		    StringBuffer response = new StringBuffer();
		    while ((inputLine = in.readLine()) != null) {
		    	response.append(inputLine);
		    }
		    in.close();
		    Pattern p = Pattern.compile(topic);
		    Matcher m = p.matcher(response.toString());
		    int cont = -1;
		    while (m.find()) {
		    	cont+=1;
		    }
		    return cont;
   
	}

}
