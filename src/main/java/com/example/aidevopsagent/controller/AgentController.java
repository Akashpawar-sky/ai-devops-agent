package com.example.aidevopsagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agent")
public class AgentController {

    @GetMapping("/ask")
    public String askAgent(@RequestParam String question) {
        return "Agent received your question: " + question;
    }
}
