# AI DevOps Agent

A starter Java/Spring Boot project that will be expanded into an AI agent and used to learn CI/CD step by step.

## Current functionality

The application exposes a placeholder REST endpoint. It does **not** call an AI/LLM yet.

- `GET /api/agent/ask?question=hello` — returns the question received by the agent API.
- Java 17
- Spring Boot 3.3.5
- Maven

## Run in Eclipse

1. Clone or download this repository.
2. In Eclipse, select **File → Import → Maven → Existing Maven Projects**.
3. Select the project folder containing `pom.xml` and finish the import.
4. Ensure Eclipse is configured to use JDK 17.
5. Right-click `AiDevopsAgentApplication.java` → **Run As → Java Application** (or **Spring Boot App**, if available).

Test in a browser:

```text
http://localhost:8080/api/agent/ask?question=Why%20did%20my%20pipeline%20fail
```

Expected response:

```text
Agent received your question: Why did my pipeline fail
```

## Run with Maven

With Java 17 and Maven installed:

```bash
mvn clean test
mvn spring-boot:run
```

## Learning roadmap

1. Add a real LLM integration.
2. Add automated tests.
3. Add a GitHub Actions CI workflow.
4. Build and run with Docker.
5. Add Docker Compose and local CD.

No API keys or paid cloud services are required for the current starter.
