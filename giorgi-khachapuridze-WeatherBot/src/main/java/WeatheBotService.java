import java.util.ArrayList;
import java.util.List;

public class WeatheBotService {

    public static Object answer(String question) {
        String result;
        //  @TODO აქ ვერ ვხვდები ჩემი დაწერილი weather api (სხვა პროექტი) როგორ გამოვიყენო ??

        ￿￿DirectionType north = DirectionType.NORTH;
        DirectionType east = DirectionType.EAST;
        DirectionType west = DirectionType.WEST;
        switch (question) {
            case "all":
                List<Weather> weatherList= new ArrayList<>();
                weatherList.add(new Weather("Tbilisi",28,12,20, north,20));
                weatherList.add(new Weather("London",18,21,18,east,34));
                weatherList.add(new Weather("Gagra",29,12,20, west,20));
                weatherList.add(new Weather("Ochamchire",31,21,18,west,34));
                return weatherList;
                break;
            case "Tbilisi":
                result = "ქალაქის შესაბამისი დატა";
                return result;
                break;
            default:
                result = "უპსს";
                return result;
        }
        return null;
    }
}
