#!/usr/bin/env python

class StringShift:
    s = str()
    def __init__(self, s):
        self.s = s
    
    def __rshift__(self, right):
        if(right < 0):
            return self<<right
        x = self.s[right:]+self.s[:right]
        return x
        
    def __lshift__(self, left):
        if(left < 0):
            return self>>left
        x = self.s[len(self.s)-left:]+self.s[:len(self.s)-left]
        return x

s = StringShift('Microsoft')
print s<<3
