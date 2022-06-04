import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendMessage", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다");
                    break;
                case "sendMessage":
                    System.out.println(message.to + "님에게 SMS을 보냅니다");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다");
                    break;


            }
        }
    }
}
