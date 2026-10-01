# Aplicații Java – Exerciții OOP și Structuri de Date

## 🇷🇴 Română

### Despre proiect

**Aplicații Java – Exerciții OOP și Structuri de Date** este un proiect software dezvoltat în Java care reunește mai multe componente independente pentru modelarea unor scenarii practice și pentru implementarea unor operații de bază asupra datelor.

Proiectul pune accent pe **programarea orientată pe obiecte**, organizarea codului în clase specializate, reutilizarea comportamentului prin moștenire și implementarea unor operații de căutare și modificare a datelor în structuri de tip array.

---

### Funcționalități

#### ✈️ Simularea unui zbor

Componenta de zbor modelează un sistem simplificat pentru reprezentarea unui zbor și a unui zbor comercial.

Acest exercițiu evidențiază concepte precum:

- gestionarea parametrilor unui zbor;
- poziționare și altitudine;
- viteză și azimut;
- modificarea direcției de deplasare;
- simularea procesului de aterizare;
- specializarea unui zbor prin moștenire;
- gestionarea informațiilor specifice unui zbor comercial, precum numărul zborului și numărul de pasageri.
- clase și obiecte;
- moștenire;
- redefinirea metodelor;
- modificatori de acces;
- metode pentru manipularea stării unui obiect;
- simularea unui proces prin iterații.

Arhitectura componentei este bazată pe relația dintre clasele `Zbor` și `ZborComercial`.

#### 🏦 Operații bancare

Componenta bancară modelează operațiile de bază asociate unui cont și unui client.

Conceptele ilustrate includ:

- reprezentarea unui client;
- gestionarea unui cont bancar;
- verificarea soldului;
- depuneri;
- retrageri;
- validarea operațiilor în funcție de sold;
- interacțiune cu utilizatorul prin consolă.
- încapsularea datelor;
- constructori;
- metode publice;
- gestionarea stării unui obiect;
- citirea datelor de la tastatură;
- operații aritmetice asupra soldului.

Clasele `Client`, `ContBanca` și `OperatiiBanca` separă responsabilitățile principale ale componentei.

#### 🔎 Căutare și ștergere într-un vector

Componenta de procesare a vectorilor implementează operații pentru identificarea și eliminarea elementelor.

Aplicația demonstrează:

- inițializarea vectorilor;
- parcurgerea elementelor;
- căutarea liniară;
- identificarea poziției unui element;
- eliminarea unui element;
- deplasarea elementelor rămase după eliminare;
- afișarea rezultatului.
- utilizarea unei clase pentru abstractizarea operațiilor asupra vectorului;
- interacțiunea cu utilizatorul prin `Scanner`.

Sunt utilizate atât o implementare structurată prin clasa `DeclarSir`, cât și o implementare directă pentru compararea celor două abordări.

#### 🔎 Căutare și ștergere într-un vector simplu

Aplicația:

1. inițializează un vector;
2. afișează elementele;
3. caută o valoare specificată în cod;
4. elimină o valoare din vector;
5. deplasează elementele rămase;
6. afișează vectorul rezultat.

Acest exercițiu permite compararea unei implementări directe cu abordarea utilizată în exercițiul anterior.

---

### Structura proiectului

```text
Aplicatii-Java–Exercitii-OOP-si-Structuri-de-Date/
│
├── README.md
│
└── src/
    ├── zboruri/
    │   ├── Zbor.java
    │   ├── ZborComercial.java
    │   └── Zbornou.java
    │
    ├── banca/
    │   ├── Client.java
    │   ├── ContBanca.java
    │   └── OperatiiBanca.java
    │
    ├── cautare_vector/
    │   ├── Cautare.java
    │   └── DeclarSir.java
    │
    └── cautare_vector_simplu/
        └── CautSir.java
```

---

### Obiective de învățare

Prin intermediul proiectului sunt exersate următoarele concepte Java:

- programare orientată pe obiecte;
- definirea și utilizarea claselor;
- crearea și utilizarea obiectelor;
- constructori;
- încapsulare;
- moștenire;
- redefinirea metodelor;
- modificatori de acces;
- metode și atribute;
- vectori;
- căutare liniară;
- ștergerea elementelor din vectori;
- structuri repetitive și condiționale;
- citirea datelor de la tastatură;
- organizarea codului în mai multe clase.

---

### Concepte și tehnologii

- **Java**
- **Java Standard Library**
- **Object-Oriented Programming (OOP)**
- **Inheritance**
- **Encapsulation**
- **Classes & Objects**
- **Method Overriding**
- **Arrays**
- **Linear Search**
- **Array Manipulation**
- **Console Input/Output**
- **Java Standard Library**

---

### Organizarea codului

Proiectul urmărește o structură simplă și clară:

- fiecare clasă este definită în propriul fișier `.java`;
- responsabilitățile sunt separate între clase;
- componentele sunt organizate în directoare distincte;
- punctele de intrare ale aplicațiilor sunt definite prin metode `main`;
- implementările pot fi compilate și rulate independent.

