package ex12;

import java.awt.geom.Area;

public class Circle {
        private double radius = 1.0;

        // Constructors
        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        // Getter
        public double getRadius() {
            return radius;
        }

        // Setter
        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Calculate area: πr²
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Calculate circumference: 2πr
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        // toString: "Circle[radius=?]"
        @Override
        public String toString() {
            return "Circle[radius=" + radius + "]";
        }
    }


