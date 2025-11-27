## Purpose
The purpose of this document is to define design and architecture conventions

# Conventions about packages and classes
- Use Hexagonal Architecture (Ports & Adapters).
- There must not be any empty packages.
- Put application classes in the package app.
- Put domain classes in the package domain.
- Put infrastructure classes in the package infra.
- Put classes annotated with @RestController in the package infra.api.rest.
- Put classes annotated with @Entity in the package infra.repository.jpa.
- Put classes annotated with @Repository in the package infra.repository.jpa.
- Put classes annotated with @Service in the package app.
- Put interfaces with the suffix UseCase in the package app.
- Classes inside the package domain must not import classes from the packages app or infra.
- Classes inside the package app must not import classes from the package infra directly. Instead, they must depend on a port-type interface defined in the package domain, which must have its adapter implementation inside the package infra.
- Do not expose or use domain-layer objects in @RestController request or response bodies. Instead, define dedicated DTO (Data Transfer Object) classes.
- Put the code related to converting or mapping objects between different representations into mapper classes. Make those methods static and prevent instantiation by using the annotation @NoArgsConstructor(access = AccessLevel.PRIVATE).
- Group classes by their corresponding entity following these rules in all packages and for all entities and operations.
  - If there is a class for the use case CreateCart, put that class inside the package app.create_cart.
  - If there is a class for the use case PutCartItem, put that class inside the package app.put_cart_item.
  - If there is a class for the entity Cart, put that class inside the package domain.cart.
  - If there is a class for the entity CartItem, put that class inside the package domain.cart_item.
  - If there is an interface for a repository CartRepositoryPort, put that interface inside the package domain.cart.
  - If there is an interface for a repository CartItemRepositoryPort, put that interface inside the package domain.cart_item.
  - If there is a JPA implementation for the interface CartRepositoryPort, put that class inside the package infra.repository.jpa.cart.
  - If there is a JPA implementation for the interface CartItemRepositoryPort, put that class inside the package infra.repository.jpa.cart_item.
  - If there is a JPA entity related to the Cart class, put that class inside the package infra.repository.jpa.cart.
  - If there is a JPA entity related to the CartItem class, put that class inside the package infra.repository.jpa.cart_item.
  - If there is a mapper related to the Cart JPA entity, put that class inside the package infra.repository.jpa.cart.
  - If there is a mapper related to the CartItem JPA entity, put that class inside the package infra.repository.jpa.cart_item.

# Conventions about data types
- Use java.time.Instant type for all date-time fields within @Entity classes.
- In @RestController classes, represent date-time values as Long types containing epoch time in milliseconds.
- Implement a mapper class to convert between Long (used in the REST layer) and Instant (used in the application and persistence layers) before passing data across layers.

# Conventions about language
- When working with Java streams, use .toList() instead of .collect(Collectors.toList()).
