#!/usr/bin/env python

def perm(s1,s2):
    s1 = s1.lower().replace(' ', '')
    s2 = s2.lower().replace(' ', '')
    if s1==s2:
        print 'Valid Pattern'
    elif histogram(s1) == histogram(s2):
        print 'Valid Pattern'
    else:
        print 'Invalid Pattern'

def histogram(s):
    d = dict()
    for c in s:
        if c not in d:
            d[c] = 1
        else:
            d[c] += 1
    return d
    
    
def main():
    f = open('data2.txt', 'r')
    for line in f:
        line = line.strip()
        line = line.replace('\"','')
        li = line.split(',')
        perm(li[0], li[1])
    f.close()

main()