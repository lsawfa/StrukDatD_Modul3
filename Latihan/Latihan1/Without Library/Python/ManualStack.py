class Stack:
    def __init__(self, a):
        self.maxSize = a
        self.stackArrays = [None] * self.maxSize
        self.top = -1

    def push(self, j):
        self.top += 1
        self.stackArrays[self.top] = j

    def pop(self):
        value = self.stackArrays[self.top]
        self.top -= 1
        return value

    def peek(self):
        return self.stackArrays[self.top]

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.maxSize - 1

    def search(self, value):
        for i in range(self.top, -1, -1):
            if self.stackArrays[i] == value:
                return self.top - i + 1
        return -1
    
theStack = Stack(10)

theStack.push("Aku")
theStack.push("Anak")
theStack.push("Indonesia")

print("Next : ", theStack.peek())

theStack.push("Raya")
print(theStack.pop())

theStack.push("!")

count = theStack.search("Aku")
while count != -1 and count > 1:
    theStack.pop()
    count -= 1

print(theStack.pop())
print(theStack.isEmpty())