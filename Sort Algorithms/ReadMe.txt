SortAlgorithms
|
+-- Bubble Sort
|   |
|   +-- Description: Repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
|   +-- Use Case: Simple and educational purposes, small datasets.
|   +-- Complexity: O(n^2)
|
+-- Selection Sort
|   |
|   +-- Description: Repeatedly finds the minimum element from the unsorted part and puts it at the beginning.
|   +-- Use Case: Simple and educational purposes, small datasets.
|   +-- Complexity: O(n^2)
|
+-- Insertion Sort
|   |
|   +-- Description: Builds the final sorted array one item at a time by repeatedly picking the next item and inserting it into its correct position.
|   +-- Use Case: Small datasets, nearly sorted arrays.
|   +-- Complexity: O(n^2) average and worst-case, O(n) best-case
|
+-- Merge Sort
|   |
|   +-- Description: Divides the list into halves, recursively sorts them, and then merges the sorted halves.
|   +-- Use Case: Large datasets, stable sort.
|   +-- Complexity: O(n log n)
|
+-- Quick Sort
|   |
|   +-- Description: Picks an element as a pivot and partitions the array around the pivot. Recursively applies the same logic to the sub-arrays.
|   +-- Use Case: General-purpose sorting, in-place sorting.
|   +-- Complexity: O(n log n) average, O(n^2) worst-case
|   |
|   +-- Derivatives:
|       |
|       +-- Three-Way Quick Sort
|             +-- Description: Partitions the array into three parts: less than, equal to, and greater than the pivot.
|
+-- Heap Sort
|   |
|   +-- Description: Builds a heap from the list, then repeatedly extracts the maximum element from the heap and rebuilds the heap.
|   +-- Use Case: Large datasets, in-place sorting.
|   +-- Complexity: O(n log n)
|
+-- Counting Sort
|   |
|   +-- Description: Counts the number of occurrences of each distinct element and uses this information to place elements in the correct position.
|   +-- Use Case: Datasets with a small range of integer keys.
|   +-- Complexity: O(n + k) where k is the range of the input
|
+-- Radix Sort
|   |
|   +-- Description: Sorts numbers by processing individual digits, starting from the least significant digit to the most significant digit.
|   +-- Use Case: Large numbers of integers or strings with fixed length.
|   +-- Complexity: O(nk) where k is the number of digits
|
+-- Tim Sort
    |
    +-- Description: Hybrid sorting algorithm derived from merge sort and insertion sort, designed to perform well on many kinds of real-world data.
    +-- Use Case: General-purpose sorting, default sort in Python and Java.
    +-- Complexity: O(n log n)
