<div align="center">

# 🤖 DevPilot

**Chat with your GitHub codebase using AI-powered RAG (Retrieval-Augmented Generation)**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Next.js](https://img.shields.io/badge/Next.js-000000?style=flat-square&logo=nextdotjs&logoColor=white)](https://nextjs.org/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![OpenAI](https://img.shields.io/badge/OpenAI-412991?style=flat-square&logo=openai&logoColor=white)](https://openai.com/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white)](https://www.docker.com/)

</div>

---

## 📖 Overview

**DevPilot** is a full-stack AI-powered application that lets users sync their GitHub
repositories and interact with their codebase through natural language chat. Using
Retrieval-Augmented Generation (RAG), DevPilot indexes repository code into a vector
database, retrieves relevant context for any question asked, and generates accurate,
citation-backed answers — turning a static codebase into something you can actually talk to.

---

## ✨ Features

- 🔐 **GitHub OAuth 2.0 Authentication** — secure sign-in with token handling and persisted user profiles
- 📂 **Repository Sync** — fetches and processes a user's GitHub repositories for indexing
- 🧩 **RAG Indexing Pipeline** — code chunking → embedding generation (OpenAI) → vector storage (PGVector)
- 💬 **AI Chat Interface** — ask questions about your codebase and get context-aware answers
- ⚡ **Real-Time Streaming** — responses stream token-by-token via Server-Sent Events (SSE)
- 📝 **Markdown Rendering & Citations** — answers are formatted cleanly with source citations back to the actual code

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| **Backend** | Java, Spring Boot, Maven |
| **Frontend** | Next.js, TypeScript, Tailwind CSS |
| **Database** | PostgreSQL with PGVector (vector storage) |
| **Authentication** | GitHub OAuth 2.0 |
| **AI Integration** | OpenAI API (embeddings + chat generation), Spring AI |
| **ORM** | JPA / Hibernate |
| **Real-Time** | Server-Sent Events (SSE) |
| **Infrastructure** | Docker |

---

## 🔄 How It Works

1. **Authentication** — User signs in via GitHub OAuth. The backend securely handles tokens and persists user data (IDs, scopes, profile info) in PostgreSQL.
2. **Repository Sync** — Once authenticated, the app fetches the user's GitHub repositories and processes their structure to prepare files for indexing.
3. **Indexing Pipeline (RAG)** — The backend chunks source files, converts them into embeddings via OpenAI, and stores them in PGVector.
4. **Chat Interface** — When a user asks a question, the app retrieves the most relevant code chunks from the vector store and generates a response via OpenAI — streamed live to the UI with Markdown rendering and citations.

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Node.js 18+
- Docker & Docker Compose
- OpenAI API key
- GitHub OAuth App credentials

### Backend Setup
```bash
cd DevPilot
./mvnw clean install
./mvnw spring-boot:run
```

### Frontend Setup
```bash
cd client
npm install
npm run dev
```

### Database (via Docker)
```bash
docker-compose up -d
```

### Environment Variables
Create a `.env` file (or set these as environment variables) before running the backend:

| Variable | Description |
|---|---|
| `DB_URL` | PostgreSQL connection URL (defaults to local Docker setup) |
| `DB_USERNAME` | Database username |
| `DB_PASSWORD` | Database password |
| `OPEN_API-KEY` | Your OpenAI API key |

> ⚠️ Add your GitHub OAuth and OpenAI API credentials to `application.properties` / `.env` before running. Never commit real credentials — only environment variable references should appear in tracked files.

---

## 📬 Contact

Built by **Divya Patil**
[GitHub](https://github.com/DivyaPatil2004) · [LinkedIn](https://www.linkedin.com/in/divyapatil39) · divyapatil.rc@gmail.com
