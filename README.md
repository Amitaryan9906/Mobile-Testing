

# Banjara Ride Android Mobile Testing App

Welcome to the Banjara Ride Android Mobile Testing App repository! This repository contains the automation testing codebase for the Banjara Ride Android mobile application.

## About Banjara Ride

BanjaraRide is an Automobile Renting Enterprise that provides traveling solutions from a wide range of Motorbikes and Scooters. Our aim is to become the one-stop solution for all travel-related commodities.

## Tech Stack

- Appium
- Java
- Maven
- Android Studio
- STS IDE

## Getting Started

To get started with the automation testing of the Banjara Ride Android app, follow these steps:

1. Prerequisites:
   - Ensure you have Appium installed on your machine.
   - Make sure you have Java Development Kit (JDK) installed.
   - Install Maven build tool.
   - Download and set up Android Studio.
   - Install the Spring Tool Suite (STS) IDE for Java development.

2. Clone the Repository:
   ```
   git clone https://github.com/Amitaryan9906/Mobile-Testing.git
   cd banjararide-android-testing
   ```

3. Set Up Android Emulator or Device:
   * Launch Android Studio and create a virtual device using AVD Manager, or connect a     physical Android device to your computer.

4. Configure the Appium Server:
   - Start the Appium server with the desired configuration for your Android emulator or device.

5. Open the Project in STS IDE:
   - Import the project into the Spring Tool Suite (STS) IDE.

6. Configure Test Environment:
   - Update the necessary configuration in the test code to match your test environment.
   - Change the path of your '.bat' file
   ```
   public static void startEmulator() throws IOException, InterruptedException {
    Runtime.getRuntime().exec("C:\\Users\\dell\\Desktop\\emulator.bat");
    Thread.sleep(30000);
	}
	```
   in Capability class

7. Run the Tests:
   - Execute the automated tests using Maven or run individual test cases using STS IDE.
