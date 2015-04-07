#include "iostream"
#include "cstring"
using namespace std;

void longestPali(string s) {
    int center;
    int pointA = 1, pointB = 1;
    int length = s.length();
    int counter, max = 0;
    int startIndex, endIndex;
    for(center = 1; center<length; center++) {
        counter = 1;
        pointA = center - 1;
        pointB = center + 1;
        do {
            //std::cout<<center<<"\t"<<pointA<<"\t"<<pointB<<endl;
            //std::cout<<s.substr(pointA, pointB)<<endl;
            if(s[pointA] != s[pointB])
                break;
            else
                counter++;
            pointA--;
            pointB++;
        } while(pointA>= 0 && pointB < length);
        if(counter>max) {
            max = counter;
            startIndex = pointA;
            endIndex = pointB;
        }
    }
    std::cout<<"Longest: "<<max<<endl;
    if(max>1) {
        std::cout<<"Substring: "<< s.substr(startIndex+1, endIndex-startIndex-1)<<endl;
    }
}

int main() {
    string s = "forgeekskeegfor";
    longestPali(s);
    return 0;
}
