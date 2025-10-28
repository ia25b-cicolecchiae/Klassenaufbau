package exercise3;

public class Car {
  public double fuelLevel;
  public double mileage;
  public String licensePlate;
  public double fuelConsumption;
  public double fuelCapacity;

  public Car(String zh420, int i, int i1, double v, int i2) {
      licensePlate = zh420;
      fuelLevel = i2;
      mileage = i;
      fuelConsumption = v;
      fuelCapacity = i1;

  }



  public void drive(int distance) {


      if (fuelLevel - distance * fuelConsumption < 0) {
          double maxDistance = fuelLevel / fuelConsumption;
          fuelLevel = 0.0;
          mileage += (double) Math.round(maxDistance * 100) / 100;
      } else {
          mileage += distance;
          fuelLevel =  fuelLevel - distance * fuelConsumption;
      }
  }

  public void refuel(int amount) {
      if (fuelLevel + amount > fuelCapacity) {
          fuelLevel = fuelCapacity;
      } else {
         fuelLevel = fuelLevel + amount;
      }
  }

  public String toString() {
      return "Car{" +
              "licensePlate='" + licensePlate + '\'' +
              ", mileage=" + mileage +
              ", fuelConsumption=" + fuelConsumption +
              ", fuelCapacity=" + fuelCapacity +
              ", fuelLevel=" + fuelLevel +
              '}';
  }
}
