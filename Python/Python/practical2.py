def generate_fibonacci(n):
    fibonacci_series = [0, 1]

    while len(fibonacci_series) < n:
        next_number = fibonacci_series[-1] + fibonacci_series[-2]
        fibonacci_series.append(next_number)

    return fibonacci_series

# Input the number of terms you want in the Fibonacci series
num_terms = int(input("Enter the number of terms in the Fibonacci series: "))

# Generate and print the Fibonacci series
fibonacci_result = generate_fibonacci(num_terms)
print("Fibonacci Series:", fibonacci_result)
