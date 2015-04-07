#!/usr/bin/env python

import itertools
def perm(s1,s2):
    s1 = s1.lower().replace(' ', '')
    s2 = s2.lower().replace(' ', '')
    flag = False
    perms = list(itertools.permutations(s1))
    for itm in perms:
        if (''.join(itm)).strip() == s2:
            print 'Valid'
            falg = True
            break
    if flag:
        print 'Invalid'
    
    
def main():
    f = open('data2.txt', 'r')
    for line in f:
        print line
        line.replace('"','')
        li = line.split(',')
        perm(li[0], li[1])
    f.close()

main()