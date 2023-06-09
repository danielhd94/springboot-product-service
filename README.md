# Springboot product service

The product microservice is a part of the system that handles product information. It provides endpoints to read and view product details.

## Features

- Retrieves a list of products.
- Allows to retrieve detailed information about a specific product.

## Technologies Used

- Java: Main programming language.
- Spring Boot: Framework for Java application development.
- Spring Data JPA: Persistence library for working with relational databases.
- H2 Database: In-memory database used for development and testing.

## Configuration

1. Clone this repository: `git clone https://github.com/danielhd94/springboot-product-service.git`
2. Navigate to the project directory: `cd springboot-product-service`
3. Open the project in your preferred IDE (such as Spring Tools Suite).
4. Run the application. The H2 in-memory database will be automatically created.

## Endpoints

The following endpoints are available in the product microservice:

- `GET /list`: Retrieves a list of all products.
- `GET /detail/{id}`: Retrieves detailed information about a specific product.

## Contributions

Contributions are welcome. If you want to improve this product microservice, you can fork the repository, make your changes, and submit a pull request.

## Author

Daniel Hernandez

## License

This project is licensed under the MIT License. See the LICENSE file for more information.

## Contact

If you have any questions or suggestions regarding the product microservice, you can contact me at danielhd94@hotmail.com.
