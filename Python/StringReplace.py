#!/usr/bin/env python

badchar = list()
def badCharFill(s1):
    for i in range(0, 256):
        badchar.append(-1)
    i=0
    for char in s1:
        badchar[int(char)] = i
        i+=1
    return

def replace(s1, s2, s3):
    n = len(s1)
    m = len(s2)
    pointer = 0
    #badCharFill(s1)
    while True:
        index = search(s1, s2, pointer)
        if index == -1:
            break
        s1 = s1[:index]+s3+s1[index+m:]
        pointer = index+len(s3)
    return s1

def search(s1, s2, pointer):
    s1 = s1[pointer:]
    for i in range(0, len(s1)):
        if s1[i] == s2[0]:
            for j in range(1, len(s2)-2):
                if s1[j] != s2[j]:
                    break
            return i+pointer
    return -1

x = replace('Microsoftic', 'ic', 'MSFT')
print x