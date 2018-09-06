public class Cat {

    String name;
    int age;
    String color;
    boolean hasMedals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasMedals() {
        return hasMedals;
    }

    public void setHasMedals(boolean hasMedals) {
        this.hasMedals = hasMedals;
    }


    public Cat(String nameOfCat, int ageOfCat, String color, boolean hasMedals) {
        this.name = nameOfCat;
        this.age = ageOfCat;
        this.color = color;
        this.hasMedals = hasMedals;
    }





     public static Cat burnCat(String nameOfCat, int ageOfCat, String color, boolean hasMedals){

        Cat cat = new Cat(nameOfCat, ageOfCat, color, hasMedals);

        System.out.println("I was born");

        return cat;
    }
    public void eat(String typeOfFood){
        System.out.println("I like eat" + " " + typeOfFood);
    }


}
