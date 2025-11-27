## Purpose
The purpose of this document is to define naming conventions for packages and classes

# Conventions about namings
- Follow Java naming conventions for classes and packages.
- Use the suffix Controller for classes annotated with @RestController.
- Use the suffix JpaRepository for classes annotated with @Repository.
- Use the suffix Service for classes annotated with @Service.
- Use the suffix UseCase for interfaces implemented by service classes that are invoked from @RestController classes.
- Use the suffix RepositoryPort for repository port interfaces.
- Use the suffix JpaAdapter for adapter classes that implement repository port interfaces.
- Use the suffix Mapper for utility or helper classes that convert or map objects between different representations.
- Use the suffix Dto for DTO classes.
- Use the character _ to separate words in package names. For example, use create_user instead of createuser.
