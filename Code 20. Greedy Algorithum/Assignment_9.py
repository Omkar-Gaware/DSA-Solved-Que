numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print("List of numbers:",numbers)

# List Contains Even Numbers
print("\nList of even numbers:")
evenNumbers = list(filter(lambda x: x%2 == 0, numbers))
print(evenNumbers)

# List Contains Odd Numbers
print("\nList Odd numbers:")
oddNumbers = list(filter(lambda x: x%2 != 0, numbers))
print(oddNumbers)

# List Numbers Divisible by 3 Numbers
print("\nList numbers divisible_by_3 :")
divisible_by_3 = list(filter(lambda x: x%3 == 0, numbers))
print(divisible_by_3)

# Square of List numbers
print("\nSquare of List numbers :")
square = list(map(lambda x: x ** 2, numbers))
print(square)

# Cube of List numbers
print("\nCube of List numbers :")
Cube = list(map(lambda x: x ** 3, numbers))
print(Cube)