package edu.itacademy.first.main;

import edu.itacademy.first.entity.Ball;
import edu.itacademy.first.service.ServiceBall;

class ProjectMain {
    public static void main(String[] args) {
        Ball ball = new Ball(2, "steel", "red", 5.2);
        ball.setRadius(3);

        Ball woodBall = new Ball(3, "wood", "brown", 7.5);
        woodBall.setColor("white");

        Ball plasticBall = new Ball(7, "plastic", "white", 0.7);
        plasticBall.setWeight(1.7);

//        double totalWeight = Math.round(ball.getWeight() + woodBall.getWeight() + plasticBall.getWeight());
//        System.out.println("Total weight of balls is around " + totalWeight + "kg.");
//
//        if (ball.getColor() == "white") {
//            System.out.println("Ball is white");
//        }
//
//        if (woodBall.getColor() == "white") {
//            System.out.println("Woodball is white");
//        }
//
//        if (plasticBall.getColor() == "white") {
//            System.out.println("Plasticball is white");
//        }
        Ball[] balls = new Ball[3];
        balls [0] = ball;
        balls [1] = woodBall;
        balls [2]= plasticBall;
//        for (int i = 0; i < balls.length; i++) {
//        System.out.println(balls[i]);}
        ServiceBall service = new ServiceBall();
        double result = service.GetBallWeight(balls);
        System.out.println("Total weight of balls is around "+ Math.round(result)+ "kg.");

        int result1 = service.GetBallByColor(balls, "red");
        System.out.println("Numbers of balls colored in chosen color is "+ result1);





    }
}

