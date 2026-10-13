### Projeto budgeting
Api java com SpringBoot que realiza conversa com I.A GenAI (Google-Gemini) 
para obter informações de finanças e gastos pessoais,
A mesma opera com envio de áudios 
e retorno em áudio( Chat, áudio e transcription);
Também realiza cadastro em banco dados relacional mySql 
em container no Docker.

org.springframework.boot: version 4.1.1 
Java Gradle: java na versão 17

### 🔨 DEPENDENCIAS:

spring-boot-starter
spring-boot-starter-test
junit-platform-launcher
spring-ai-bom:2.0.0-M4 (versão : "2.0.1")
spring-ai-starter-model-google-genai
spring-boot-starter-web
spring-boot-starter-data-jpa
pring-boot-starter-data-jpa-test
spring-boot-docker-compose
mysql-connector-j
lombok

### 🔨 passo a passo do projeto

- Gerar uma chave api no google genai
- inserir a chave na variável ${GENAI_API_KEY} no application.properties 
	spring.ai.google.genai.api-key=${GENAI_API_KEY}

- Subir a aplicação java Springboot - http://localhost:8080/ - starter no Application (spring boot dashboard)

###
