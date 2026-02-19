package clean.code.practice_2.task_10;

public class Main {
    static void main(String[] args) {
        MileageDistance mileageDistance = new MileageDistance(100);
        NavigationApp navigationApp = new NavigationApp();

        KilometersAdapter kilometersAdapter = new KilometersAdapter(mileageDistance);
        navigationApp.printCurrentDistance(kilometersAdapter);
    }
}
