def generate_pattern(n):
    for i in range(1, n + 1):
        line = '*' * i
        print(line)

# Example usage:
size = int(input("Enter a positive integer (n): "))
generate_pattern(size)