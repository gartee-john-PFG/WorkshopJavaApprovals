package VideoStore;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoStoreTests {
    @Test
    public void approveCustomerStatement() {
        Customer cust = new Customer("John Gartee");
        cust.addRental(new Rental(new Movie("Star Wars", Movie.REGULAR), 3));

        String result = cust.statement();

        Approvals.verify(result);
        
    }
}