#include <stdio.h>

int main () {
    int x = 9; 
    int* dirX = &x;

    printf("x = %d\n", x);
    printf("Dirección de memoria de X = %p\n", &x);
    //return 0;
}