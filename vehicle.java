public class vehicle {
    private String color;
    private String model;
    private String make;
    private int year;
    

    private boolean isNew;

    private String typeOfvehicle;

    private int price;

    private boolean isAutomatic;

    private int miles;

    private double mpg;


    public vehicle(String color, String model, String make, int year){
        super();
        this.color = color;
        this.model = model;
        this.make = make;
        this.year = year;
        this.isNew = isNew;
        this.typeOfvehicle = typeOfvehicle;

    }
    public vehicle(String color, String model, String make, int year, boolean isAutomatic){
        super();
        this.color = color;
        this.model = model;
        this.make = make;
        this.year = year;
        this.isNew = isNew;
        this.typeOfvehicle = typeOfvehicle;
        
    }
    public vehicle(String color, String model, String make, int year, boolean isAutomatic, int miles, double mpg){
        super();
        this.color = color;
        this.model = model;
        this.make = make;
        this.year = year;
        this.isNew = isNew;
        this.typeOfvehicle = typeOfvehicle;
        
    }
}