/**
 * Based on examples from
 * "Java by Comparison -- Become a Java Craftsman in 70 Examples"
 */
package cleancode.space.switchcase;

import java.util.Objects;

class BoardComputer {
    private CruiseControl cruiseControl = new CruiseControl();

    private void authorize(User user) {
        Objects.requireNonNull(user);
        switch (user.getRank()) {
            case UNKNOWN:
                cruiseControl.logUnauthorizedAccessAttempt();
            case ASTRONAUT:
                cruiseControl.grantAccess(user);
                break;
            case COMMANDER:
                cruiseControl.grantAccess(user);
                cruiseControl.grantAdminAccess(user);
                break;
        }
    }
}
