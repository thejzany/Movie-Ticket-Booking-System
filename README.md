# Movie-Ticket-Booking-System
The Simple Movie Ticket Booking System is a Java-based console application that simplifies the process of booking movie tickets, checking seat availability, retrieving ticket details, and canceling booked tickets. This project is designed with a focus on encapsulation, utilizing three key classes: `BoxOffice`, `Ticket`, and `Theatre`. These classes work together to provide users with a seamless and secure movie ticket booking experience.

**Key Features:**
- **Ticket Booking:** Users can conveniently book movie tickets for their preferred shows.
- **Seat Availability:** Users can check the availability of seats for a movie show.
- **Ticket Details Retrieval:** Users can retrieve the information about booked tickets, including number of tickets and movie details, can be retrieved.
- **Ticket Cancellation:** Users have the flexibility to cancel their booked tickets, freeing up seats for others.

## Classes:

### BoxOffice Class:
The `BoxOffice` class serves as the central hub for managing ticket operations. It encapsulates the booking, retrieval, and cancellation of tickets. By utilizing encapsulation, the `BoxOffice` class maintains the integrity of ticket data and ensures controlled access to its methods.

### Ticket Class:
The `Ticket` class encapsulates the attributes of a movie ticket, such as movie name, and number of seats. It provides methods for retrieving and canceling tickets. The encapsulation of ticket information enhances data privacy and encapsulates the ticket's state.

### Theatre Class:
The `Theatre` class represents the movie theatre venue itself. It holds information about theatre name and number of seats. While this class isn't explicitly mentioned in the feature list, its implementation plays a crucial role in enabling seat availability checks and ensuring a coherent movie experience.
