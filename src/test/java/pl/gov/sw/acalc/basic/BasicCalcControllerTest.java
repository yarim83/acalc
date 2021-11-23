package pl.gov.sw.acalc.basic;

import org.json.JSONArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class BasicCalcControllerTest {

    private WebTestClient client;

    @BeforeEach
    void setUp() {
        var controller = new BasicCalcController(new BasicCalcServiceImpl());
        client = WebTestClient.bindToController(controller).build();
    }

    @Test
    @DisplayName("POST /api/v1/add")
    void shouldSumTwoAddends() {
        client
          .post()
          .uri("/api/v1/add")
          .bodyValue(new Operation(2, 5))
          .exchange()
          .expectStatus().isOk()
          .expectBody()
          .json("{\"value\": 7}");
    }
}
