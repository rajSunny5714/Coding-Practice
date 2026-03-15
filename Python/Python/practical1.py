def celsius_to_fahrenheit(celsius):
    return celsius * 9/5 + 32

# Print a table of Celsius and Fahrenheit equivalences
print("Celsius\tFahrenheit")
print("-------------------")

for celsius in range(0, 101, 10):
    fahrenheit = celsius_to_fahrenheit(celsius)
    print(f"{celsius}\t{fahrenheit}")