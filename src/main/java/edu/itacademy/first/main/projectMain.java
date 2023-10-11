package edu.itacademy.first.main;

import edu.itacademy.first.entity.Ball;

class ProjectMain {
    public static void main(String[] args) {
        Ball ball = new Ball(2, "steel","red", 5.2);
        ball.setRadius(3);

        Ball woodBall = new Ball(3,"wood","brown",7.5);
        woodBall.setColor("white");

        Ball plasticBall = new Ball(7,"plastic","white",0.7);
        plasticBall.setWeight(1.7);

        double totalWeight = Math.round(ball.getWeight()+woodBall.getWeight()+plasticBall.getWeight());
        System.out.println("Total weight of balls is around "+totalWeight+ "kg.");

        if  (ball.getColor()== "white") {
            System.out.println("Ball is white");
        }

        if  (woodBall.getColor()== "white") {
            System.out.println("Woodball is white");
        }

        if  (plasticBall.getColor()== "white") {
            System.out.println("Plasticball is white");
        }


    }

}
