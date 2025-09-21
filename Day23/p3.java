package Day23;

/*
 * 19. Nashorn JavaScript Engine
 * ------------------------------------------------------------
 * Description: Nashorn is a lightweight JavaScript engine in JDK 8 that allows running JS code inside Java.
 * Purpose: Enables integration of JavaScript code in Java applications for scripting and dynamic execution.
 * Real Example: Evaluating dynamic JS expressions or templates in a Java-based web application.
 */

import javax.script.*;

public class p3{
    public static void main(String[] args) throws Exception {
        // Create a Nashorn script engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        
        // Evaluate JavaScript code
        engine.eval("print('Hello from JavaScript inside Java!');");
    }
}
