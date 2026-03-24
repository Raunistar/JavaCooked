# DSA Last-Minute Revision — Arrays & Strings
> Concept + Dry Run + Code — Ekdum clean

---

## TC/SC Quick Reference

```
O(1)      → Direct access, fixed size array, few variables
O(log n)  → Binary search, each step halves the work
O(n)      → Single loop
O(n log n)→ Sorting
O(n²)     → Nested loops

SPACE:
O(1) → Only variables (int, char, boolean)
O(n) → New array, HashMap, HashSet, ArrayList
```

> **Rule:** Multiple separate loops = O(n) + O(n) = O(n). Nested loops = O(n²).

---

## 1. Array Basics

### Concept
- Contiguous block of memory, same data type
- Address formula: `base_address + (index × size_of_element)` → Access O(1)
- 0-based indexing: 0 to `arr.length - 1`

### Time Complexities
| Operation | TC | Reason |
|---|---|---|
| Access by index | O(1) | Direct address formula |
| Search | O(n) | Linear scan |
| Insert at end | O(1) amortized | Just place it |
| Insert at middle | O(n) | Shift right elements |
| Delete at middle | O(n) | Shift right elements |

### Static vs Dynamic Array
| | Array | ArrayList |
|---|---|---|
| Size | Fixed | Dynamic (doubles when full) |
| Type | Primitives allowed | Objects only (autoboxing) |
| Methods | None | .add(), .remove(), .size() |

> **Doubling strategy:** When full, new array 2x size is created, elements copied. O(n) copy happens rarely → amortized O(1) insert.

---

## 2. Two Pointers

### Concept
Two indices — left and right — moving toward each other or same direction. Reduces O(n²) to O(n).

**Condition: Array must be SORTED for opposite-ends approach.**

### Two Flavours
- **Opposite ends** → pair sum, palindrome, container with most water
- **Same direction (slow-fast)** → remove duplicates, cycle detection

### Dry Run — Pair Sum
```
arr = [1, 3, 5, 7, 9], target = 12

left=0(1), right=4(9) → sum=10 → too small → left++
left=1(3), right=4(9) → sum=12 → FOUND ✓ (3+9)
```

### Code
```java
Arrays.sort(arr); // must be sorted

int left = 0, right = arr.length - 1;
boolean found = false;

while (left < right) {
    int sum = arr[left] + arr[right];

    if (sum == target) {
        System.out.println("Found: " + arr[left] + " + " + arr[right]);
        found = true;
        break;
    } else if (sum < target) {
        left++;   // need bigger sum
    } else {
        right--;  // need smaller sum
    }
}

if (!found) System.out.println("No pair found.");
```

**TC: O(n log n)** (sorting) **SC: O(1)**

---

## 3. Sliding Window

### Concept
Window of size k slides across array. Instead of recalculating sum from scratch, reuse previous sum.

> Add new element on right, remove old element on left.

**Condition: No sorting needed.**

### The One Formula
```java
windowSum = windowSum - arr[i - k] + arr[i];
//                      ↑ bahar       ↑ andar
```

### Dry Run
```
arr = [2, 4, 1, 6, 3, 5], k = 3

[2,4,1] = 7           (first window)
[4,1,6] = 7 - 2 + 6  = 11   (remove arr[0], add arr[3])
[1,6,3] = 11 - 4 + 3 = 10   (remove arr[1], add arr[4])
[6,3,5] = 10 - 1 + 5 = 14   (remove arr[2], add arr[5])

maxSum = 14 ✓
```

### Code
```java
// Step 1 - first window
int windowSum = 0;
for (int i = 0; i < k; i++)
    windowSum += arr[i];

int maxSum = windowSum;

// Step 2 - slide
for (int i = k; i < n; i++) {
    windowSum = windowSum - arr[i - k] + arr[i];
    maxSum = Math.max(maxSum, windowSum);
}

System.out.println("Max sum: " + maxSum);
```

**TC: O(n) SC: O(1)**

---

## 4. Binary Search

### Concept
Find element in sorted array by halving search space each step.

**Condition: Array MUST be sorted.**

### Three Decisions — Memorise This
```
arr[mid] == target  → return mid (found)
arr[mid] < target   → left = mid + 1  (go right)
arr[mid] > target   → right = mid - 1 (go left)
```

### Safe Mid Formula
```java
int mid = left + (right - left) / 2;  // avoids overflow
```

### Dry Run
```
arr = [1, 3, 5, 7, 9, 11, 13], target = 11

Step 1: left=0, right=6, mid=3 → arr[3]=7  → 7<11  → left=4
Step 2: left=4, right=6, mid=5 → arr[5]=11 → FOUND at index 5 ✓
```

### Code
```java
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }

    return -1; // not found
}

// In main:
int result = binarySearch(arr, target);
if (result != -1)
    System.out.println("Found at index: " + result);
else
    System.out.println("Not found.");
```

**TC: O(log n) SC: O(1)**

---

## 5. Frequency Array (26 Letter Trick)

### Concept
Fixed size array of 26 — one slot per letter a to z.

### The Trick — `c - 'a'`
```
'a' - 'a' = 0  → index 0
'b' - 'a' = 1  → index 1
'z' - 'a' = 25 → index 25
```
Converts any character to its array index.

### Reverse — `(char)(i + 'a')`
```
i=11 → (char)(11 + 97) = (char)(108) = 'l'
```
Converts index back to character.

### Always add this safety check
```java
str = str.toLowerCase();
// or inside loop:
if (!Character.isLetter(c)) continue;
```

**TC: O(n) SC: O(1)** — array is always size 26, never grows.

---

