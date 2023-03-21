package org.example;

import org.example.dto.DataDto;
import org.example.model.Data;

/**
 * Получить данные об адресе текущего пользователя из REST API в формате json
 * Затем сохранить полученный JSON в отдельный файл с названием ip-info.txt
 * <p>
 * В качестве REST / HTTP клиента использовать библиотеку Jsoup
 * В качестве json parser использовать библиотеку GSON
 * Для подключения библиотек использовать Maven
 * Для работы с файлами использовать стандартные средства JDK, Java nio
 * Файл необходимо обновлять каждый раз, если он существует, или создавать, если его нет
 * Необходимо обработать исключительные случаи
 * Использовать конструкцию try-catch
 * Обрабатывать исключения, которые потенциально могут возникать при создании и редактировании файла, при запросе в API (к примеру, сервер не ответил на запрос)
 * <p>
 * <p>
 * Применить паттерн Стратегия и предоставить пользователю выбор вывода ip адреса через файл или через консоль
 * Выбор пользователя осуществляется при помощи аргументов в командной строке
 * <p>
 *
 * Ссылка на API: <a href="https://api.ipify.org/?format=json">...</a>
 **/
public class Main {
    public static void main(String[] args) {

        final String URL = "https://api.ipify.org/?format=json";
        DataDto dto = new DataDto(URL);
        Data data = dto.convertJsonToData();
        data.printData(false);
    }
}