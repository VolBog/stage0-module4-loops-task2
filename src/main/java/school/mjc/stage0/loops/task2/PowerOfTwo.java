package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int result = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            while (power-- >= 0) {
                if (result < 0) {

                    break;
                }
                System.out.println(result);
                result *= 2;
            }
        }

    }
}
