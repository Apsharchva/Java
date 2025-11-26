public interface BikeParts {
    String MANUFACTURER = "BikeCompany"; // неизменяемое значение
    
    String getModel();
    void setModel(String model);
    int getYear();
    void setYear(int year);
}