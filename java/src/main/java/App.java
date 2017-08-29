package norder;

import org.json.*;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App {
    public static String getGreeting() {
	return "Hello World";
    }
    public static void main(String[] args) {
       try {
            String output = Util.getHTTP("http://forecast.weather.gov/MapClick.php?x=233&y=85&site=iln&zmx=&zmy=&map_x=233&map_y=85&&FcstType=json");
            JSONTokener jsonParser = new JSONTokener(output);
            JSONObject jo = (JSONObject) jsonParser.nextValue();
            System.out.println(jo.getString("productionCenter"));
            System.out.println(jo.getJSONObject("time").getJSONArray("startPeriodName").get(0));
            JSONArray ja = jo.getJSONObject("time").getJSONArray("startPeriodName");
            for(Object x : ja) {
                System.out.println(x);
            }
        } catch (Exception ex) {
            System.out.println("error");
        }
    }
}

