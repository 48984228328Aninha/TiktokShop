<div align="center">

<h1 align="center">
  <img src="https://img.icons8.com/fluency/48/tiktok.png" width="50" />
  TikTok Affiliates Automation - TokuSaaS
</h1>

* Sistema de automacao de marketing de afiliados do TikTok Shop
* Backend em Java utilizando arquitetura DDD e Spring Boot
* Gerenciamento de sessao web seguro atraves de injeção de cookies
* Micro-worker em Python para execucao de tarefas automatizadas em segundo plano

---

<h1 align="center">
  <img src="https://img.icons8.com/fluency/48/document.png" width="50"/>
  Documentacao de Arquitetura
</h1>

O projeto adota uma abordagem tática do Domain-Driven Design (DDD) dividida por contexto delimitado, garantindo o isolamento completo da camada de domínio contra acoplamentos com o framework Spring Boot ou o interpretador Python.

</div>

---

<h1 align="center">
  <img src="https://img.icons8.com/fluency/48/layers.png" width="30"/> Estrutura do Projeto e Classes
</h1>

| Camada | Pacote / Subpasta | Classe / Arquivo | Funcao Principal |
| :--- | :--- | :--- | :--- |
| Application | `services` | `NotificationService.java` | Gerencia a logica de roteamento de alertas no ecossistema da aplicacao. |
| Application | `usecase` | `ExecutePendingPostUseCase.java` | Orquestra a busca e execucao de postagens agendadas que estao no prazo. |
| Application | `usecase` | `GetDashboardDataUseCase.java` | Consolida metricas de vendas e posts para exibicao na tela principal. |
| Application | `usecase` | `SchedulePostUseCase.java` | Processa a regra de criacao e validacao de um novo agendamento de video. |
| Application | `usecase` | `SyncSalesUsecase.java` | Sincroniza os dados de vendas capturados com o estado interno do sistema. |
| Domain | `entities` | `SaleNotification.java` | Objeto de dominio que representa o alerta de uma venda realizada. |
| Domain | `entities` | `ScheduledPost.java` | Entidade pura com as regras de negocio e dados do post agendado. |
| Domain | `entities` | `TiktokAccount.java` | Entidade que representa a conta do TikTok e armazena os cookies de sessao. |
| Domain | `entities` | `User.java` | Entidade pura que representa o usuario da plataforma e seu plano de acesso. |
| Infrastructure | `adapter` | `TiktokAutomator.java` | Adaptador que faz a interface de chamada ao script Python de postagem. |
| Infrastructure | `adapter` | `TiktokSalesScraper.java` | Adaptador responsavel pela raspagem ou captura de dados do TikTok Shop. |
| Infrastructure | `adapter` | `WebSocketNotificationAdapter.java` | Envia as notificacoes em tempo real para o front-end via WebSockets. |
| Infrastructure | `config` | `PythonScriptConfig.java` | Parametrizacao dos caminhos e ambientes de execucao do Python. |
| Infrastructure | `config` | `SchedulingConfig.java` | Configuracao das tarefas agendadas nativas do Spring (@Scheduled). |
| Infrastructure | `config` | `SecurityConfig.java` | Configuracoes de seguranca, controle de rotas e hash de senhas. |
| Infrastructure | `persistence` | `SchedulePostEntity.java` | Modelo de dados anotado com JPA para persistência da tabela de posts. |
| Infrastructure | `persistence` | `TiktokAccountEntity.java` | Modelo de dados anotado com JPA para persistência da tabela de contas. |

---

<h1 align="center">
  <img src="https://img.icons8.com/fluency/48/services.png" width="30"/> Features / Funcionalidades
</h1>

* **Sessao via Cookies**: autenticacao web contornando as burocracias e bloqueios da API oficial do TikTok
* **Agendamento de Posts**: programacao de data e horario para publicacao automatica de conteudos
* **Worker Python Integrado**: script em segundo plano utilizando automacao camuflada para upload de videos
* **Raspagem de Vendas**: monitoramento em tempo real de comissoes e vendas no TikTok Shop
* **Notificacoes WebSocket**: atualizacao instantanea no painel do usuario assim que uma venda e computada
* **Painel de Metricas**: dashboard consolidado com taxas de sucesso de postagens e faturamento
* **Ambiente Isolado**: containerizacao do banco de dados e suporte ao desenvolvimento local simplificado

---

<h1 align="center">
  <img src="https://img.icons8.com/fluency/48/code.png" width="30"/> Tech Stack / Tecnologias
</h1>

<p align="center">
  <img src="https://go-skill-icons.vercel.app/api/icons?i=java,spring,postgres,docker,python&size=64" />
</p>

---

* Java 21 (LTS)
* Spring Boot 3.x
* Python 3.x (Playwright / Stealth automation)
* Spring Data JPA / Hibernate
* PostgreSQL 16
* Spring WebSocket
* Spring Security (Autenticacao estatal via Stateful Tokens)
* Docker & Docker Compose Support

---

---

<h1 align="center">
  <img src="https://img.icons8.com/fluency/48/flowchart.png" width="30"/> System Flow / Fluxo do Sistema
</h1>



```text
Usuario faz login no SaaS
        ↓
Insere cookies validos do TikTok
        ↓
Agenda um video com link de afiliado
        ↓
Spring Boot valida e armazena os dados
        ↓
Tarefa agendada dispara no horario correto
        ↓
Java invoca Worker Python via terminal
        ↓
Python injeta cookies, abre navegador e posta
        ↓
Scraper detecta vendas e notifica via WebSocket
```



</div>

---

<h1 align="center">
  <img src="https://img.icons8.com/fluency/48/checked.png" width="30"/> Roadmap
</h1>

###  Concluido

#### Issue #001 - Estrutura Base e Contexto de Dominio
* [x] Configuracao do projeto Spring Boot com dependencias principais
* [x] Criacao da estrutura de pacotes orientada a DDD
* [x] Implementacao das entidades puras de Dominio: User, ScheduledPost, TiktokAccount, SaleNotification
* [x] Isolamento do dominio contra anotacoes do framework Java

#### Issue #002 - Infraestrutura e Persistencia Local
* [x] Configuracao do Docker Compose integrado para PostgreSQL 16
* [x] Criacao dos modelos de persistência mapeados: SchedulePostEntity, TiktokAccountEntity
* [x] Configuracao da camada de adaptadores de persistência

#### Issue #003 - Configuracoes Globais de Infraestrutura
* [x] Implementacao da classe SecurityConfig para protecao de endpoints
* [x] Criacao do SchedulingConfig para gerenciamento de cronjobs do Spring
* [x] Implementacao da classe PythonScriptConfig para setup do ambiente hibrido

###  Em Progresso

#### Issue #004 - Camada de Aplicacao e Casos de Uso
* [ ] Conclusao da logica interna de SchedulePostUseCase
* [ ] Implementacao do loop de varredura em ExecutePendingPostUseCase
* [ ] Ajustes no servico de notificacoes internas da aplicacao

###  Planejado

#### Issue #005 - Desenvolvimento do Worker Python
* [ ] Criacao do script python estruturado para manipulacao do navegador
* [ ] Integracao de bibliotecas anti-bot na automacao web
* [ ] Conexao da classe TiktokAutomator com a execucao em subprocesso do terminal

#### Issue #006 - WebSocket e Painel de Vendas
* [ ] Desenvolvimento final do receptor em TiktokSalesScraper
* [ ] Conexao do WebSocketNotificationAdapter com eventos da tela
* [ ] Construcao das rotas HTTP finais para alimentacao do painel do Dashboard

---
