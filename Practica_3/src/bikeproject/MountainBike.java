public class MountainBike extends Bike implements MountainParts {
    private String suspension;
    private String type;
    
    public MountainBike(String model, int year, String suspension, String type) {
        super(model, year);
        this.suspension = suspension;
        this.type = type;
    }
    
    @Override
    public String getSuspension() {
        return suspension;
    }
    
    @Override
    public void setSuspension(String newValue) {
        this.suspension = newValue;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public void setType(String newValue) {
        this.type = newValue;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               ", terrain='" + TERRAIN + '\'' +
               ", suspension='" + suspension + '\'' +
               ", type='" + type + '\'' +
               '}';
    }
}