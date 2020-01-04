
package com.testng.TestNG;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	public static Object[][] getJSONdata(String JSON_path, String JSON_data, int JSON_attributes)
			throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(JSON_path));
		JSONObject jo = (JSONObject) obj;
		JSONArray js = (JSONArray) jo.get(JSON_data);

		Object[][] arr = new String[js.size()][JSON_attributes];
		for (int i = 0; i < js.size(); i++) {
			JSONObject obj1 = (JSONObject) js.get(i);
			arr[i][0] = String.valueOf(obj1.get("UserID"));
//                        arr[i][1] = String.valueOf(obj1.get("Password"));
//                        arr[i][2] = String.valueOf(obj1.get("ConPassword"));
		}
		return arr;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		String JSON_path = "C:\\JavaClass\\WS\\TestNG\\src\\main\\resources\\product.json";
		Object[][] adi = JsonReader.getJSONdata(JSON_path, "product", 1);
		System.out.println(Arrays.deepToString(adi));
	}
}