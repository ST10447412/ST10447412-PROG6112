//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            public interface IRoadAccidents {
                String getAccidentVehicleType();

                String getCity();

                int getAccidentTotal();
            }

            abstract class RoadAccidents implements IRoadAccidents{
                private String vehicleType;
                private String city;
                private int totalAccidents;

                public RoadAccidents (String vehicleType, String city, int totalAccidents){
                    this.vehicleType = vehicleType;
                    this.city = city;
                    this.totalAccidents = totalAccidents;


                }

                public String getVehicleType() {
                    return vehicleType;
                }

                @Override
                public String getCity() {
                    return city;
                }

                public int getTotalAccidents() {
                    return totalAccidents;
                }
            }


    }
}