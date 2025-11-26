public class Bike implements BikeParts {
    private String model;
    private int year;
    
    public Bike(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    @Override
    public String getModel() {
        return model;
    }
    
    @Override
    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public int getYear() {
        return year;
    }
    
    @Override
    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Bike{" +
                "manufacturer='" + MANUFACTURER + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}