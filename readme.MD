## Spring Book Recommandation Service

An API written in Java Sprint Boot that provides recommendations for books based on the user's reading history.

## How to run

To run the application, you need to have Java 17 installed on your system.


## Build



## Mind Map Structure

1. Controller
Handles HTTP requests.
Interacts with the Service layer.
Receives DTOs from clients and returns DTOs to clients.

2. Service
Contains business logic.
Interacts with the Repository layer.
Converts between DTOs and Entities.

3. Repository
Handles data access.
Interacts with the Database.
Returns Entities to the Service layer.

4. Model (Entity)
Represents database tables.
Used by the Repository and Service layers.

5. DTO (Data Transfer Object)
Used to transfer data between layers.
Ensures that the Controller layer does not expose internal representations.

## Mind Map
```
[Controller]
    |
    v
[Service] <--> [DTO]
    |
    v
[Repository]
    |
    v
[Model (Entity)]
    |
    v
[Database]
``` 
