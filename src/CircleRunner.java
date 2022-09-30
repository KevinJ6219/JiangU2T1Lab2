public class CircleRunner {
    public static void main(String[] args) {
        // A. create a Circle object with radius 5.0
        Circle circle1 = new Circle(5.0);
        // B. locate the method defined in the Circle class and write
        //    a line of code to call it on your object
        circle1.printArea();
        // C. BEFORE running this code, PREDICT what gets printed
        // It will output 3.14 times 25.0 which is around 75 something
        // D. run the code and confirm your prediction! Were you correct?
        // Yes the code outputted 78.5 which is just 25 times pi.
    }
}
