
# 🖥️ Simple Keylogger (For Local Demo & Educational Use Only)

This is a **simple keylogger** built in Java using basic `Swing` and `AWT` components. It captures keystrokes typed within a Java GUI window and logs them both to the console and to a local file.

> ⚠️ **DISCLAIMER:** This project is for **educational and ethical use only**. Do not use it on systems you do not own or without explicit permission. Unauthorized use of keyloggers is illegal and unethical.

---

## 📌 Features

- 🔡 Captures all key presses within a text area
- 📄 Logs keystrokes to a `keylog.txt` file
- 🧰 Lightweight and beginner-friendly
- 💻 Runs as a desktop Java application

---

## 📂 Project Structure

```
BasicKeylogger/
├── BasicKeylogger.java     # Main Java file
└── keylog.txt              # File to store logged keys
```

---

## 🚀 How to Run

### ✅ Prerequisites

- Java JDK 8 or higher
- Text editor or IDE (e.g., VS Code, IntelliJ, Eclipse)
- Terminal or command prompt

---

### 🧑‍💻 Steps

1. **Clone or Download the Project**
```bash
git clone https://github.com/your-username/BasicKeylogger.git
cd BasicKeylogger
```

2. **Save the following code as `BasicKeylogger.java`:**
*(if you haven’t already)*

```java
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class BasicKeylogger {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Keylogger Demo");
        JTextArea area = new JTextArea();

        frame.add(area);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("keylog.txt", true));

            area.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    char c = e.getKeyChar();
                    System.out.print(c);  // Print to console
                    try {
                        writer.write(c);  // Write to file
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

3. **Compile the Program**
```bash
javac BasicKeylogger.java
```

4. **Run the Program**
```bash
java BasicKeylogger
```

5. **Test the Logger**
* Start typing in the window.
* Keystrokes will be printed in the terminal and logged in `keylog.txt`.

---

## 📷 Screenshot

> *(You can add a screenshot of the running window and `keylog.txt` output here)*

---

## 🧠 Concepts Used

* Java Swing (`JFrame`, `JTextArea`)
* Event Handling (`KeyListener`)
* File I/O (`BufferedWriter`, `FileWriter`)

---

## ❗ Important Notes

* This logger **does not work globally** — it only logs keys typed within the app window.
* To create a global/system-wide keylogger, native OS libraries or JNI/JNA would be required, which is out of beginner scope.

---

## 📜 License

This project is licensed under the **MIT License**. Feel free to fork, modify, and learn from it — but **always use responsibly**.

---

## 🙋 FAQ

**Q: Can this run in the background?**  
A: No. This version only works inside the window. It doesn't run silently or as a background process.

**Q: Is this malicious software?**  
A: No, not if used ethically and for local testing/learning purposes only. Always inform and get consent.

---

## 👨‍🏫 Made for Learning

This keylogger is intended for **students and ethical hackers** to understand how keystroke capture works at a basic GUI level.
