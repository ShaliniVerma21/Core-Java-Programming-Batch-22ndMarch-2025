package Day24;

import javax.script.*;
import java.util.*;
import org.json.JSONObject;

/*
 * 12. Reading JSON and Executing JavaScript via Nashorn
 * ------------------------------------------------------------
 * Description: Demonstrates executing JavaScript code in Java using Nashorn engine and processing JSON.
 * Purpose: Shows interoperability of Java with JavaScript and handling JSON data.
 * Real Example: Running dynamic scripts or evaluating expressions stored in JSON configuration files.
 */

public class p2 {
    public static void main(String[] args) throws Exception {
        // Sample JSON data
        String jsonStr = "{ \"a\": 10, \"b\": 20 }";
        JSONObject json = new JSONObject(jsonStr);

        // Nashorn JavaScript Engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        // Pass JSON values to JS script
        engine.put("a", json.getInt("a"));
        engine.put("b", json.getInt("b"));

        // Execute JavaScript expression
        Object result = engine.eval("var sum = a + b; sum;");
        System.out.println("Result of a + b using Nashorn: " + result);
    }
}

