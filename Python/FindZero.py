#!/usr/bin/env python
from sets import Set

class Matrix:
    def __init__(self, rows, cols):
        self.rows = rows
        self.cols = cols
        self.matrix = [[0]*cols for i in range(rows)]
    def populate(self,x):
        currRow = 0
        for row in x:
            currCol = 0
            for item in row:
                self.matrix[currRow][currCol] = item
                currCol += 1
            currRow += 1
    
    def find(self, x):
        ret = [Set(), Set()]
        for i in range(self.rows):
            for j in range(self.cols):
                if self.matrix[i][j] == 0:
                    ret[0].add(i)
                    ret[1].add(j)
        return ret
    
    def zeroOut(self):
        sets = self.find(0)
        # Zero out rows
        for i in sets[0]:
            for j in range(self.cols):
                self.matrix[i][j] = 0
        # Zero out cols
        for i in sets[1]:
            for j in range(self.rows):
                self.matrix[j][i] = 0
    
    def printMatrix(self):
        for row in self.matrix:
            for col in row:
                print('%d\t'%col),
            print '\n'
    def get(self,row, col):
        return self.matrix[row][col]
    def put(self,
            item, row, col):
        self.matrix[row][col] = item
        

matrix = Matrix(4,4)
x = ((1,2,3,4), (5,6,7,8), (9,10,0,11), (12,13,14,0))
matrix.populate(x)
matrix.printMatrix()
print '----------------------------------'
matrix.zeroOut()
matrix.printMatrix()