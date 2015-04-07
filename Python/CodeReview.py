#!/usr/bin/env python

def reachability(instructions):
    i = 0
    while i < len(instructions):
        if instructions[i] == 'VISITED':
            break
        elif instructions[i][:4] == 'GOTO':
            temp = int(instructions[i][5:])-1
            instructions[i] = 'VISITED'
            i = temp
        else:
            instructions[i] = 'VISITED'
            i+=1
    for i in range(len(instructions)):
        if instructions[i] != 'VISITED':
            print i+1
            
def main():
    f = open('data3.txt', 'r')
    instructions = []
    for line in f:
        line = line.strip()
        instructions.append(line)
    f.close()
    reachability(instructions)
    
main()