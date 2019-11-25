package pl.jasiek.app.model;

public class Car {
    private int id;
    protected String name;
    protected int year;
    protected int amountSitPlace;
    protected double prize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountSitPlace() {
        return amountSitPlace;
    }

    public void setAmountSitPlace(int amountSitPlace) {
        this.amountSitPlace = amountSitPlace;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
}
