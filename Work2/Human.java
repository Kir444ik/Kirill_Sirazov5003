package Work2;
// Класс Human
class Human extends ObjectParticipant {
    private final int maxRun = 890;
    private final int maxJump = 1;

    public Human(String name) {
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

// Класс Dog
class Dog extends ObjectParticipant {
    private final int maxRun = 500;
    private final int maxJump = 2;

    public Dog(String name) {
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