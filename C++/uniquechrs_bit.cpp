#include "iostream"

using namespace std;

bool uniqueChars(string c) {
    int checker = 0;
    for (int i = 0; i < c.length(); ++i) {
        int val = c[i] - 'a';
        if ((checker & (1 << val)) > 0)
            return false;
        checker |= (1 << val);
    }
    return true;
}

int main() {
    string c;
    std::cin>>c;
    uniqueChars(c)?std::cout<<"Unique":std::cout<<"Not Unique";
    return 0;
}
