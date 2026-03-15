class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            raise IndexError("pop from an empty stack")

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            raise IndexError("peek from an empty stack")

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def display(self):
        print("Stack:", self.items)

# Example usage:
stack = Stack()

stack.push(1)
stack.push(2)
stack.push(3)

stack.display()  # Output: Stack: [1, 2, 3]

print("Peek:", stack.peek())  # Output: Peek: 3

popped_item = stack.pop()
print("Popped:", popped_item)  # Output: Popped: 3

stack.display()  # Output: Stack: [1, 2]