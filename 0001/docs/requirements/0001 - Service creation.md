# Requirement 0001: Service creation

## Overview
- We need a REST API service written in Java for managing shopping cart actions.
- No Web UI development is needed.

## Requirements
- Use Maven, Java 21 and Spring Boot version 3.5.6
- Use Lombok version 1.18.42 for reducing boilerplate code
- Use PostgreSQL for storage
- Use JPA and Spring JpaRepository classes
- Include validation on inputs
- Required endpoints:
  - GET /{customerId}/cart        ; Retrieve the current user’s cart (items, totals)
  - POST /{customerId}/cart       ; Create a new cart
  - DELETE /{customerId}/cart     ; Clear the entire cart
  - GET /{customerId}/cart/items  ; List cart items
  - GET /{customerId}/cart/items/{itemId}     ; Get a single item from the cart
  - PUT /{customerId}/cart/items/{itemId}     : Put a single item in the cart with the quantity as an option (idempotent)
  - PATCH /{customerId}/cart/items/{itemId}   ; Update the quantity of an item
  - DELETE /{customerId}/cart/items/{itemId}  ; Delete an item from the cart

## Deliverables
1. Project structure (folders, main files)
2. Database schema
3. Code implementation
