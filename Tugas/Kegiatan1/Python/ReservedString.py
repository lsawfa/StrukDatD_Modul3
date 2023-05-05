class Stack:
    def __init__(self, s):
        self.maxSize = s
        self.stackArray = [''] * self.maxSize
        self.top = -1

    def push(self, text):
        self.top += 1
        self.stackArray[self.top] = text

    def pop(self):
        temp = self.stackArray[self.top]
        self.top -= 1
        return temp

    def peek(self):
        return self.stackArray[self.top]

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.maxSize - 1

text = input("Masukkan input: ")
theStack = Stack(len(text))

for c in text:
    theStack.push(c)

print("Reserved: ", end='')
while not theStack.isEmpty():
    value = theStack.pop()
    print(value, end='')