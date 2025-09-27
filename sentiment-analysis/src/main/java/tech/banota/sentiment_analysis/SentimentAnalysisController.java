package tech.banota.sentiment_analysis;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "sentiment-analysis", produces = MediaType.APPLICATION_JSON_VALUE)
public class SentimentAnalysisController {
    @GetMapping
    public List<Object> search(){
        return List.of(new SentimentAnalysis(1, "Belle formation", 1));
    }
}
