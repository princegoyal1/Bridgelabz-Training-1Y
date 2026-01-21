public class VolumeOfEarth {
    public static void main(String[] args) {
        int radiusKm = 6378;
        float pi = 3.14f;
        float volumeKm = (4f/3f) * pi * radiusKm * radiusKm * radiusKm;

        // convert radius to miles (1 km = 0.621 miles)
        float radiusMiles = radiusKm * 0.621f;
        float volumeMiles = (4f/3f) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}