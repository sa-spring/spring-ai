package com.example.demo_ai;

import org.springframework.ai.deepseek.DeepSeekChatModel;
import org.springframework.ai.deepseek.DeepSeekChatOptions;
import org.springframework.ai.deepseek.api.DeepSeekApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAiApplication.class, args);
	}

	// public DeepSeekChatModel deepSeekChatModel() {
	// 	var deepSeekApi = new DeepSeekApi(System.getenv("DEEPSEEK_API_KEY"));

	// 	var chatModel = new DeepSeekChatModel(deepSeekApi, DeepSeekChatOptions.builder()
	// 			.withModel(DeepSeekApi.ChatModel.DEEPSEEK_CHAT.getValue())
	// 			.withTemperature(0.4f)
	// 			.withMaxTokens(200)
	// 			.build());
	// }
}
