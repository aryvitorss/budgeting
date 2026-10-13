package dio.budgeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Files;

import org.springframework.ai.audio.tts.TextToSpeechModel;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnabledIfEnvironmentVariable(named = "OPENAI_API-KEY", matches = ".*")
public class OpenAiSpeechModelIT {

    @Autowired
    TextToSpeechModel textToSpeechModel;

    @Test
    void should_produceAudio_when_textIsProvided() throws IOException {

        var response = textToSpeechModel.call("O valor total do serviço ficou em 80 reais. Posso confirmar o pagamento?");

        assertThat(response).hasSizeGreaterThan(1024);
        var tempFile = Files.createTempFile("AUDIO",".mp3");
        Files.write(tempFile, response);
        System.out.println(tempFile.toAbsolutePath());
    }

}
