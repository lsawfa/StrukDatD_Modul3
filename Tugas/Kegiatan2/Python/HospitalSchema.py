class Link:
    def __init__(self, d):
        self.dData = d
        self.next = None

    def displayLink(self):
        print(self.dData, end=" ")

class FirstLastList:
    def __init__(self):
        self.first = None
        self.last = None

    def isEmpty(self):
        return self.first == None

    def insertLast(self, dd):
        newLink = Link(dd)
        if self.isEmpty():
            self.first = newLink
        else:
            self.last.next = newLink
        self.last = newLink

    def deleteFirst(self):
        temp = self.first.dData
        if self.first.next == None:
            self.last = None
        self.first = self.first.next
        return temp

    def displayList(self):
        current = self.first
        while current != None:
            current.displayLink()
            current = current.next

class LinkQueue:
    def __init__(self):
        self.theList = FirstLastList()

    def isEmpty(self):
        return self.theList.isEmpty()

    def enqueue(self, j):
        self.theList.insertLast(j)

    def dequeue(self):
        return self.theList.deleteFirst()

    def peek(self):
        if self.isEmpty():
            return None
        return self.theList.first.dData

    def displayQueue(self):
        print("Daftar Pengunjung: ")
        self.theList.displayList()
        print("\n")

    def size(self):
        count = 0
        current = self.theList.first
        while current != None:
            count += 1
            current = current.next
        return count

queue = LinkQueue()

# Penambahan antrean pasien
queue.enqueue("Pasien1")
queue.enqueue("Pasien2")
queue.enqueue("Pasien3")
print("Panjang Antrean:", queue.size())
queue.displayQueue()

# Pemanggilan pasien
print("Pemanggilan kepada", queue.dequeue())
print("Panjang Antrean:", queue.size())
queue.displayQueue()

# Pemberitahuan persiapan pasien selanjutnya
print("Kepada", queue.peek(), "harap siap-siap")
print("Panjang Antrean:", queue.size())
queue.displayQueue()