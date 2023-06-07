- Arquitetura Monolito
- Exemplo de pacotes, classes, enums etc.
- Exemplo de requests, para Actuator, Controller, Swagger OpenAPI (/resourcers/static/request)
- Exemplo de script SQL (resources/static/db)
- Exemplo de documentação Swagger (resources/static/documents)
- Exemplo de configuração do application (resources/application.yaml)
- Esta estrutura, busquei em alguns projetos que utilizam Spring REST, dependendo do projeto/empresa está estrutura de
  pacotes pode ser feita de forma diferente.
- Pacote "common" são classes de configuração, normalmente aquelas que são aplicadas a todo projeto
- Neste exemplo observa que temos pacote "model" dentro de "api" e uma "entity" no "domain", pode ser flexibilizado e
  feito de maneira que melhor atenda seu projeto.
- O mesmo ocorre com as exceptions, pode ser criado um pacote de exceptions para antender toda aplicação.

---

Observações:

- Regra de negócios.
- Separação de funcionalidades e responsabilidade em classes.
- Código limpo, legível e de fácil manutenção.