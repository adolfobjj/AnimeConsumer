package br.com.anime.consumer.application.listener;

import br.com.anime.consumer.application.listener.constantes.RabbitmqConstantes;
import br.com.anime.consumer.domain.domain.Anime;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static br.com.anime.consumer.application.listener.constantes.RabbitmqConstantes.FILA_ANIME;

@Component
@AllArgsConstructor
@Slf4j
public class EventListener {

    public static final String ANIME = "anime.save";


    @RabbitListener(queues = FILA_ANIME)
//    @RabbitListener(queues = EX_REGISTER_ANIME )

    public void listenerTest(@Payload String message) {
        try {

        } catch (Throwable e) {
            log.error("Deu erro", e);
        }

    }
}
//@Component
//public class EventListener {
//
//    @RabbitListener(queues = RabbitmqConstantes.FILA_ANIME)
//
//    private void consumidor (String mensagem) throws JsonProcessingException, InterruptedException {
//        Anime anime = new ObjectMapper().readValue(mensagem, Anime.class);
//
//        System.out.println(anime.getId());
//
//        System.out.println("------------------------------------");
//
//        throw new IllegalArgumentException("Argumento inválido!");
//    }
//}
