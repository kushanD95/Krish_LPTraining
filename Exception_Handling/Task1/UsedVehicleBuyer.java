import java.io.FileNotFoundException;

public class UsedVehicleBuyer {

    public static void main(String[] args) throws VehicleIsNotAvailableException {

        try {
            selectOneVehicle();
        } catch (VehicleIsNotAvailableException e) {
            e.printStackTrace();
        }

    }

    public static void selectOneVehicle() throws VehicleIsNotAvailableException {
        try {
            getCondition();
        } catch (VehicleConditionException e) {
            throw new VehicleIsNotAvailableException("Vehicle is not ready for sale", e);
        }

    }

    public static void getCondition() throws VehicleConditionException {
        try {
            getUsedCarHistory();
        } catch (VehicleHistoryException e) {
            throw new VehicleConditionException("Vehicle condition details are not available", e);
        }

    }

    public static void getUsedCarHistory() throws VehicleHistoryException {
        try {
            getVehicleBook();
        } catch (VehicleDataNotFoundException e) {
            throw new VehicleHistoryException("Vehicle History data is not available", e);
        }
    }

    public static void getVehicleBook() throws VehicleDataNotFoundException {
        throw new VehicleDataNotFoundException("Vehicle Book not avilable..");
    }
}

class VehicleDataNotFoundException extends FileNotFoundException {

    private static final long serialVersionUID = 1L;

    public VehicleDataNotFoundException(String message) {
        super(message);
    }

}

class VehicleIsNotAvailableException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleIsNotAvailableException(String message, Exception ex) {
        super(message, ex);
    }
}

class VehicleConditionException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleConditionException(String message, Exception ex) {
        super(message, ex);
    }
}

class VehicleHistoryException extends Exception {

    private static final long serialVersionUID = 1L;

    public VehicleHistoryException(String message, Exception ex) {
        super(message, ex);
    }
}