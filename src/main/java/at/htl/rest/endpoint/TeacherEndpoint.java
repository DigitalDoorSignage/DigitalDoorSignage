package at.htl.rest.endpoint;

import at.htl.persistence.dao.Dao;
import at.htl.persistence.dao.TeacherDao;
import at.htl.persistence.entity.Teacher;
import at.htl.rest.dto.TeacherDto;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("teacher")
public class TeacherEndpoint extends EntityEndpoint<Teacher, TeacherDto> {
    @Inject
    TeacherDao teacherDao;

    @Override
    protected Dao<Teacher> getEntityDao() {
        return teacherDao;
    }

    @Override
    protected Class<Teacher> getEntityClass() {
        return Teacher.class;
    }

    @Override
    protected TeacherDto getDtoFromEntity(Teacher teacher) {
        return teacher.toDto();
    }

    @Override
    protected Teacher updateEntityWithDto(Teacher teacher, TeacherDto teacherDto) {
        teacher.update(teacherDto);
        return teacher;
    }
}
