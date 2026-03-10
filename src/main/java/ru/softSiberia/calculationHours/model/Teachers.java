package ru.softSiberia.calculationHours.model;

/*
Teachers - Модель учителей
входные параметры:
Long Id - ID педагога, пока нет БД, записи сотрудников и простая система,
оставим лонг(быстрее чтение, меньше объем переменной)
String fullName - ФИО педагога
 */
public class Teachers {
    private final Long id;
    private final String fullName;

    public Teachers(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
