# workshop-spring-boot

![GitHub](https://img.shields.io/github/license/leolimaf/workshop-spring-boot?style=flat-square)
![GitHub](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=spring&logoColor=white)
![GitHub](https://img.shields.io/badge/PostgreSQL-316192?style=flat-square&logo=postgresql&logoColor=white)
![GitHub](https://img.shields.io/badge/Heroku-430098?style=flat-square&logo=heroku&logoColor=white) 



# :book: About

Backend implementation of an e-commerce domain model, structured in the logical layers of resources, services, and repositories. This project was performed during a [complete course of Java](https://www.udemy.com/course/java-curso-completo) from Udemy and deployed to Heroku.



![workshop-spring-boot](https://github.com/leolimaf/workshop-spring-boot/blob/main/domain-model.PNG?raw=true)

# :rocket: Technologies

- Java
- Spring Boot
- H2 Database
- PostgreSQL
- Heroku



# :hammer: Testing the Application

1. Clone the repository and open it with your favorite IDE
2. Change the value of the file **application.properties** from `spring.profiles.active=dev` to `spring.profiles.active=test`
3. Run the Spring Boot Application and open [Postman](https://www.postman.com) (or another tool of your preference) to send the http requests
4. Now you can test my application sending requests to the localhost, for example, http://localhost:8080/orders with method GET to obtain all the orders from the database of tests. The package **dev.leolimaf.workshopspringboot.resources** contains the controllers with all the possibilities of requests.
5. If any error occurs, reload the **pom.xml** with Maven to download all the dependencies properly
6. Feel free to edit my code :smile:



[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/leolimaf)
[![GitHub](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/leonardolimaf)



