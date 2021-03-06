# Spring4JSE8
Spring is a Java based open source, light weight , loosely coupled , aspect oriented and dependency injection based application.
- [x] Maven , Gradle.
- [x] Spring Boot v 2.0.1
- [x] Spring Data JPA.
- [x] Spring Core
- [x] Spring Annotations
- [x] Spring Java Configuration
- [x] Spring AOP
- [x] Spring MVC
- [x] Hibernate CRUD
- [x] Spring Security
- [x] Cloud Foundry Configuration and deploy with spring Boot.
- [ ] Actuator
<<<<<<< HEAD
- [ ] Spring Swagger.

=======
- [x] Spring Swagger.
>>>>>>> 1984aa1ebc9fdc2ff1ab4f80484f535386295649
 


# Concepts

- ### Spring Modules
	1) Spring Core
	2) Spring Context
	3) Spring AOP
	4) Spring DAO
	5) Spring Web MVC
	6) Spring ORM.
	
- ### Spring Boot
    1) Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.
    2) Spring Boot can be created with Spring Initializr(start.spring.io), Spring Boot CLI , STE IDE(Starter Project) with the required configuration.
	3) Setups the default Configuration , starts Spring Application Context , Perform class path scan , Starts Tomcat Server.
	4) Whenever an Object is returned from the REST Controller in the form of an array , Spring boot will return the list in an JSON Format.
	5) Bill of Materials - List of dependencies that spring boot will download and add in the class path based on version specified in pom.
	6) Embedded Tomcat Server - Convenience , Servlet Container config is now app config , Standalone Application , best for microservice architecture.
    7) Application.port complete list of properties -> https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
    8) spring-boot-devtools will enable auto update the cache. thymeleaf will check for html resources under templates , but for jsp we need to provide the parser and source for the jsps.

- ### Spring Data JPA
	1) ORM is the approach of taking object oriented data and mapping to a relational datastore (e.g. a RDBMS)
    2) Hibernate is an implementation of an ORM framework
	3) JPA is the EE standard specification for ORM in Java EE. Hibernate is also an implementation of this specification, in that you can use the standard JPA APIs and configure your application to use Hibernate as the provider of the spec under the covers.
	
- ### Spring Core
       	Build a complete Spring MVC and Hibernate CRUD Project ... all from scratch
        Set up your Spring and Hibernate development environment with Tomcat and Eclipse
        Wire beans together in the Spring container using Inversion of Control
        Configure the Spring container for Dependency Injection
        Define Spring Beans using the @Component annotation
        Perform auto-scanning of Spring beans to minimize configuration
        Automatically wire beans together using @Autowired annotation
        Apply all Java configuration to Spring Beans (no xml)
- ### Spring MVC
        Set up your Spring MVC environment with configs and directories
        Create controllers using @Controller annotation
        Read HTML form data using @RequestParam
        Leverage Spring MVC model to transport data between controller and view page
        Define Request Mappings for GET and POST requests
        Minimize coding with Spring MVC Form data binding
        Apply Spring MVC form validation on user input
        Create custom Spring MVC form validation rules
- ### Hibernate
        Perform object/relational mapping with Hibernate
        Leverage the Hibernate API to develop CRUD apps
        Develop queries using the Hibernate Query Language (HQL)
        Integrate Spring MVC and Hibernate together in a Single Application Project
        Apply advanced Hibernate mappings: one-to-one, one-to-many and many-to-many
- ### Spring AOP
        Apply Aspect-Oriented-Programming AOP for cross-cutting concerns
        Examine AOP use-cases and how AOP can resolve code-tangling
        Create AOP pointcut expressions to match on method invocations
        Leverage AOP annotations: @Before, @After, @AfterReturning, @AfterThrowing, @Around
        Create a real-time application using AOP and Spring MVC together in a single project
- ### Spring Security
        Secure your web application with Spring Security
        Set up your Maven pom.xml file with compatible Spring Security dependencies
        Configure Spring Security with all Java configuration (no xml)
        Create custom Spring Security login pages with Bootstrap CSS
        Add logout support using default features of Spring Security
        Leverage Spring Security support for Cross Site Request Forgery (CSRF)
        Define users and roles for authentication
        Display user login info and role using Spring Security tags
        Restrict access to URLs based on user role
        Hide and Display content based on user role
        Add JDBC authentication, store user accounts and passwords in the database
        Store encrypted passwords in the database using bcrypt
        Register new users and encrypt passwords using Java code.
- ### Maven
        Simplify your build process with Maven
        Create Maven POM files and add dependencies
        Search Central Maven repository for Dependency Coordinates
        Run Maven builds from the Eclipse IDE.
        Actuator will help explain about the health of db.
       
        mvn spring-boot:run --debug
        mvn clean install
        java -jar Spring4JSE8.jar
- ### Access In Memory Db

	http://localhost:8080/h2-console/
	Specify the Driver Class Name - org.h2.Driver
	JDBC URL  - jdbc:h2:mem:testdb
	User Name - sa
	password  - <blank>
	
	
- ### Deployment steps for Cloud Foundry

https://console.run.pivotal.io/

	cf login -a api.run.pivotal.io - to Login to Cloud Foundry Console.
	cf push (OR)
	cf push Spring4JSE8 -p target/Spring4JSE8-2.0.1-SNAPSHOT.war - Deploy the jar into Cloud Foundry.
    cf logs Spring4JSE8 --recent
    In case you need to change the buildpacks. Use -b https://github.com/cloudfoundry/java-buildpack.git#v3.7

java -jar target/Spring4JSE8-2.0.1-SNAPSHOT.war -s http://localhost:9080 declarative-linter < Jenkinsfile

- ### Spring Boot with Swagger
http://localhost:8080/Spring4JSE8/swagger-ui.html#/

- ### Spring Boot with Actuator 
Health Check - http://localhost:8080/Spring4JSE8/actuator/health
        
        
        
