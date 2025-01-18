package Work2;
// Класс Robot
class Robot extends ObjectParticipant {
    private final int maxRun = 1500;
    private final int maxJump = 1;

    public Robot(String name) {
        super(name);
    }

    @Override
    boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " успешно пробежал " + distance + " метров.");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
            return false;
        }
    }

    @Override
    boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println(name + " успешно перепрыгнул стену высотой " + height + " метров.");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метров.");
            return false;
        }
    }
}

// Абстрактный класс препятствий
abstract class Obstacle {
    abstract boolean pass(ObjectParticipant participant);
}

// Класс RunRoad
class RunRoad extends Obstacle {
    private final int length;

    public RunRoad(int length) {
        this.length = length;
    }

    @Override
    boolean pass(ObjectParticipant participant) {
        System.out.println(participant.getName() + " пытается пробежать дорожку длиной " + length + " метров...");
        return participant.run(length);
    }
}
