package edu.itacademy.first.service;

import edu.itacademy.first.entity.Ball;

public class ServiceBall {
    public double GetBallWeight(Ball[] balls) {
        double total = 0;
        for (int i = 0; i < balls.length ; i++) {
            total += balls[i].getWeight();
        }
        return total;
    }
    public int GetBallByColor(Ball[] balls, String countColor) {
        int total1 = 0;
        for (int i = 0; i < balls.length ; i++) {
           if (balls[i].getColor().equals(countColor)){
            total1++;}
        }
        return total1;
    }

}
