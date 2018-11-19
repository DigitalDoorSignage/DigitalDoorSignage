package at.htl.rest.endpoint;

import at.htl.persistence.dao.Dao;
import at.htl.persistence.dao.SubjectDao;
import at.htl.persistence.entity.Subject;
import at.htl.rest.dto.SubjectDto;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("subject")
public class SubjectEndpoint extends EntityEndpoint<Subject, SubjectDto> {
    @Inject
    SubjectDao subjectDao;
    @Override
    protected Dao<Subject> getEntityDao() {
        return subjectDao;
    }

    @Override
    protected Class<Subject> getEntityClass() {
        return Subject.class;
    }

    @Override
    protected SubjectDto getDtoFromEntity(Subject subject) {
        return subject.toDto();
    }

    @Override
    protected Subject updateEntityWithDto(Subject subject, SubjectDto subjectDao) {
        subject.update(subjectDao);
        return subject;
    }
}
