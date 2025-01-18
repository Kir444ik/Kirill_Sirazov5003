package Work2;
// Абстрактный класс участников
abstract class ObjectParticipant {
    protected String name;

    public ObjectParticipant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract boolean run(int distance);

    abstract boolean jump(int height);
}