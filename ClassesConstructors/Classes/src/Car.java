public class Car {
    
    //  the private keyword ensures encapsulation so the properties can only be accessed from within the class via methods
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // have setters and getters methods in java to allocate and retrieve information
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("tt")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
        // this refers to the object parameter, differentiates from the parameter model passed to this method

    }

    public String getModel(){
        return this.model;
    }

}
