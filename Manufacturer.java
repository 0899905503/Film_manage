public class Manufacturer {
    private String manufacturerName;
    private String country;
    public Manufacturer( String manufacturerName ,String country){
        this.manufacturerName=manufacturerName;
        this.country=country;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getManufacturerName() {
        return manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public void DisPlay(){
        System.out.println("Manufacturer Name : "+manufacturerName+" // Country : "+country);
    }
    public String toString(){
        return manufacturerName;
    }
}
