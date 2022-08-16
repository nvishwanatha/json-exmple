package com.json.exampl.jsonexmple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@SpringBootApplication
public class JsonExmpleApplication {

	public static void main(String[] args) throws IOException, ParseException {
		SpringApplication.run(JsonExmpleApplication.class, args);

		JSONParser jsonParser = new JSONParser();
		//FileReader fileReader = new FileReader("/Users/vijiattimarad/Downloads/json-exmple/src/main/resources/jsonfile.json");
		JSONObject empjsonObj = (JSONObject)jsonParser.parse(new FileReader("/Users/vijiattimarad/Downloads/json-exmple/src/main/resources/jsonfile.json"));
		System.out.println(empjsonObj.get("fistName"));
		System.out.println(empjsonObj.get("lastName"));

		JSONArray arrayObj =(JSONArray) empjsonObj.get("Address");

		for (int i = 0; i < arrayObj.size(); i++) {
			JSONObject address = (JSONObject) arrayObj.get(i);
			System.out.println(address.get("street"));
			System.out.println(address.get("city"));
			System.out.println(address.get("state"));


		}

	}

}
