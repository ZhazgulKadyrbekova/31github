package agileEngine;

import java.util.Optional;

public class UserStats {

    public UserStats(Long visitCount) {
        if (visitCount == null)
            this.visitCount = Optional.empty();
        else
            this.visitCount = Optional.of(visitCount);
    }

    Optional<Long> visitCount;

    public Optional<Long> getVisitCount() {
        return visitCount;
    }
}
