# Java To-Do List CLI App

simple command-line To-Do List application written in Java.  
This project allows you to manage tasks from the terminal, storing them in a local `todo.txt` file.

---

## 📦 Features

-  View to-do list items
-  Add new tasks
-  Remove tasks by number
-  Stores data in a plain text file (`todo.txt`)
-  Runs in the terminal/console

---

## 🔧 Requirements

- Java JDK 8 or higher

---

## 🚀 How to Run

1. **Download or Clone the Repository**  
   - Click the green **`Code`** button → **`Download ZIP`**  
   - Or clone via terminal:
     ```bash
     https://github.com/PathumXD/JavaToDoList.git
     ```

2. **Open the folder in your terminal**

3. **Compile the Java file**
   ```bash
   javac ToDoList.java

4. **Run the program**
   ```bash
   java ToDoList

---

## Usage Guide
When you run the program, it displays a simple menu:
 ```bash
 ##### ----------- Main Menu ----------- #####

  0. Exit the Program  
  1. Display To-Do List  
  2. Add Item to To-Do List  
  3. Remove Item from To-Do List
```
### Display To-Do List
Shows a numbered list of current tasks stored in todo.txt.

### Add Task
Prompts you to type in a task. It is then added to todo.txt.

### Remove Task
Enter the number shown in the list to delete that specific task.

## Example
```bash
 ##### ----------- Main Menu ----------- #####

0. Exit the Program  
1. Display To-Do List  
2. Add Item to To-Do List  
3. Remove Item from To-Do List  

Enter a Choice(type Number): 2  
Enter an item: Buy groceries

Enter a Choice(type Number): 1  
1 Buy groceries

Enter a Choice(type Number): 3  
Which item do you want to remove(type Number)? 1

```

---

©️ Copyright

Project: Java To-Do List CLI App  
Author: Pathum Bandara (PathumXD)  
License: MIT License  
