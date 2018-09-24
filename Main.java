public class Main {

    public static void main(String[] args) {
    //
    double droneAY = 5;
    double droneAX = 2;
    double droneAZ = -5;
    double droneBY = 4;
    double droneBX = 9;
    double droneBZ = 2;
    double droneCY = -3;
    double droneCX = 2;
    double droneCZ = 6;

    double distAtoB = Math.sqrt(Math.pow(droneAY-droneBY,2)+Math.pow(droneAX-droneBX,2)+Math.pow(droneAZ-droneBZ,2));
    double distAtoC = Math.sqrt(Math.pow(droneAY-droneCY,2)+Math.pow(droneAX-droneCX,2)+Math.pow(droneAZ-droneCZ,2));
    double distBtoC = Math.sqrt(Math.pow(droneBY-droneCY,2)+Math.pow(droneBX-droneCX,2)+Math.pow(droneBZ-droneCZ,2));

    System.out.print("The longest distance between two drones is ");
    System.out.printf("%.2f.\n",Math.max(distAtoB,Math.max(distAtoC,distBtoC)));
    System.out.print("The shortest distance between two drones is ");
    System.out.printf("%.2f.\n",Math.min(distAtoB,Math.min(distAtoC,distBtoC)));
    }
}
