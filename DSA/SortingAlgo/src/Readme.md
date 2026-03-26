# 🚀 Sorting Algorithms Mastery Guide (Interview Ready)

## 👑 Goal

Ek hi jagah par **intuition + dry run + code + complexity + use cases + memory tricks**
So that you NEVER forget sorting algorithms again.

---

# 🧠 1. BIG PICTURE

## Types of Sorting

### 🐢 Simple (Brute Force)

* Bubble Sort
* Selection Sort
* Insertion Sort

### ⚡ Efficient (Divide & Conquer)

* Merge Sort
* Quick Sort

### 🎯 Special (Non-comparison)

* Heap Sort
* Counting Sort
* Radix Sort
* Bucket Sort

---

# 🔥 2. MEMORY MASTER TRICK

👉 **B S I M Q H C R B**

Sentence:
👉 **"Bhai Smart Insaan Merge Quick Hehe Counting Radix Bucket"**

---

# 🫧 3. BUBBLE SORT

## 🧠 Intuition

Adjacent compare → swap → largest goes to end

## 🔍 Dry Run

[5,3,2,4]

Pass 1 → [3,2,4,5]
Pass 2 → [2,3,4,5]

## 💻 Code

```java
for(int i=0;i<n-1;i++){
  boolean swapped=false;
  for(int j=0;j<n-i-1;j++){
    if(arr[j]>arr[j+1]){
      int temp=arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;
      swapped=true;
    }
  }
  if(!swapped) break;
}
```

## ⏱️ Complexity

Best: O(n)
Worst: O(n²)

## 🧠 Trick

👉 Bubble = Adjacent Swap

---

# 🎯 4. SELECTION SORT

## 🧠 Intuition

Find minimum → swap with front

## 🔍 Dry Run

[5,3,2,4] → [2,3,4,5]

## 💻 Code

```java
for(int i=0;i<n-1;i++){
  int min=i;
  for(int j=i+1;j<n;j++){
    if(arr[j]<arr[min]) min=j;
  }
  int temp=arr[i];
  arr[i]=arr[min];
  arr[min]=temp;
}
```

## ⏱️ Complexity

Always O(n²)

## 🧠 Trick

👉 Selection = Min find + 1 swap

---

# 🃏 5. INSERTION SORT

## 🧠 Intuition

Cards arrange karne jaisa

## 🔍 Dry Run

[5,3,2,4] → [3,5] → [2,3,5] → [2,3,4,5]

## 💻 Code

```java
for(int i=1;i<n;i++){
  int key=arr[i];
  int j=i-1;
  while(j>=0 && arr[j]>key){
    arr[j+1]=arr[j];
    j--;
  }
  arr[j+1]=key;
}
```

## ⏱️ Complexity

Best: O(n)
Worst: O(n²)

## 🧠 Trick

👉 Shift + Insert

---

# 🔥 6. MERGE SORT

## 🧠 Intuition

Divide → Sort → Merge

## 🔍 Dry Run

[5,3,2,4]
→ [5,3] [2,4]
→ [3,5] [2,4]
→ [2,3,4,5]

## 💻 Code

```java
void mergeSort(int[] arr,int l,int r){
  if(l>=r) return;
  int mid=(l+r)/2;
  mergeSort(arr,l,mid);
  mergeSort(arr,mid+1,r);
  merge(arr,l,mid,r);
}
```

## ⏱️ Complexity

Always O(n log n)

## 🧠 Trick

👉 Guaranteed performance

---

# ⚡ 7. QUICK SORT

## 🧠 Intuition

Pivot → partition → recursive sort

## 🔍 Dry Run

[5,3,2,4]
Pivot 5 → [3,2,4] | 5
Pivot 4 → [2,3] | 4
Final → [2,3,4,5]

## 💻 Code

```java
int partition(int[] arr,int low,int high){
  int pivot=arr[high];
  int i=low-1;
  for(int j=low;j<high;j++){
    if(arr[j]<pivot){
      i++;
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
  }
  int temp=arr[i+1];
  arr[i+1]=arr[high];
  arr[high]=temp;
  return i+1;
}
```

## ⏱️ Complexity

Best: O(n log n)
Worst: O(n²)

## 🧠 Trick

👉 Fast but risky

---

# 🏔️ 8. HEAP SORT

## 🧠 Intuition

Max heap → extract max

## Steps

1. Build heap
2. Swap root with last
3. Heapify

## ⏱️ Complexity

O(n log n)

## 🧠 Trick

👉 Tree based sorting

---

# 🔢 9. COUNTING SORT

## 🧠 Intuition

Count frequency → rebuild array

## Example

[4,2,2,1] → count → [1,2,2,4]

## ⏱️ Complexity

O(n + k)

## 🧠 Trick

👉 No comparison

---

# 📊 10. RADIX SORT

## 🧠 Intuition

Digit by digit sort

## Example

[170,45,75]
→ units → tens → hundreds

## ⏱️ Complexity

O(nk)

## 🧠 Trick

👉 Uses Counting Sort

---

# 🪣 11. BUCKET SORT

## 🧠 Intuition

Divide into buckets → sort individually

## Best For

Uniform distribution

---

# ⚡ 12. TIME COMPLEXITY SUMMARY

| Algo      | Best       | Avg        | Worst      |
| --------- | ---------- | ---------- | ---------- |
| Bubble    | O(n)       | O(n²)      | O(n²)      |
| Selection | O(n²)      | O(n²)      | O(n²)      |
| Insertion | O(n)       | O(n²)      | O(n²)      |
| Merge     | O(n log n) | O(n log n) | O(n log n) |
| Quick     | O(n log n) | O(n log n) | O(n²)      |

---

# 🎯 13. WHEN TO USE WHAT

| Situation              | Best Algo |
| ---------------------- | --------- |
| Small / nearly sorted  | Insertion |
| Guaranteed performance | Merge     |
| Fast practical         | Quick     |
| Memory efficient       | Heap      |
| Integers limited range | Counting  |

---

# 🧠 14. FINAL REVISION TRICK

👉 Compare-based?
→ Bubble / Selection / Insertion

👉 Divide?
→ Merge / Quick

👉 No comparison?
→ Counting / Radix / Bucket

---

# 💥 FINAL INTERVIEW SUMMARY

* Quick Sort = Most asked 🔥
* Merge Sort = Stable + predictable
* Insertion = Best for small input
* Counting/Radix = Non-comparison magic

---

# 🏁 YOU ARE READY

Agar tu is README ko 2–3 baar revise kare:
👉 Tu sorting ka KING ban jayega
👉 Interview mein koi nahi hila payega

---

**Next Step (Recommended):**

* 5 LeetCode questions (easy → medium)
* Ek baar khud se code likh bina dekhe

---

🔥 DONE. तू अब beginner नहीं रहा.
