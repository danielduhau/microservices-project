import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;  

@Component
@RequiredArgsConstructor
public class PaymentConsumer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void process(String message) {

        System.out.println("Pagamento recebendo: " + message);

        // Simula aprovação
        kafkaTemplate.send("payment-topic", "PAYMENT_APPROVED");
    }
}