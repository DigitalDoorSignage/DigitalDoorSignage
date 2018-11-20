package at.htl.rest.util;

public enum Weekday {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THIRSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private final int value;
    private static final Weekday[] weekdays = values();

    private Weekday(int value) {
        this.value = value;
    }

    public static Weekday from(Integer i){
        return weekdays[i];
    }

    public int getValue() {
        return value;
    }
}
