- [Abstract Factory Pattern](#abstract-factory-pattern)
  * [When to use it?](#when-to-use-it-)
  * [Consequences](#consequences)
      - [Pros](#pros)
      - [Cons](#cons)
  * [Related Patterns](#related-patterns)
  * [Class Diagram](#class-diagram)
      - [Estructure](#estructure)
      - [Implementation](#implementation)

#  Abstract Factory Pattern

This pattern fall under the creational patterns category.

It allows creating families of objects (related or dependant), providing an
interface, without specifying their concrete classes.
 
## Grade
**complexity**: :star2: :star2: :start2: :eight_pointed_black_star: :eight_pointed_black_star:
**popularity**: :star2: :star2: :star2: :star2: :eight_pointed_black_star:

## When to use it?
- Client must hace no relation with the creation (process, steps, 
  implications, ...) of the objects.
- Configuration must be done with one or more families of products.
- Objects must be created as a whole, and maintaining compatibility.
- Only want to provide a colection of classes and only reveal their interfaces
  and relationships - not their implementation.

## Consequences

#### Pros
- **Isolates concrete classes****, meaning clients do not get to see what the 
implementation classes look like: they handle instances through their abstract
interfaces.
- As families of products are created at once, the family changes all at 
once, making **easier to change products' family**.
- **Helps consistency**, as it makes it mandatory to work only with one family 
at a time.

#### Cons
- It is **harder to include new types of products**, due to the existance of the
Abstract Factory, dictating the families that can be created.

## Related Patterns
- _Factory Method_ and _Prototype_, as classes tend to be implemented using 
  factories. Prototypes can also be used.
- Concrete Factories tend to be a _Singleton_ type.
- _Abstract Factory_ in focused on what is going to be built. On the other hand,
  _Builder_ pattern is focused on how it is going to be built. Both can create
  complex objects, the difference resides in that _Builder_ focuses in creating
  an object (step-by-step) and _Abstract Factory_ in creating a family of 
  objects.
- Can also substitute _Facade_ pattern when just want to hide how subsystem 
  objects are created.
- 

## Class Diagram

#### Estructure

<img src="./images/abstract-factory-template.svg">

#### Implementation

<img src="./images/abstract-factory.svg">
