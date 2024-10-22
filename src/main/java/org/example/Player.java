package org.example;

public class Player {
    private String name;
    private String lastName;
    private Integer points;
    private Result result;

    public Player() {
    }

    public Player(String name, String lastName, Integer points, Result result) {
        this.name = name;
        this.lastName = lastName;
        this.points = points;
        this.result = result;
    }

    public Player(String name, String lastName, Integer points) {
        this.name = name;
        this.lastName = lastName;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", points=" + points +
                ", result=" + result +
                '}';
    }
}
