# Java Banking Mini Program

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A beginner-friendly, menu-driven banking program written in Java. It demonstrates console input, loops, switch expressions, and methods for viewing a balance, depositing money, and withdrawing money.

## Features

- Display the current account balance.
- Enter a deposit amount.
- Enter a withdrawal amount.
- Continue using the menu until the Exit option is selected.
- Separate balance, deposit, and withdrawal operations into methods.

## Built With

- **Java**
- **Scanner** from `java.util` for console input

## Project Structure

```text
banking-mini-program/
└── MiniProject7.java
```

## Getting Started

### Prerequisites

Install a JDK that supports switch expressions (Java 14 or later).

Check your Java installation:

```bash
java -version
javac -version
```

### Compile and Run

Open a terminal in the directory containing `MiniProject7.java`.

Compile the program:

```bash
javac MiniProject7.java
```

Run it:

```bash
java MiniProject7
```

## How to Use

Follow the menu displayed in the terminal:

| Option | Action |
| --- | --- |
| 1 | Show the current balance |
| 2 | Enter a deposit amount |
| 3 | Enter a withdrawal amount |
| 4 | Exit the program |

The account balance is initialized to `1.00`. Values are handled as decimal numbers using Java's `double` type.

## Learning Outcomes

This project is a practice exercise for:

- Java control flow using `while` and `switch`.
- Reading console input with `Scanner`.
- Defining and calling methods.
- Passing values to methods and returning results.
- Maintaining a balance variable during a program session.

## Known Limitations

This is a beginner project, not a real banking application. The current implementation has validation issues that should be fixed before relying on its results:

- A negative deposit displays a warning but still returns the negative amount, which is then applied to the balance.
- A withdrawal greater than the available balance displays an insufficient-balance warning, but the amount is still subtracted.
- Successful-withdrawal messaging is printed before the caller checks whether the balance is sufficient.
- Non-numeric console input is not handled, and the balance is stored as a `double` rather than a currency-safe representation.

These items are documented as areas for improvement; they have not been corrected by this README update.

## Possible Improvements

- Validate deposit and withdrawal amounts before changing the balance.
- Reject withdrawals that exceed the available balance.
- Handle invalid menu choices and non-numeric input gracefully.
- Use `BigDecimal` for currency calculations.
- Add automated tests for balance, deposit, and withdrawal logic.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
