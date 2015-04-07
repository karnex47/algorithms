#include "iostream"
#include "fstream"

#define ARRAYSIZE(a) (sizeof(a)/4)
using namespace std;

int main() {
    ofstream file;
    int N, i, j, k, l;
    int a[] = {10,15,7,8,16,1,2,2,5,3,0};
    N = ARRAYSIZE(a);
    int sum[N][N];
    for(i = 0; i<N; i++) {
        for(j = 0; j<N; j++) {
            sum[i][j] = a[i]+a[j];
        }
    }
    file.open("out2.txt");
    for(i = 0; i<N; i++) {
        for(j = 0; j<N; j++) {
            file<<sum[N-j-1][i]<<"\t";
        }
        file<<endl;
    }
    /*for(i = 0; i<N; i++) {
        for(j = 0; j<N; j++) {
            for(k = 0; k<N; k++) {
                for(l = 0; l<N; l++){
                    if((i != k && j != l) && (i != l && j != k)) {
                        if(sum[i][j] == sum[k][l]) {
                            std::cout<<"a["<<i<<"]+a["<<j<<"] = a["<<k<<"]+a["<<l<<"]"<<endl;
                        }
                    }
                }
            }
        }
        std::cout<<endl;
    }*/
    return 0;
}
