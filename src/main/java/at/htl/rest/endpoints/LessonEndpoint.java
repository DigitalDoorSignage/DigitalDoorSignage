package at.htl.rest.endpoints;

import at.htl.persistence.dao.LessonDao;
import at.htl.persistence.entities.Lesson;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("lesson")
public class LessonEndpoint {

    @GET
    public String test(){
        LessonDao lessonDao = new LessonDao();
        Lesson lesson = new Lesson(0, null, null);
        lessonDao.create(lesson);
        return "Created";
    }

}
