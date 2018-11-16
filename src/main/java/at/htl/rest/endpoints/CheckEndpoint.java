package at.htl.rest.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("check")
public class CheckEndpoint {

    @GET
    public static String getSuccessCode(){
        return "Healthy";
    }
}
