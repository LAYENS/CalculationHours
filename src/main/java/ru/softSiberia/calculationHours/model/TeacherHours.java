package ru.softSiberia.calculationHours.model;
/*
TeacherHours - модель для результата подсчета часов из экселя: педагог и часы
Входные параметры:
teacherName - фио педагога
minutes - минуты учителя
 */
public class TeacherHours {
    private String teacherName;
    private long minutes;

    public TeacherHours(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setMinutes(long minutes) {
        this.minutes += minutes;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public long getMinutes() {
        return minutes;
    }
}
