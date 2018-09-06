public class City {
    private String name;
    private int size;
    private boolean isCapital;
    private boolean hasMetro;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isHasMetro() {
        return hasMetro;
    }

    public void setHasMetro(boolean hasMetro) {
        this.hasMetro = hasMetro;
    }



    public City (String nameOfCity){
        this.name = nameOfCity;
    }

    public City (String nameOfCity, int sizeOfCity){
        this.name = nameOfCity;
        this.size = sizeOfCity;
    }

    public City (String nameOfCity, int sizeOfCity, boolean isCapital){
        this.name = nameOfCity;
        this.size = sizeOfCity;
        this.isCapital = isCapital;
    }

    public City (String nameOfCity, int sizeOfCity, boolean isCapital, boolean hasMetro){
        this.name = nameOfCity;
        this.size = sizeOfCity;
        this.isCapital = isCapital;
        this.hasMetro = hasMetro;
    }

    public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Size: " + this.size);
        System.out.println("Capital: " + this.isCapital);
        System.out.println("Metro: " + this.hasMetro);
    }


}
