public class Fio {
    private final String name;
    private final String surName;

    private final String middleName;

    public Fio (String name, String surName, String middleName){

        this.name = name;
        this.surName= surName;
        this.middleName = middleName;

    }
    public String getName() {
        return this.name;
    }
    public String getSurName() {
        return this.surName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    public String toString() {
        return  this.surName +" "+ this.name+" "+this.middleName;
    }

}
