class Queue:
    def __init__(self, s):
        self.maxSize = s
        self.queueArray = [None] * self.maxSize
        self.front = 0
        self.rear = -1
        self.currentSize = 0

    def enqueue(self, item):
        if self.isFull():
            print("Queue is full")
            return
        self.rear += 1
        self.queueArray[self.rear] = item
        self.currentSize += 1

    def dequeue(self):
        if self.isEmpty():
            print("Queue is empty")
            return None
        item = self.queueArray[self.front]
        self.front += 1
        self.currentSize -= 1
        return item

    def element(self):
        if self.isEmpty():
            print("Queue is empty")
            return None
        return self.queueArray[self.front]

    def peek(self):
        if self.isEmpty():
            return None
        return self.queueArray[self.front]

    def poll(self):
        if self.isEmpty():
            print("Queue is empty")
            return None
        item = self.queueArray[self.front]
        self.front += 1
        self.currentSize -= 1
        return item

    def isFull(self):
        return self.currentSize == self.maxSize

    def isEmpty(self):
        return self.currentSize == 0

    def size(self):
        return self.currentSize

queue = Queue(5)
queue.enqueue("Java")
queue.enqueue("DotNet")
queue.enqueue("PHP")
queue.enqueue("HTML")

print(queue.dequeue())
print(queue.element())
print(queue.poll())
print(queue.peek())