### Problem 1 — Character Count
```java
int[] freq = new int[26];
for (int i = 0; i < str.length(); i++)
    freq[str.charAt(i) - 'a']++;

for (int i = 0; i < 26; i++)
    if (freq[i] > 0)
        System.out.println((char)(i + 'a') + " = " + freq[i]);
```

---

### Problem 2 — Anagram Check
```
"listen" and "silent" → anagram ✓
```
```java
if (s1.length() != s2.length()) { System.out.println("Not anagram"); return; }

int[] freq = new int[26];
for (char c : s1.toCharArray()) freq[c - 'a']++;
for (char c : s2.toCharArray()) freq[c - 'a']--;

for (int count : freq)
    if (count != 0) { System.out.println("Not anagram"); return; }

System.out.println("Anagram!");
```

---

### Problem 3 — Duplicate Character
```java
int[] freq = new int[26];
for (char c : str.toCharArray()) freq[c - 'a']++;

for (int i = 0; i < 26; i++)
    if (freq[i] > 1)
        System.out.println((char)(i + 'a') + " = " + freq[i]);
```

---

### Problem 4 — First Non-Repeating Character
```
"aabbcd" → 'c' ✓
```
```java
int[] freq = new int[26];

// Pass 1 - build frequency
for (int i = 0; i < str.length(); i++)
    freq[str.charAt(i) - 'a']++;

// Pass 2 - scan string (NOT freq array) to maintain original order
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    if (freq[c - 'a'] == 1) {
        System.out.println("First non-repeating: " + c);
        return;
    }
}
System.out.println("No non-repeating character.");
```

> **Why second loop on string, not freq array?**
> Freq array scans alphabetically. String scans in original order. "First" means original order.

---

## 6. Kadane's Algorithm

### Concept
Maximum sum of any contiguous subarray.

At each element ask: extend current subarray OR start fresh?
If running sum goes negative → throw it away, start fresh.

### The One Line
```java
current = Math.max(arr[i], current + arr[i]);
//         ↑ fresh start   ↑ extend
```

### Dry Run
```
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

      current  maxSum
-2  →   -2      -2
 1  →    1       1    (fresh start, -2+1=-1 < 1)
-3  →   -2       1
 4  →    4       4    (fresh start, -2+4=2 < 4)
-1  →    3       4
 2  →    5       5
 1  →    6       6  ← maximum
-5  →    1       6
 4  →    5       6

maxSum = 6 ✓ ([4,-1,2,1])
```

### Code
```java
int current = arr[0];
int maxSum = arr[0];

for (int i = 1; i < arr.length; i++) {
    current = Math.max(arr[i], current + arr[i]);
    maxSum = Math.max(maxSum, current);
}

System.out.println("Max subarray sum: " + maxSum);
```

**TC: O(n) SC: O(1)**

---

## 7. String Methods — Quick Reference

```java
str.length()           // length
str.charAt(i)          // char at index
str.toCharArray()      // String → char[]
str.toLowerCase()      // uppercase → lowercase
str.equals(str2)       // content compare (NOT ==)
"hello".equals(str)    // safer, avoids NullPointerException

// StringBuilder
StringBuilder sb = new StringBuilder();
sb.append("x");        // add to end
sb.reverse();          // reverse in place
sb.toString();         // convert back to String
```

### `==` vs `.equals()`
```java
String a = new String("hello");
String b = new String("hello");

a == b        // false — different objects in memory
a.equals(b)   // true  — same content ✓
```

> **Rule:** Always use `.equals()` for String comparison. `==` compares memory address, not content.

### Character Utility Methods
```java
Character.isLetter('a')     // true
Character.isDigit('3')      // true
Character.toLowerCase('A')  // 'a'
Character.toUpperCase('a')  // 'A'
```

---

## 8. HashMap vs HashSet

| | HashMap | HashSet |
|---|---|---|
| Stores | Key-value pairs | Unique values only |
| Use for | Frequency counting | Duplicate detection |
| Method | `map.getOrDefault(k, 0)` | `set.contains(x)` |

```java
// HashMap - frequency count
Map<Character, Integer> freq = new HashMap<>();
for (char c : str.toCharArray())
    freq.put(c, freq.getOrDefault(c, 0) + 1);

// HashSet - duplicate check
Set<Integer> seen = new HashSet<>();
for (int num : arr) {
    if (seen.contains(num)) return true;
    seen.add(num);
}
```

---

## 9. Pattern Selection — Cheat Sheet

| Problem says... | Use |
|---|---|
| Sorted array + find element | Binary search |
| Sorted array + find pair | Two pointers |
| Subarray of size k | Sliding window |
| Longest/shortest subarray | Sliding window |
| Count characters / anagram | Frequency array |
| Duplicates in array | HashSet |
| Frequency of elements | HashMap |
| Max subarray sum | Kadane's |
| Compare strings | `.equals()` |

---

## 10. Common Mistakes — Don't Do These

```
❌ arr[mid] == target   should be  ✓ arr[mid] == target (not target == mid)
❌ freq array on unsorted string   → ArrayIndexOutOfBounds
❌ == for String comparison        → silent wrong result
❌ HashSet stores key-value        → HashSet stores values only
❌ Two pointers on unsorted array  → wrong result, no error
❌ SC of nested loops is O(n²)     → SC is O(1), only TC is O(n²)
❌ str.split(" ") for char array   → use str.toCharArray()
❌ Check freq[i] in second loop    → check freq[c-'a'] on string
```

---

## Quick Interview Checklist

Before solving any problem ask:
1. Is array sorted? → Binary search / Two pointers
2. Need subarray of fixed size? → Sliding window
3. Counting characters? → Frequency array
4. Finding duplicates? → HashSet
5. Max subarray sum? → Kadane's

When stuck say:
> "Let me think about what pattern this looks like — is it a pair problem, a subarray problem, or a search problem?"

---

*जय महाकाल 🔱 — You got this.*
