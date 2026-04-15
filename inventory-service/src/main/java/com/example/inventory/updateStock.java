@KafkaListener(topics = "payment-topic", groupId = "inventory-group")
public void updateStock(String message) {
    System.out.println("Atualizando estoque: " + message);
}