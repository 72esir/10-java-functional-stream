package com.example.task05;

public class Salary extends TypeOfMessage<Integer> {
    private String from;
    private String to;
    private int salary;

    public Salary(String from, String to, int salary){
        super(from,to,salary);
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getTo() {
        return to;
    }

    public int getSalary() {
        return salary;
    }

    public String getFrom() {
        return from;
    }
}
