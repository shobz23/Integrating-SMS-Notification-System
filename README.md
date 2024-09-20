# Integrating-SMS-Notification-System

This project demonstrates the Adapter Pattern in Java, applied to an SMS Notification System. The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together by creating an adapter that sits between the two. In this case, the system uses an SMS provider to send notifications via SMS, integrating it into an existing notification system that originally supports only one form of notification (like email).

# Key Features
Adapter Pattern: Adapts the third-party SMS provider’s interface to match the notification system’s interface, making it possible to send SMS notifications without modifying the existing system.
Notification Interface: Defines a common interface for sending notifications, regardless of the underlying provider (Email, SMS, etc.).
SMSProvider: A third-party API to send SMS messages.
SMSAdapter: Translates the third-party SMS provider’s API to fit the system’s existing notification interface.

# Design Pattern Used
Adapter Pattern - This pattern is used to integrate a third-party API (SMS Provider) that is not directly compatible with your system’s interface. The adapter allows the system to use the SMS provider without changing the system’s original notification infrastructure.

# Project Structure
The code is structured into the following files:

Notification.java - Interface that defines the method sendNotification() for sending notifications.
SMSProvider.java - A third-party SMS class that sends text messages using a different method (sendTextMessage()).
SMSAdapter.java - Adapter class that implements the Notification interface and translates calls to the SMS provider’s sendTextMessage() method.
Main.java - Testing class that demonstrates how the adapter is used to send SMS notifications.

# How It Works
The Notification interface defines a single method sendNotification(String message).
The SMSProvider class represents a third-party SMS API that has its own method sendTextMessage(), which doesn't conform to the existing system's interface.
The SMSAdapter class implements the Notification interface and adapts the SMS provider’s method so that it works with the system's existing notification structure.
The client (Main.java) interacts with the Notification interface, which hides the complexities of the SMS provider API.

# Project Requirements
Java Version: Java SE 8 or later
IDE: You can use IntelliJ IDEA, Eclipse, or any other Java-compatible IDE.
Command Line: Alternatively, you can compile and run the project using the command line.

# Future Enhancements
Add support for other notification methods, such as push notifications or email, using the same Notification interface.
Implement logging and error handling to handle failed SMS delivery and retries.
Allow dynamic phone number input from users rather than hardcoding the phone number.
