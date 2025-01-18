package Work2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FamilyJumpRun {
    public static void main(String[] args) {
        // Создаем список участников
        List<ObjectParticipant> participants = Arrays.asList(
            new Human("Tisha"),
            new Dog("Bobick"),
            new Tiger("Tigr"),
            new Robot("R2-D2")
        );

        // Создаем список препятствий
        List<Obstacle> obstacles = Arrays.asList(
            new RunRoad(300),
            new JumpWall(1),
            new RunRoad(900),
            new JumpWall(3)
        );

        // Прохождение препятствий
        for (ObjectParticipant participant : participants) {
            System.out.println("\n" + participant.getName() + " начинает испытание!");
            boolean success = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.pass(participant)) {
                    System.out.println(participant.getName() + " не смог преодолеть препятствие. Он выбывает!");
                    success = false;
                    break;
                }
            }
            if (success) {
                System.out.println(participant.getName() + " успешно прошел все препятствия!");
            }
        }
    }
}








