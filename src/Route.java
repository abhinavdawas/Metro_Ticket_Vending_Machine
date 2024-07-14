import java.util.List;

public class Route {

    private String name;
    private List<MetroStation> stations;

    public Route(String name, List<MetroStation> stations) {
        this.name = name;
        this.stations = stations;
    }

    public String getName() {
        return name;
    }

    public List<MetroStation> getStations() {
        return stations;
    }

    @Override
    public String toString() {
        return name + ": " + stations.toString();
    }
}
