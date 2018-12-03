package pl.grz.dvdshop.model;

public class DVD {
private String type;
private String kind;
private int diameter;
private int megabytes;
private int speed;
private double price;

    public DVD(){}

    public DVD(String type, String kind, int diameter, int megabytes, int speed, double price) {
        this.type = type;
        this.kind = kind;
        this.diameter = diameter;
        this.megabytes = megabytes;
        this.speed = speed;
        this.price = price;
    }

    //getters
    public String getType(){
        return type;
    }

    public String getKind(){
        return kind;
    }

    public int getDiameter(){
        return diameter;
    }

    public int getMegabytes(){
        return megabytes;
    }

    public int getSpeed(){
        return speed;
    }

    public double getPrice(){
        return price;
    }

    //setters
    public void setType(String type){
        this.type = type;
    }

    public void setKind(String kind){
        this.kind = kind;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setMegabytes(int megabytes) {
        this.megabytes = megabytes;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //displays method
    public String toString() {
        return "[ typ: " + type + " - rodzaj: " + kind + " - średnica: " + diameter + " - pojemność: " + megabytes
                + " - prędkość: " + speed + " - cena: " + price + "]";
    }
}
