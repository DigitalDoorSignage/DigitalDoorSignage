package at.htl.rest.endpoint;

import at.htl.persistence.dao.Dao;
import at.htl.persistence.dao.UnitDao;
import at.htl.persistence.entity.Unit;
import at.htl.rest.dto.UnitDto;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("unit")
public class UnitEndpoint extends EntityEndpoint<Unit, UnitDto> {
    @Inject
    UnitDao unitDao;

    @Override
    protected Dao<Unit> getEntityDao() {
        return unitDao;
    }

    @Override
    protected Class<Unit> getEntityClass() {
        return Unit.class;
    }

    @Override
    protected UnitDto getDtoFromEntity(Unit unit) {
        return unit.toDto();
    }

    @Override
    protected Unit updateEntityWithDto(Unit unit, UnitDto unitDao) {
        unit.update(unitDao);
        return unit;
    }
}
