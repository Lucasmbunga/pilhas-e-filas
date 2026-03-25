class Stack:
    def __init__(self):
        self.items = [None] * 10
        self.length = 0

    def push(self, item):
        self._aumentar_capacidade()
        self.items[self.length] = item
        self.length += 1

    def _aumentar_capacidade(self):
        if self.length == len(self.items):
            new_items = [None] * (len(self.items) * 2)

            for i in range(len(self.items)):
                new_items[i] = self.items[i]

            self.items = new_items

    def pop(self):
        if self.is_empty():
            return None

        position = self.length - 1
        deleted_item = self.items[position]

        self.items[position] = None
        self.length -= 1

        return deleted_item

    def peek(self):
        if self.is_empty():
            return None
        return self.items[self.length - 1]

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