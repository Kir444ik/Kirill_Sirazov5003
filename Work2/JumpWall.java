package Work2;
// Класс JumpWall
class JumpWall extends Obstacle {
    private final int height;

    public JumpWall(int height) {
        this.height = height;
    }

    @Override
    boolean pass(ObjectParticipant participant) {
        System.out.println(participant.getName() + " пытается перепрыгнуть стену высотой " + height + " метров...");
        return participant.jump(height);
    }
}
