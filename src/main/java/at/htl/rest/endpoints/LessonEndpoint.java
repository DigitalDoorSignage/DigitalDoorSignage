package at.htl.rest.endpoints;

import at.htl.persistence.dao.LessonDao;
import at.htl.persistence.entities.Lesson;
import at.htl.rest.dto.LessonDto;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("lesson")
public class LessonEndpoint {

    @Inject
    LessonDao lessonDao;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<LessonDto> getAllLessons(){
        return lessonDao
                .getAll()
                .stream()
                .map(Lesson::toDto)
                .collect(Collectors.toList());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public LessonDto getLessonById(@PathParam("id") Integer id){
        return lessonDao
                .getById(id)
                .toDto();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createLesson(Lesson lesson){
        if(lesson == null)
            return Response
                .status(Response.Status.BAD_REQUEST)
                .build();

        lessonDao.create(lesson);

        return Response
                .status(Response.Status.CREATED)
                .build();
    }


}
