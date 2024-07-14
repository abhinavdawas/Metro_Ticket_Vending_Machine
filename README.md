# Metro Ticket Vending Machine

## Description
This is a console-based Metro Ticket Vending Machine application written in Java. The application allows users to purchase tickets, view available routes, and calculate fares based on the selected route, ticket type, and time of purchase.

## Features
1. **View Routes**: Display all available routes and their stations.
2. **Purchase Ticket**:
    - Select a route.
    - Choose a ticket type (single ride, return, weekly pass, monthly pass).
    - Determine if the purchase is during peak or off-peak hours.
    - Calculate the fare based on the selected route, ticket type, and purchase time.
    - Generate and display the ticket.
3. **View Purchased Tickets**: Allow users to view all their purchased tickets in the current session.
4. **Exception Handling**: Handle scenarios such as selecting an invalid route or ticket type.

## How to Run in IntelliJ IDEA

### Step 1: Clone the Repository
Clone the repository to your local machine using the following command: git clone <repository-url>

### Step 2: Open the Project in IntelliJ IDEA
Open IntelliJ IDEA.
Select File -> Open....
Navigate to the directory where you cloned the repository.
Click OK to open the project.

### Step 3: Run the Application
In the Project tool window, locate the Main.java file inside the src/com/metro package.
Right-click on Main.java and select Run 'Main.main()'.
Usage
Follow the on-screen prompts to interact with the Metro Ticket Vending Machine:

View All Routes: Displays all available routes.
Purchase Ticket: Prompts to select a route, ticket type, and purchase time, then calculates and confirms the fare.
View Purchased Tickets: Displays all tickets purchased in the current session.
Exit: Exits the application.
Test Cases
View All Routes

Start the application and select option 1 from the main menu.
Expected Output: List of available routes.
Purchase Ticket

Start the application and select option 2 from the main menu.
Follow the prompts to select a route, ticket type, and specify whether it is peak hours.
Expected Output: Fare calculation and purchase confirmation.
View Purchased Tickets

Start the application, purchase a ticket, and then select option 3 from the main menu.
Expected Output: List of purchased tickets.
Exit

Start the application and select option 4 from the main menu.
Expected Output: Application exits with a goodbye message.



### EXAMPLE INTERACTION
Please select an option:
1. View All Routes
2. Purchase Ticket
3. View Purchased Tickets
4. Exit
   Enter your choice: 1

Available Routes:
Route 1: Station A -> Station B -> Station C
Route 2: Station D -> Station E -> Station F -> Station G
Press Enter to return to the main menu.

Please select an option:
1. View All Routes
2. Purchase Ticket
3. View Purchased Tickets
4. Exit
   Enter your choice: 2

Enter the route name for which you want to purchase a ticket:
(Example input: Route 1) Route 1

Select ticket type:
1. Single Ride
2. Return
3. Weekly Pass
4. Monthly Pass
   Enter your choice: 1

Is it peak hours? (yes/no): yes

The fare for a Single Ride ticket on Route 1 during peak hours is $3.00.
Do you want to purchase this ticket? (yes/no): yes

Ticket purchased successfully!
Ticket ID: 1
Route: Route 1
Ticket Type: Single Ride
Fare: $3.00
Purchase Time: 2024-07-12T10:00:00

Press Enter to return to the main menu.
