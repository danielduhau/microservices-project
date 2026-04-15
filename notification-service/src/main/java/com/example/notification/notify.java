@KafkaListener(topics = "payment-topic", groupId = "notification-group")
public void notify(String message) {
    System.out.println("Enviando notificação: " + message);
}