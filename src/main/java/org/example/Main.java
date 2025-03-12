package org.example;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class Main {
    public static void main(String[] args) {

        var user = "Gere 5 produtos";
        var system = "Voce é um gerador de produtos de caminhão para a empresa mercedes";

        //utilizando a API
        var service = new OpenAiService("your_token");
        var completionRequest = ChatCompletionRequest.builder()
                .model("gpt-4")
                .build();
        service.createChatCompletion(completionRequest).getChoices().forEach(System.out::println);
    }
}