package at.htl.rest.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloworld")
public class HelloWorld{

    @GET
    public static String getHelloWorld(){
        return "Hello World";
    }
}
