package dio.budgeting;

import com.google.genai.Client;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.google.genai.GoogleGenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.ai.google.genai.GoogleGenAiChatOptions;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnabledIfEnvironmentVariable(named = "OPENAI_API-KEY", matches = ".*")
public class OpenAiChatModelIT {

    @Autowired
    Client client;

    @Test
    void should_receiveResponse_when_chatModelIsCalled(){

        var options = GoogleGenAiChatOptions.builder()
                .model("gemini-3.8-flash")
                .temperature(0.8)
                .build();

        var chatModel = GoogleGenAiChatModel.builder()
                .genAiClient(client)
                .options(options)
                .build();

        var response = chatModel.call("Gere um registro de budgeting, com descrição de gasto, valor em reais e local");

        assertThat(response).isEmpty();
        System.out.println(response);

    }
}
