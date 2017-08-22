package norder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App {
    public static String getGreeting() {
	return "Hello World";
    }
    public static void main(String[] args) {
        Client client = Client.create();
        WebResource webResource = client.resource("http://forecast.weather.gov/MapClick.php?x=233&y=85&site=iln&zmx=&zmy=&map_x=233&map_y=85&&FcstType=json");
        ClientResponse response = webResource.header("User-Agent", "norjekudo software llc").get(ClientResponse.class);
        Wx output = response.getEntity(Wx.class);
       /* 
        ArrayList<String> arr = (ArrayList<String>)output.get("text");
        Map mp = (Map)output.get("currentobservation");
*/

        output.data.text.forEach(x -> System.out.println(x));
        System.out.println(output.data.text.get(0));
    }
}

