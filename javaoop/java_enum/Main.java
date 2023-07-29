package javaoop.java_enum;

public class Main {
    public static void main(String[] args) {
        planet.EARTH.calculateSurfaceGravity(80);
    }
    enum planet{
		MERCURY(3.3011E+23, 2439.7E3),
        VENUS(4.8675E+24, 6051.8E3),
        EARTH(5.9724E+24, 6371.0E3),
        MARS(6.4171E+23, 3389.5E3),
        JUPITER(1.8982E+27, 69911E3),
        SATURN(5.6834E+26, 58232E3),
        URANUS(8.6810E+25, 25362E3),
        NEPTUNE(1.0243E+26, 24622E3);

        final private double mass;
        final private double radius;
        private static final double G = 6.6743e-11; 

        planet(double mass,double radius){
            this.mass = mass;
            this.radius = radius;
        }

        public double calculateSurfaceGravity(double weight) {
            double mass = weight / EARTH.getSurfaceGravity();
            System.out.println(mass * getSurfaceGravity());
            return mass * getSurfaceGravity();
        }
    
        public double getSurfaceGravity() {
            return G * mass / (radius * radius);
        }

    }

    
}
