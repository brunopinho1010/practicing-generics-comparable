package entities;

public class Person implements Comparable<Person> {

    private String name;
    private Double salary;

    public Person(String name,Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Nome : "+name+",Salario: "+String.format("%.2f", salary);
    }

    /*

    Comparando nome

    */
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }

/*
    Comparando salario..


   /@Override
    public int compareTo(Person o) {
        return salary.compareTo(o.getSalary());
    }
    */
    
    
}
