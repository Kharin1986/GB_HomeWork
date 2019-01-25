package ru.geekbrains.classes;

import ru.geekbrains.classes.animals.Cat;
import ru.geekbrains.classes.animals.Dog;
import ru.geekbrains.classes.obstacles.Cross;
import ru.geekbrains.classes.obstacles.Obstacle;
import ru.geekbrains.classes.obstacles.Wall;
import ru.geekbrains.classes.obstacles.Water;

public class Application {

    public static void main(String[] args) {



        Team team = new Team("DreamTeam", new Participant[] {
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Robot("Вертер", 50, 50, 50),
        }); // Создаем команду



        Course c = new Course("ddd",team,new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        }); // Создаем полосу препятствий
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
        team.showWinnerResults();// Показываем победителей

    }
}
