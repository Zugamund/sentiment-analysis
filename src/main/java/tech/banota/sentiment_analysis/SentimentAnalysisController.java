package tech.banota.sentiment_analysis;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "sentiment-analysis", produces = MediaType.APPLICATION_JSON_VALUE)
public class SentimentAnalysisController {

    @GetMapping
    public List<SentimentAnalysis> search() {
        return List.of(
                new SentimentAnalysis(1, "Déploiement via GitHub Actions ✅", 1),
                new SentimentAnalysis(2, "Mise à jour du controller OK 🚀", 1)
        );
    }

    @GetMapping("/ping")
    public Map<String, Object> ping() {
        return Map.of(
                "app", "sentiment-analysis",
                "status", "up",
                "time", Instant.now().toString()
        );
    }
}
