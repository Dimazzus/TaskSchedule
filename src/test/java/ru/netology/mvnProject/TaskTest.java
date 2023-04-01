package ru.netology.mvnProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void shouldFindMatchesSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertTrue(actual);
    }


    @Test
    public void shouldFindMatchesEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldFindMatchesMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );


        boolean actual = meeting.matches("приложения");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotFindMatchesSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("Отправить");
        Assertions.assertFalse(actual);

    }
}