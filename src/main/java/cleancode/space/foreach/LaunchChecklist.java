/**
 * Based on examples from
 * "Java by Comparison -- Become a Java Craftsman in 70 Examples"
 */
package cleancode.space.foreach;

import java.util.Arrays;
import java.util.List;

class LaunchChecklist {
    List<String> checks = Arrays.asList(
            "Cabin Pressure",
            "Communication",
            "Engine"
    );

    Status prepareForTakeoff(Commander commander) {
        for (int i = 0; i < checks.size(); i++) {
            boolean shouldAbortTakeoff = commander.isFailing(checks.get(i));
            if (shouldAbortTakeoff) {
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }
}
