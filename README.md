# Java Code: Players, Clubs, and Salaries

This Java code demonstrates a simple program that involves players, clubs, and their salaries.

## Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Running the Code](#running-the-code)
- [Code Snippet](#code-snippet)
- [Classes](#classes)
  - [TestMain](#testmain)
  - [Player](#player)
  - [Club](#club)
- [Contributing](#contributing)
- [License](#license)

## Overview

The code provided here implements a Java program that manages players and clubs. It allows you to create players, assign them to clubs, and calculate the total salary and player with the highest salary for each club.

## Getting Started

### Prerequisites

To run this code, you'll need:

- Java Development Kit (JDK) installed on your machine.

### Running the Code

Follow these steps to run the code:

1. Clone this repository to your local machine:
git clone https://github.com/your-username/your-repo.git

2. Change your working directory to the repository:

        cd your-repo
   
3. Compile the Java files:

        javac TestMain.java Player.java Club.java
java TestMain

## Code Snippet

```java
// Create players
Player[] p = new Player[5];
Random r = new Random();
for (int i = 0; i < 5; i++) {
p[i] = new Player(i + 1, "P" + (i + 1));
p[i].setSalary(10000 * r.nextDouble());
}

// Create clubs and add players
Club[] c = new Club[2];
for (int i = 0; i < 2; i++) {
c[i] = new Club();
c[i].setId(i + 1);
c[i].setName("C" + (i + 1));
}
c[0].addPlayer(p[0]);
c[1].addPlayer(p[1]);
c[0].addPlayer(p[2]);
c[1].addPlayer(p[3]);
c[0].addPlayer(p[4]);

// Print information about each club
for (int i = 0; i < 2; i++) {
System.out.println(c[i].getId() + ", " + c[i].getName());
System.out.println(c[i].getSalary());
System.out.println(c[i].getMaxSalaryPlayer().getName());
}
