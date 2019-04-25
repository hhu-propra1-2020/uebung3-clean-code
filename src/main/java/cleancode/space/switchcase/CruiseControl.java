/**
 * Based on examples from
 * "Java by Comparison -- Become a Java Craftsman in 70 Examples"
 */
package cleancode.space.switchcase;

class CruiseControl {
    void logUnauthorizedAccessAttempt() {
        System.out.println("Unauthorized Access!");
    }

    void grantAccess(User user) {
        System.out.println("Access granted to " + user.getName());
    }

    void grantAdminAccess(User user) {
        System.out.println("Granted Admin access to " + user.getName());
    }
}
