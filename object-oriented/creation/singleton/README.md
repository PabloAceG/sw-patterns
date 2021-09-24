- [Singleton Pattern](#singleton-pattern)
  * [Grade](#grade)
  * [When to use it?](#when-to-use-it-)
  * [Consequences](#consequences)
      - [Pros](#pros)
      - [Cons](#cons)
  * [Related Patterns](#related-patterns)
  * [Class Diagram](#class-diagram)
      - [Estructure](#estructure)
      - [Implementation](#implementation)

# Singleton Pattern

Pattern under the creational patterns category.

All access is centralized to an instance. This means that all changes made to
that object, are reflected in all other "instances".

In this pattern, there is a class, containing a one constructor. The instance is
instantiated whenever the object is called for the first time using the method 
_getSingleton()_. Thereonafter, the same instance of the object is called until
that object is destroyed.

## Grade
**complexity**: :star2: :eight_pointed_black_star: :eight_pointed_black_star: :eight_pointed_black_star: :eight_pointed_black_star:

**popularity**: :star2: :star2: :star2: :star2: :eight_pointed_black_star:

## When to use it?
- Resources where access (read/write) should be controlled, like database or 
remote connections.

## Consequences

#### Pros
- Allows reducing the number of instances.
- Avoids having to use Global Variables: no pollution in variables names space
to store the instances.

#### Cons
- Having subclasses of a singleton is not adviced as encapsulation breaks down:
private constructor should not be used in parent class; a subclass of a Singleton
is not a Singleton.

## Related Patterns
- In _Abstract Factory_ the Concrete Factories are usually implemented using a 
  _Singleton_ Object.
- In _Factory Method_ a factory per application is the perfect example of a 
  _Singleton_.
- _Builders_ and _Prototypes_ can be implemented as _Singletons_.
- _Facade_ classes can be transformed into _Singleton_ implementation, as a 
  sigle facade object suffices for most cases.

## Class Diagram

#### Estructure

<img src="./images/singleton-template.svg">

#### Implementation

<img src="./images/singleton.svg">