---

### Rulare

Este necesar un **JDK** instalat și configurat în sistem.

Exemplu pentru componenta de zbor:

```bash
javac src/exercitiul1_zboruri/*.java
java -cp src/exercitiul1_zboruri Zbornou
```

Pentru componenta bancară:

```bash
javac src/exercitiul2_banca/*.java
java -cp src/exercitiul2_banca OperatiiBanca
```

Pentru componenta de căutare în vector:

```bash
javac src/exercitiul3_cautare_vector/*.java
java -cp src/exercitiul3_cautare_vector Cautare
```

Pentru implementarea simplificată:

```bash
javac src/exercitiul4_cautare_vector_simplu/*.java
java -cp src/exercitiul4_cautare_vector_simplu CautSir
```

---

# 🇬🇧 English

## About the Project

**Java Applications – OOP & Data Structures** is a Java software project containing several independent components designed around practical data-processing and object-oriented programming scenarios.

The project focuses on **object-oriented design**, class-based organization, inheritance, encapsulation, and fundamental data manipulation operations using arrays.

---

### Features

#### ✈️ Flight Management

The flight management component provides a simplified model for representing and simulating flights.

Key functionality includes:

- flight parameter management;
- altitude and geographical position;
- speed and azimuth management;
- direction changes;
- landing simulation;
- inheritance-based flight specialization;
- commercial flight information such as flight number and passenger count.

The component is structured around the relationship between `Zbor` and `ZborComercial`.

#### 🏦 Banking Operations

The banking component models basic operations associated with a bank account and a client.

Key functionality includes:

- client representation;
- bank account management;
- balance management;
- deposits;
- withdrawals;
- balance-based operation validation;
- console-based user interaction.

The `Client`, `ContBanca`, and `OperatiiBanca` classes separate the main responsibilities of the component.

#### 🔎 Array Search & Manipulation

The array-processing components implement fundamental operations for searching and modifying array data.

Key functionality includes:

- array initialization;
- element traversal;
- linear search;
- position lookup;
- element deletion;
- shifting remaining elements after deletion;
- result display.

The project includes both a class-based implementation through `DeclarSir` and a more direct implementation, providing two approaches to array manipulation.

#### 🔎 Basic Array Search and Deletion

The application:

1. initializes an array;
2. displays its elements;
3. searches for a specific value;
4. removes an element;
5. shifts the remaining elements;
6. displays the resulting array.

This exercise provides a straightforward example of array manipulation and can also be compared with the more structured approach used in Exercise 3.

---

### Project Structure

```text
Aplicatii-Java–Exercitii-OOP-si-Structuri-de-Date/
│
├── README.md
│
└── src/
    ├── zboruri/
    │   ├── Zbor.java
    │   ├── ZborComercial.java
    │   └── Zbornou.java
    │
    ├── banca/
    │   ├── Client.java
    │   ├── ContBanca.java
    │   └── OperatiiBanca.java
    │
    ├── cautare_vector/
    │   ├── Cautare.java
    │   └── DeclarSir.java
    │
    └── cautare_vector_simplu/
        └── CautSir.java
```

---

## Learning Objectives

The project provides practice with the following Java concepts:

- object-oriented programming;
- classes and objects;
- constructors;
- encapsulation;
- inheritance;
- method overriding;
- access modifiers;
- attributes and methods;
- arrays;
- linear search;
- array element deletion;
- loops and conditional statements;
- console input;
- organizing Java code into multiple classes.

---

### Technologies & Concepts

- **Java**
- **Java Standard Library**
- **Object-Oriented Programming (OOP)**
- **Inheritance**
- **Encapsulation**
- **Classes & Objects**
- **Method Overriding**
- **Arrays**
- **Linear Search**
- **Array Manipulation**
- **Console Input/Output**
- **Java Standard Library**

---

### Code Organization

The project follows a clear and modular structure:

- each class is stored in its own `.java` file;
- responsibilities are separated across dedicated classes;
- components are organized into separate directories;
- each application defines its own `main` entry point;
- components can be compiled and executed independently.

---

### Running the Project

A **JDK** installation is required.

Example for the flight management component:

```bash
javac src/exercitiul1_zboruri/*.java
java -cp src/exercitiul1_zboruri Zbornou
```

For the banking component:

```bash
javac src/exercitiul2_banca/*.java
java -cp src/exercitiul2_banca OperatiiBanca
```

For the array search component:

```bash
javac src/exercitiul3_cautare_vector/*.java
java -cp src/exercitiul3_cautare_vector Cautare
```

For the simplified implementation:

```bash
javac src/exercitiul4_cautare_vector_simplu/*.java
java -cp src/exercitiul4_cautare_vector_simplu CautSir
```

---

## 👤 Autor / Author

**IonutD**
