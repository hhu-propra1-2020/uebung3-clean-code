/**
 * Based on examples from
 * "Java by Comparison -- Become a Java Craftsman in 70 Examples"
 */
package cleancode.space.switchcase;

class User {
    private Rank rank;
    private String name;

    User(String name, Rank rank) {
        this.rank = rank;
        this.name = name;
    }

    Rank getRank() {
        return this.rank;
    }

    String getName() {
        return name;
    }
}
