package javaCode;

final class ImmutableEmployee {

    private final int id;
    private final String name;

    public ImmutableEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}