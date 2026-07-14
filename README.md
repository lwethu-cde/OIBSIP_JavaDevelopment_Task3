# ATM Interface
Project Overview: This project is a console-based ATM simulation built in Java. The system allows a user to log in with a User ID and password once authenticated they can perform basic ATM operations such as:

Viewing Transaction History
Withdraw money, 
Deposit money,
Transfer money to another user,
Exit the system once they are done.

The project is structured into five classes:ATM.java → Main class that runs the program and handles user input.
User.java → Represents a bank customer with ID, password, balance and transaction history.
Transaction.java → Represents a single transaction (deposit, withdraw, transfer).
Bank.java → Acts as the "database" of users and handles authentication.
ATMOperations.java → Contains the logic for deposits, withdrawals, transfers, and history.

Tools & Technologies Used: Java, IntelliJ IDEA
What have i learned: The importance of data structures using HashMap and an ArrayList to store trnsaction history. How to implement authentication logic by checking user ID and Password.
Writing a clean and commenetd code to make it easier to understand.
What Can be improved: I could improve this project by storing data in a database(MySQL) instaed of hardcoding it, and making this project a full stack project have back-end using spring-boot and front-end using Vue.Js.
How this project works: The progarm starts and ask for User ID and Password of a user.
The Bank class then checks if the credentials provided are correct, If login is successful the user then sees the welcome message. Then the user chooses an option whether to withdraw, deposit, transfer, transaction history and exit once done. The ATMOperation class execute the chosen action and updates the user object. Transactions are recorded in the transaction history for future references. 
