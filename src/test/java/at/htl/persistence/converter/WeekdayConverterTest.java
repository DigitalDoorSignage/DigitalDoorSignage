package at.htl.persistence.converter;

import at.htl.rest.util.Weekday;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class WeekdayConverterTest {

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class GivenAValidInput{
        WeekdayConverter converter;

        @BeforeAll
        public void Setup(){
            converter = new WeekdayConverter();
        }


        @Nested
        class WhenCallingConvertToDatabaseColumn{

            @Test
            public void ShouldReturnTheCorrectInteger(){
                Integer expectedWeekdayIndex = 0;
                Integer actualWeekdayIndex;

                actualWeekdayIndex = converter.convertToDatabaseColumn(Weekday.from(expectedWeekdayIndex));

                assertEquals(expectedWeekdayIndex, actualWeekdayIndex);
            }

        }

        @Nested
        class WhenCallingConvertToEntityAttribute{

            @Test
            public void ShouldReturnTheCorrectWeekday(){
                Weekday expectedWeekday = Weekday.MONDAY;
                Weekday actualWeekday;

                actualWeekday = converter.convertToEntityAttribute(expectedWeekday.getValue());

                assertEquals(expectedWeekday, actualWeekday);
            }

        }
    }
}