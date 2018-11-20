package at.htl.rest.endpoint;

import at.htl.persistence.dao.*;
import at.htl.persistence.entity.Lesson;
import at.htl.persistence.entity.Subject;
import at.htl.rest.dto.LessonDto;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("lesson")
public class LessonEndpoint extends EntityEndpoint<Lesson, LessonDto>{

    @Inject
    LessonDao lessonDao;
    @Inject
    RoomDao roomDao;
    @Inject
    TeacherDao teacherDao;
    @Inject
    SubjectDao subjectDao;

    @Override
    protected Dao<Lesson> getEntityDao() {
        return lessonDao;
    }

    @Override
    protected Class<Lesson> getEntityClass() {
        return Lesson.class;
    }

    @Override
    protected LessonDto getDtoFromEntity(Lesson lesson) {
        return lesson.toDto();
    }

    @Override
    protected Lesson updateEntityWithDto(Lesson lesson, LessonDto lessonDto) {
        lesson.update(lessonDto, roomDao, teacherDao, subjectDao);
        return lesson;
    }
}
