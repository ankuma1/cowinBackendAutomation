package utils.retrofit;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class APITest extends ExecuteService {

    public static Logger logger = LoggerFactory.getLogger(APITest.class);
    public static ExecuteService httpCall;
    public APITest(String baseUrl) throws FileNotFoundException {
        FileReader reader = new FileReader("src/main/resources/host.json");
        JsonElement parser = new JsonParser().parse(reader);
        JsonObject object =parser.getAsJsonObject();
        String url = object.get(baseUrl).getAsString();
        this.httpCall = setUp(url);
    }
}
