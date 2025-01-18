package Work2;
// Класс Tiger
class Tiger extends ObjectParticipant {
    private final int maxRun = 1000;
    private final int maxJump = 3;

    public Tiger(String name) {
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