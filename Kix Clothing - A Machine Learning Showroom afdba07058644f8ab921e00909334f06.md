# Kix Clothing - A Machine Learning Showroom

![Google Cloud](doc-images/highlights/Untitled.png)

> Kix Clothing is born as a clear idea, a platform where users can easily access their favorite clothes and easily search using images to find those clothes that they may like or that are similar to those they already have.

![Web](doc-images/highlights/Untitled%201.png)

# Presentation

This project makes use of the **Machine Learning** model provided by Google called **Vision Cloud**. This API, analyzes in real time images previously indexed in the database to find products that are either similar or identical.

I had always wanted to learn how to use the **Google Cloud Platform** and go deeper into the world of Machine Learning, and this job has been the perfect opportunity to be able to learn both at the same time.

The api consists of two parts that must be put together, the **Vision Cloud API** itself and a **Google Storage Bucket** where we must place the images to be able to index them and for the system to be able to recognize them.

# Highlights
![Indexing](doc-images/highlights/product-indexing.gif)
![Login](doc-images/highlights/Login.gif)
![Image Search](doc-images/highlights/image-search.gif)
![Favorites](doc-images/highlights/favorites.gif)

# Technologies

A lo largo del proyecto se han utilizado varias tecnologías de entre las cuales me gustaría destacar:

- Java Spring Boot para la parte de Back-End
- Netflix OSS Feign and Eureka para la conexión de los microservicios.
- Cloud Vision API de Google como motor de búsqueda
- Google Storage para el almacenamiento de imágenes datos
- MongoDB para el almacenamiento de los productos
- Angular y TypeScript para la parte del Front-End

## Microservices

In total, 5 microservices have been implemented for this project.

- Product microservices: It is the one in charge of managing the products we have, and it is one of the main microservices of the application.
- Image Microservice: It provides the necessary infrastructure to upload the images to the Google Storage platform, it also manages the links, their ids and it is the one that provides the resources to the product microservice.
- Search engine microservice: This is the system in charge of performing searches on the Cloud Vision platform. It is the microservice that has implemented the logic used in the search for products with images. In the future I would like to improve it and include a semantic search engine.
- User microservices: It manages all users, it is also in charge of saving wish lists and providing user authentication
- Edge Microservice: The director of this entire orchestra, handles all requests and make the page work properly. I would like to be able to implement Hystrix and Ribbon in the future to make it fault and crash-tolerant.

# How to use this application

To use this application you need a passport.json file provided by Google with the keys needed to access the service, these keys are included in the search engine microservice in the root folder, you just have to create an environment variable called GOOGLE_APPLICATION_CREDENTIALS

```java
export GOOGLE_APPLICATION_CREDENTIALS="/path/to/passport.json"
```

This application requires pre-loaded data, since the google learning model has them learned so it is very likely that the application will fail if the data is not entered correctly from the beginning.
In the corresponding microservices, there is a file **data.sql** or **data.json** that you should use to preload this data in your local computer

# Postman API


# Future implementations

In the future I would like to implement a payment system, a normal text search engine, categories on the web to be able to filter the products, etc..
We have had little time, this week has been quite intense and I have not been able to perform all the features I had proposed, which I will implement over these weeks as it is a project that I liked very much to carry out