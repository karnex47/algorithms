#include "iostream"
#include "math.h"
#include "string"
#include "sstream"

void toBinaryString(int);
int main() {
    float n = 3.14;
    float decPart = fmod(n,1);
    //std::cout<<decPart<<std::endl;
    toBinaryString(5);
    return 0;
}

void toBinaryString(int n) {
    std::string b_string = "";
    while(n>0) {
        int r = n%2;
        std::stringstream ss;
        ss<<r;
        b_string = ss.str().append(b_string);
        n = n>>1;
    }
    std::cout<<b_string<<std::endl;
}
