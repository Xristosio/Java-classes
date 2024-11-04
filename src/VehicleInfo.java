public record VehicleInfo(String make, String model, @MinYear(2000) int year) {}
