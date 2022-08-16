class Solution(object):
    def addBinary(self, a, b):
        Sum = int(a, 2) + int(b, 2)
        binary=bin(Sum)
        return binary[2:]
        