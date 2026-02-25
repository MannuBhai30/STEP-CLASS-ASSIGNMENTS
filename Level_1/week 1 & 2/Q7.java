class Q7 {
    public static void main(String[] args) {
        
        // Radius of earth in km as given in hint
        double radiusKm = 6378.0; 
        
        // Value of Pi
        double pi = 3.14159265359;
        
        // Compute volume in cubic kilometers (4/3 * pi * r^3)
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3); 
        
        // Conversion factor: 1 km = 0.621371 miles
        double kmToMiles = 0.621371;
        
        // Radius in miles
        double radiusMiles = radiusKm * kmToMiles;
        
        // Compute volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles,3);
        
        // Display result in the required format
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}