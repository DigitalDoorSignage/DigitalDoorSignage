package at.htl.rest.endpoints;

import at.htl.persistence.dao.LessonDao;
import at.htl.persistence.entities.Lesson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Lesson")
public class LessonEndpoint {
    @GET
    public String test(){
        LessonDao helper = new LessonDao();
        helper.create(new Lesson());
        return "Lesson";
    }

}
