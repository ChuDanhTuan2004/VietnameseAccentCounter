# Vietnamese Accent Counter

## Project Description

Vietnamese Accent Counter is a Java program that utilizes the Boyer-Moore algorithm to count the number of Vietnamese accented characters that can be formed from a string entered by the user, using the Telex input method.

### Supported Vietnamese Accented Characters:
- ă = `aw`
- â = `aa`
- đ = `dd`
- ê = `ee`
- ô = `oo`
- ơ = `ow`
- ư = `w`

## Project Structure

The project is divided into the following classes:
- **VietnameseAccentCounter**: The main class, containing the `main` method to run the program. It allows the user to input a string and displays the result.
- **BoyerMoore**: Implements the Boyer-Moore algorithm for pattern searching.
- **TelexPattern**: Provides the Telex input patterns for accented characters.

## How It Works

The program prompts the user to enter a string (without special characters or spaces). It then uses the Boyer-Moore algorithm to find and count the occurrences of the Telex patterns within the string. The final result displays the number of Vietnamese accented characters that can be formed from the input string.

## Usage Instructions

1. Clone or download the project to your machine.
2. Open the project in IntelliJ IDEA (or any Java development environment).
3. Run the program through the **VietnameseAccentCounter.java** file.
4. When prompted, input the string you want to check and press **Enter**.
5. The program will display the number of Vietnamese accented characters that can be formed from the string.

## System Requirements

- Java 8 or higher
- IntelliJ IDEA (or any Java IDE)

## Example

For the input string:

```plaintext
hwfdawhwhcoomddfgwdc
```

The program will output:
```
Number of Vietnamese accented characters: 6
```

## Folder Structure
```
.
├── src
│   └── main
│       └── java
│           └── org
│               └── example
│                   ├── BoyerMoore.java
│                   ├── TelexPattern.java
│                   └── VietnameseAccentCounter.java
├── .gitignore
└── README.md

```

## Author
Chu Danh Tuấn
