#!/usr/bin/env python

from constraint import *

filePath = "hw04-data-courses.csv"

def fileParser():
    ret = []
    f = open(filePath, "r")
    for line in f:
        line = line.strip()
        tempList = []
        for e in line.split(','):
            tempList.append(e.strip())
        ret.append(tempList)
    f.close()
    return ret

def main():
    classDict = dict()
    schedule = list()
    problem = Problem()
    data = fileParser()
    for e in data:
        className = e[0]
        times = e[2]+e[3]
        if(className not in classDict.keys()):
            classDict[className] = list()
        classDict[className].append(times)
    sortedKeys = sorted(classDict.keys())
    i = 97
    for key in sortedKeys:
        problem.addVariables(chr(i), classDict[key])
        i+=1
    problem.addConstraint(AllDifferentConstraint())
    solutions = problem.getSolutions()
    k = 1
    for sol in solutions:
        j = 97
        print '------------------'
        print("Solution %d\n"%(k))
        while(j<i):
            classTime = sol[chr(j)]
            print sortedKeys[j-97], classTime[0], classTime[1:5]
            j+=1
        k+=1

main()
    
    