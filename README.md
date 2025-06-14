# Clube da Navalha 💈

**Sistema de Agendamento e Gestão para Barbearias e Salões de Beleza**

---

## 📋 Descrição

O Clube da Navalha é um sistema desenvolvido como parte do projeto de curricularização da Fatec São José do Rio Preto. O objetivo é fornecer uma solução prática e moderna para agendamentos de serviços em barbearias, com funcionalidades voltadas tanto para clientes quanto para administradores e profissionais.

---

## 🎯 Funcionalidades

- ✅ Cadastro e login de clientes
- 🗓️ Agendamento e cancelamento de serviços
- 🧑‍💼 Associação de profissionais a serviços
- 📄 Geração de relatórios de atendimento
- 🔔 Envio de notificações de lembrete e cancelamento
- 👨‍🔧 Edição de atendimentos por administradores

---

## 🧩 Tecnologias Utilizadas

- **Back-end:** Java
- **Banco de Dados:** MySQL 8.0
- **Front-end:** HTML, CSS, JavaScript
- **ORM (se aplicável):** JDBC ou JPA
- **Controle de Versão:** Git / GitHub

---

## 🧠 Arquitetura

O sistema segue uma arquitetura em camadas:

- **Model:** Entidades e regras de negócio
- **Controller:** Manipulação de requisições
- **View:** Interface gráfica responsiva
- **DAO:** Acesso e persistência dos dados

---

## 🗃️ Estrutura do Banco de Dados

Inclui as tabelas:

- Cliente
- Profissional
- Serviço
- Agendamento
- Administrador
- Notificação
- Relatório
- Profissional_Serviço
- Recebe_Profissional_Cliente_Notificacao

> Script SQL completo disponível na pasta `/database/`

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/clube-da-navalha.git
