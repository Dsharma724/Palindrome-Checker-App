# Palindrome Checker App

## 📌 Use Case 4: Character Array Based Palindrome Check

### 📖 Description
This use case validates whether a given string is a palindrome by:

- Converting the string into a character array (`char[]`)
- Using the **two-pointer technique**
- Comparing characters from the start and end
- Displaying the result in the console

This approach avoids creating additional string objects and demonstrates efficient comparison logic.

---

## 🎯 Goal
Check whether a string is a palindrome using a character array and index-based comparison.

---

## 🔁 Flow of Execution

1. Declare and initialize the input string  
2. Convert the string into a `char[]`  
3. Initialize two pointers:
   - `start` → beginning of array  
   - `end` → last index of array  
4. Compare characters at both pointers  
5. Move pointers inward  
6. Print the result  

---

## 🧠 Key Concepts Used

- **Character Array (`char[]`)**
- **Array Indexing**
- **Two-Pointer Technique**
- **Time Efficiency**
- **Boolean Flag for Validation**

---

## 💻 Source Code

```java
public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

