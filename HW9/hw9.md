# HW9 - Quick sort keywords!
- Implement a quick sort algorithm for keywords
- Add each keyword into an array/linked list inorder
- Sort the keywords upon request
- Output all the keywords

---
## Commands

### 1. add(Keyword k) 
Insert a keyword `[name, count]` to an array

**Format:**
```
add <name> <count>
```

**Example:**
```
add Fang 3
```

---

### 2. sort() 
Sort the keywords using quick sort

**Format:**
```
sort
```
---

### 3. output() 
Output all keywords in the array

**Format:**
```
output
```

**Output:**
- If the heap is empty:
  ```
  InvalidOperation
  ```
- Otherwise:
  ```
  [NCCU,4,9.9]
  ```

---

## Input / Output Specification

**Input:**
- Each line in the contains command.
- Tokens are separated by spaces.

**Output:**
- Separate keywords with a single space.
- Do not include trailing spaces at the end of a line.


## Example

**Input:**
```plaintext
add Fang 3
add Yu 5
add NCCU 2
add UCSB 1
output
add MIS 4
sort
output 
```

**Output:**
```bash
[Fang,3] [Yu,5] [NCCU,2] [UCSB,1]
[UCSB,1] [NCCU,2] [Fang,3] [MIS,4] [Yu,5]
```

## Notes
- This assignment has **no bonus**.  


## Submission

- **First Submission:** 11/16 (Sun.) 23:59  
- **Final Deadline:** 11/24 (Mon.) 23:59  
- Upload your code via **Moodle**.

