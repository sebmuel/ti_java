package inheritance.Lebewesen;

public abstract class Lebewesen {
    protected String name;
    protected int alter;
    protected int beine;

    public abstract void atmen();

    public String getName() {
        return name;
    }

    public int getBeine() {
        return beine;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setBeine(int beine) {
        this.beine = beine;
    }

    public void setName(String name) {
        this.name = name;
    }
}
