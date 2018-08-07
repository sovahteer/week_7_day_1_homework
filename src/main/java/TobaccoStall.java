public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(visitor); {
        if (visitorAge <= 18) {
            return false;
        } else {
            return true;
        }
    }
}
