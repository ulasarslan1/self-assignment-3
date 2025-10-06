package self_assignment_2;

// ====================================
// Subclass: HumanOperation
// ====================================
public class HumanOperation extends IOperation {

    public HumanOperation(String operationID, String description, long nominalTime, int maxResources) {
        super(operationID, description, nominalTime, maxResources);
    }

    @Override
    public void executeOperation() {
        System.out.println("Executing Human Operation: " + toString());
        System.out.println("Details: " + getData());
    }
}
