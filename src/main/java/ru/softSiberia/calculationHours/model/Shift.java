package ru.softSiberia.calculationHours.model;

import java.util.List;

/*
Shift - модель смен
Входные параметры:
String location - филиал
List<String> teachers - список учителей
List<TimeRange> ranges - диапазоны
 */
public class Shift {
    private String location;
    private List<String> teachers;
    private List<TimeRange> ranges;
}
