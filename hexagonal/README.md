# Hexagonal

Arquitetura Hexagonal está dividido em três camadas:

**1. DOMAIN:** é a parte mais interna da aplicação, onde se localiza as entidades de negócio e seus relacionamentos.
Nesta camada, encontramos os pacotes: model, entity, dto.  
**2. APPLICATION:** está localizado o caso de uso da aplicação, além de ser responsável por controlar todo o fluxo de
execução para atender aquelas funcionalidades. Além do service, possuem as portas (port) de entrada (in) e saída (out)
Subdivide-se em:  
2.1 PORT:  
**2.1.1 In:** Interface que **estabelece o contrato** das operações suportadas pela aplicação (pelo hexágono).      
**2.1.2 Out:** Interface que **define o contrato** para operações de saída da aplicação (do hexágono)  
2.2 SERVICE:   
**3. FRAMEWORK:** por fim, temos a terceira camada que possui as exceções, adaptadores de entrada e saída e helpers.  
3.1 HELPER:   
3.2 EXCEPTIONS:   
3.3 ADAPTER:  
**3.3.1 In:**    
**3.3.2 Out:**

- A implementação da _interface_ (application/port/in) serve para exposição em REST (framework/adapter/in/rest) e para
  _subscribe_ de tópicos (framework/adapter/in/topic)
- 

---

## Links de referência para criação deste modelo de arquitetura:

[Apache Kafka](https://kafka.apache.org/)        
[Apache Commons](https://commons.apache.org/)  
[DEVMEDIA: Diferença entre os patterns PO, POJO, BO, DTO e VO](https://www.devmedia.com.br/diferenca-entre-os-patterns-po-pojo-bo-dto-e-vo/28162)
[Hibernate: ORM Doc](https://hibernate.org/orm/documentation/5.4/)    
[MongoDB](https://www.mongodb.com/pt-br)   
[Oracle: Persistence JSP](https://www.oracle.com/java/technologies/persistence-jsp.html)    
[Spring Doc](https://docs.spring.io/spring-framework/docs/current/reference/html/)   
[Spring Data JPA](https://www.baeldung.com/spring-data-jpa-stored-procedures)   
[Spring Framework: javadoc](https://docs.spring.io/spring-framework/docs/current/javadoc-api/index-files/index-1.html)
