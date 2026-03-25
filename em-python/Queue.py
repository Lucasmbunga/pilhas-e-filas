class Queue:
    def __init__(self):
        self.items = [None] * 10
        self.length = 0

    def enqueue(self, item):
        self.resize()
        self.items[self.length] = item
        self.length += 1

    def resize(self):
        if self.length == len(self.items):
            new_items = [None] * (len(self.items) * 2)

            for i in range(len(self.items)):
                new_items[i] = self.items[i]

            self.items = new_items

    def dequeue(self):
        if self.is_empty():
            return None

        position = 0
        deleted_item = self.items[position]

        for i in range(position, self.length - 1):
            self.items[i] = self.items[i + 1]

        self.items[self.length - 1] = None
        self.length -= 1

        return deleted_item

    def peek(self):
        if self.is_empty():
            return None
        return self.items[0]

    def is_empty(self):
        return self.length == 0

    def size(self):
        return self.length

    def clear(self):
        self.items = [None] * 10
        self.length = 0

    def __str__(self):
        result = "["
        for i in range(self.length - 1):
            result += str(self.items[i]) + ", "

        if self.length > 0:
            result += str(self.items[self.length - 1])

        result += "]"
        return result