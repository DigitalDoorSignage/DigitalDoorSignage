package at.htl.persistence.converter;

import at.htl.rest.util.Weekday;

import javax.persistence.AttributeConverter;

public class WeekdayConverter implements AttributeConverter<Weekday, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Weekday weekday) {
        if(weekday == null)
            return null;
        return weekday.getValue();
    }

    @Override
    public Weekday convertToEntityAttribute(Integer integer) {
        if(integer == null)
            return null;
        return Weekday.from(integer);
    }
}
