package clean.code.practice_2.task_10;

public class KilometersAdapter implements KilometerDistance {
    private MileageDistance mileageDistance;

    public KilometersAdapter(MileageDistance mileageDistance) {
        this.mileageDistance = mileageDistance;
    }

    @Override
    public double getDistance() {
        double mileage = mileageDistance.getMileageDistance();
        return mileage * 1.61;
    }
}
