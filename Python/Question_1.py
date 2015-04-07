#!/usr/bin/env python

def longest_common_substring(s1, s2):
    m = [[0] * (1 + len(s2)) for i in xrange(1 + len(s1))]
    longest, x_longest = 0, 0
    for x in xrange(1, 1 + len(s1)):
        for y in xrange(1, 1 + len(s2)):
            if s1[x - 1] == s2[y - 1]:
                m[x][y] = m[x - 1][y - 1] + 1
                if m[x][y] > longest:
                    longest = m[x][y]
                    x_longest = x
            else:
                m[x][y] = 0
    return s1[x_longest - longest: x_longest]

def main():
    f = open('data.txt', 'r')
    input_line1 = f.readline().split(' ')
    citizens = int(input_line1[0])
    citizen_dna = list()
    for i in range(citizens):
        citizen_dna.append(f.readline().strip())
    virus_dna = f.readline().strip()
    
    probabilty_list = list()
    for dna in citizen_dna:
        lcs = longest_common_substring(dna, virus_dna)
        probabilty_list.append(float(len(lcs))/float(len(virus_dna)))
    temp = list()
    for elm in probabilty_list:
        if elm not in temp:
            temp.append(elm)
    temp.sort()
    temp = temp[::-1]
    for i in range(citizens):
        rank = temp.index(probabilty_list[i])+1
        print('Person #%d: %d.'%(i,rank))
    
    
    
main()
