# 🚀 Automação de Testes de API com Java e RestAssured

Este projeto foca na validação de serviços backend, garantindo que as regras de negócio e a integridade dos dados estejam corretas através de testes automatizados.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java 25 (Amazon Corretto)
- **Framework de Teste:** RestAssured (Automação de API)
- **Gerenciador de Dependências:** Maven
- **Runner & Asserções:** JUnit 5 e Hamcrest

## 🧪 Cenários de Teste Implementados
- **GET /usuarios:** Validação de listagem de usuários com sucesso.
- **Asserção de Contrato:** Verificação de Status Code 200 OK.
- **Validação de Dados:** Verificação de que a lista não está vazia e contém dados específicos.

## 📈 Diferenciais Técnicos
- Utilização de **Static Imports** para um código mais limpo (Fluent Interface).
- Implementação de **Hamcrest Matchers** para validações diretas no corpo do JSON.
- Gerenciamento de ciclo de vida de testes com JUnit 5.