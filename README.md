# LearnSpring

## Fundamentals

| Fundamental  | Problem  |  Solution |
|---|---|---|
| JEE  |  Testability  | Configuration  |
| POJO Based  | Maintainability  |  Focus |
| Unobtrusive   | Scalability  | Testing  |
| AOP/Proxies    | Complexity  | Annotation or XML Based  |
| Best Practices   | Business Focus  |   |

## Project setup

Use Maven, Java 8, Spring 4, Intellij. Use maven dependency to download spring.

## Spring XML configuration

Setter Injection. Constructor Injection (Index based) or autowired in applicationContext.xml. Need to input each bean manually.

## Spring annotation configuration using XML

Use annotations @Repository, @Service, @Component, @Autowired. Use below in applicationContext.xml to scan package.

```xml
<context:annotation-config />

<context:component-scan base-package="com.practice.spring"/>
```

Field, Setter or Constructor Injection.

## Spring configuration using java.

Add ```AppConfig.java``` Class and use @Configuration the class level annotation, @Bean the method level annotation.

If we want to use ```@Autowired``` annotation configuration, add ```@ComponentScan({"com.practice"})``` in ```AppConfig.java```.