# Akka-study

## Project description

🚀 This project promoted the basic actor model implementation
## Installation ##

It is necessary to install some items:
- Java 11
- Maven

### Actors
Actors are programming units within a program, instantiated within an actor server. These actors communicate with each other through messages, which work as in the DTO (Data Transfer Object) standard. These messages are passed through channels, which are like message buffers being queued for reading by actors.
An important point about messages is that they must be created as immutable objects, so we don't have problems with locks and shared access to information.

All this communication is done asynchronously, that is, when a message is sent to an actor, it is deposited for later reading by the actor in its channel (also called mailbox). This is also true in communication between actors: in a scenario where an actor A needs to communicate with an actor B (and receive a return from B), this return must be done through another message, which must be sent from the actor B to actor A.

### Benefits Actors Model

- A model in which each processing operation is encapsulated in a different actor. In this way, we can code, test, refactor, etc. each party completely independently, without affecting the other operations
- Actor is developed under the stateless concept, in which its scope is only for processing the messages that are received, using immutable objects to encapsulate the data. In this way, we do not have deadlocks, as we do not share access to the same information, or inconsistent information because they are being accessed concurrently
- buffers allow you to model the flow of execution so that slower operations can be executed in parallel with faster operations, thus, we gain a lot in program execution time;
- With buffers, the most costly processing, such as operations to access database-like resources, is isolated to specific actors, which thus does not impact all processing.


### Akka
Akka project with the vision of a runtime and programming model that would address the challenges of both multicore and distributed computing. Akka gives developers a unified way to build scalable and fault-tolerant software that can scale up on multicore systems, and scale out in distributed computing environments, which today often means in the cloud. Akka makes it possible to build software systems with reliability and high performance, without sacrificing developer joy and productivity.
In short, Akka is open source middleware for building highly concurrent, distributed and fault-tolerant systems on the JVM. Akka is built with Scala, but offers both Scala and Java APIs to developers.

### Technologies

The following technologies were used to carry out the project:
- Java
- Maven
- Akka
