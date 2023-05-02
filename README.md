# Movie Review System

> It's a web based **Movie Review Application** where users will be able to write reviews on movies.

## Project Report

- [Final Report](./docs/)

## Design Diagrams
-Use Case Diagram 
![image](https://user-images.githubusercontent.com/73294651/235697127-7600b53a-0363-409e-bfb0-fac1c897c9dc.png)

- Activity diagram

  ![activity diagram](./docs/activity-diagram.png)
  
- State diagram

  ![state diagram](./docs/State_Diagram.png)
  
 -Class diagram
   ![class diagram](./docs/class-diagram.png)
 

## Contributors

- Kushagra Singh - **PES1UG20CS657**
- Nikhil Raju Mohite - **PES1UG20CS667**
- Pavan Kumar Nuthi - **PES1UG20CS670**
- Pranav R - **PES1UG20CS673**

## Dependency

– If you want to use PostgreSQL:

```xml
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
```

- For Thymeleaf template engine

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

## Configure Spring Datasource, JPA, App properties

Open `src/main/resources/application.properties`

- For PostgreSQL:

```
spring.datasource.url= jdbc:postgresql://localhost:5432/dsi
spring.datasource.username= postgres
spring.datasource.password= root

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect
```

# Hibernate ddl auto (create, create-drop, validate, update)

```
spring.jpa.hibernate.ddl-auto= update
```

## Run Spring Boot application

```
mvn spring-boot:run
```

## Follow the below steps

```
1. First install postgresql
2. Postgesql  default usename is : postgres
3. Postgresql database password should be : root
4. Need to create a database named `dsi`
5. Run the code, that will create all tables in `dsi` database.
6. Then signin as an admin using username `admin` and password `admin` similarly for `user`, `editor` and `creator`
```
