public class Route {
    String startPoint;
    String endPoint;
    String timeInWay;
    String transportType;
    double cost;
    String startTime;
    String endTime;

    public Route(String startPoint, String endPoint, String timeInWay, String transportType, double cost, String startTime, String endTime) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.timeInWay = timeInWay;
        this.transportType = transportType;
        this.cost = cost;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static Route[] getAll() {
        Route[] routes = {new Route("Москва", "Казань", "8 часов 33 минуты", "Автомобиль", 6000.0, "12:00", "20:30"), new Route("Казань", "Самара", "5 часов 22 минуты", "Автомобиль", 5200.0, "14:15", "20:37 по местному времени"), new Route("Санкт-Петербург", "Владимир", "9 часов", "Автомобиль", 7446.0, "10:10", "19:10"), new Route("Москва", "Казань", "16 часов 21 минута", "Автобус", 4790.0, "7:20", "23:41"), new Route("Казань", "Самара", "8 часов 46 минут", "Автобус", 3650.0, "13:05", "22:51 по местному времени"), new Route("Санкт-Петербург", "Владимир", "15 часов 35 минут", "Автобус", 2590.0, "10:00", "01:35"), new Route("Москва", "Казань", "13 часов 1 минута", "Поезд", 1920.0, "00:26", "13:27"), new Route("Санкт-Петербург", "Владимир", "11 часов 18 минут", "Поезд", 2060.0, "13:10", "00:28"), new Route("Москва", "Казань", "1 час 40 минут", "Самолёт", 2156.0, "07:40", "09:20"), new Route("Казань", "Самара", "1 час", "Самолёт", 3590.0, "06:20", "08:20 по местному времени")};
        return routes;
    }

    public static void Marshroute(String outCity, String toCity) {
        boolean find = false;
        for (Route x : Route.getAll()) {
            if (x.startPoint.equals(outCity) && x.endPoint.equals(toCity)) {
                find = true;
                System.out.println("Пункт отправления: " + x.startPoint + "\nПункт назначения: " + x.endPoint + "\nВремя в пути: " + x.timeInWay + "\nВид транспорта: " + x.transportType + "\nВремя отправления: " + x.startTime + "\nВремя прибытия: " + x.endTime + "\n");
            }
        }
        if (!find) {
            System.out.println("Упс, похоже не нашлось ничего подходящего");
        }
    }
}
