package ru.softSiberia.calculationHours.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
Тестовый класс. Просто для тестирования страницы
Потом будет использоваться для работы с excel
 */
@RestController
@RequestMapping("/api/excel")
public class ExcelController {

    @GetMapping("/test")
    public String test() {
        return "Админка работает";
    }
}
