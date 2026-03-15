def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1  # Return -1 if the target is not found in the list

def binary_search(arr, target):
    low, high = 0, len(arr) - 1

    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1

    return -1  # Return -1 if the target is not found in the list

# Example usage:
my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
target_value = 7

# Linear Search
linear_result = linear_search(my_list, target_value)
print(f"Linear Search: Element {target_value} found at index {linear_result}" if linear_result != -1
      else f"Linear Search: Element {target_value} not found in the list")

# Binary Search (Note: The list must be sorted for binary search to work correctly)
sorted_list = sorted(my_list)
binary_result = binary_search(sorted_list, target_value)
print(f"Binary Search: Element {target_value} found at index {binary_result}" if binary_result != -1
      else f"Binary Search: Element {target_value} not found in the list")
 