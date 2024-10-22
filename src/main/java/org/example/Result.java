package org.example;

public class Result {
    private Integer set;

    public Result(Integer set) {
        this.set = set;
    }

    public Integer getSet() {
        return set;
    }

    public void setSet(Integer set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Result{" +
                "set=" + set +
                '}';
    }
}
