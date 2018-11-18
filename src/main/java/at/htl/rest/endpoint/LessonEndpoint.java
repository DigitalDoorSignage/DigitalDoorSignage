package at.htl.rest.endpoint;

import at.htl.persistence.dao.LessonDao;
import at.htl.persistence.dao.RoomDao;
import at.htl.persistence.dao.TeacherDao;
import at.htl.persistence.entity.Lesson;
import at.htl.rest.dto.LessonDto;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("lesson")
@Produces(MediaType.APPLICATION_JSON)
public class LessonEndpoint {

    @Inject
    LessonDao lessonDao;
    @Inject
    RoomDao roomDao;
    @Inject
    TeacherDao teacherDao;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public List<LessonDto> getAllLessons(){
        return lessonDao
                .getAll()
                .stream()
                .map(Lesson::toDto)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public Response getLessonById(@PathParam("id") Integer id){
        Lesson lesson = lessonDao.getById(id);
        if(lesson == null)
            return Response
                .status(Response.Status.NOT_FOUND)
                .build();
        else
            return Response
                .ok()
                .entity(lesson.toDto())
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createLesson(LessonDto lessonDto){
        if(lessonDto == null)
            return Response
                .status(Response.Status.BAD_REQUEST)
                .build();

        Lesson lesson = new Lesson();
        lesson.update(lessonDto, roomDao, teacherDao);

        lessonDao.create(lesson);

        return Response
                .status(Response.Status.CREATED)
                .entity(lesson.getId())
                .build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateLesson(LessonDto lessonDto, @PathParam("id") Integer id){
        Lesson lesson = lessonDao.getById(id);
        lesson.update(lessonDto, roomDao, teacherDao);
        lessonDao.update(lesson);
        return Response
                .ok()
                .build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteLesson(@PathParam("id") Integer id){
        lessonDao.delete(id);
        return Response
                .ok()
                .build();
    }
}
