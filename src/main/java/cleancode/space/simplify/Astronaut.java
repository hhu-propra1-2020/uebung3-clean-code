/**
 * Based on examples from
 * "Java by Comparison -- Become a Java Craftsman in 70 Examples"
 */
package cleancode.space.simplify;

class Astronaut {
    String name;
    int missions;

    boolean isValid() {
        if (missions < 0 || name == null || name.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
