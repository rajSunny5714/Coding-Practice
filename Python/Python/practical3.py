def calculate_factorial(n):
      if n==1:
         return 1
      else:
        return n * calculate_factorial(n - 1)

# Input the number for which you want to calculate the factorial
number = int(input("Enter a number: "))

# Calculate and print the factorial
factorial_result = calculate_factorial(number)
print(f"The factorial of {number} is: {factorial_result}")

 