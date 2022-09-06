# Spring-Java-Employee-Payroll
Using Spring Boot<br>
:sunflower: Visit https://start.spring.io/ :sunflower: for dependencies<br>
- Web<br>
- JPA<br>
- H2<br>

# Running

## Spring Initializr uses maven wrapper, type:

$ ./mvnw clean spring-boot:run

## Alternatively using your installed maven version type:

$ mvn clean spring-boot:run

## When the app starts, we can immediately interrogate it.

$ curl -v localhost:8080/employees

## When creating and storing a new Employee

$ curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Ben Smith", "role": "Chef"}'
