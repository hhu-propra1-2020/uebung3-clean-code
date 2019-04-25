/**
 * Based on examples from
 * "Java by Comparison -- Become a Java Craftsman in 70 Examples"
 */
package cleancode.space.magicnumbers;

public class Spaceship {
    int currentSpeed = 42;

    void velocity() {
        if (this.currentSpeed == 42000) {
            System.out.println("Reached maximal velocity");
        } else if (this.currentSpeed == 1000) {
            System.out.println("Reached travel speed");
        }
    }
}
