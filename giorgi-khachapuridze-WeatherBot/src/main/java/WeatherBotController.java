import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/api/weather")
public class WeatherBotController {
    //  @TODO აქ ვერ ვხვდები ჩემი დაწერილი weather api (სხვა პროექტი) როგორ გამოვიყენო ??

    @OnOpen
    public void handleOpen() {
        System.out.println("Connected ...");
    }

    @OnMessage
    public String handleMessage(String message) {
        System.out.println("MSG From Client : " + message);
        String replayMessage = (String) WeatheBotService.answer(message);
        System.out.println("MSG From Server : " + replayMessage);
        return replayMessage;
    }

    @OnClose
    public void handleClose() {
        System.out.println("End Connection ...");
    }

    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }

}