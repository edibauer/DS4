#include <stdio.h>
#define NUMBER 369

int main(int argc, char** argv) {
    printf("The number is: %d\n", NUMBER);
    #undef NUMBER
    #define NUM 639
    printf("%d\n", NUM);
    printf("Hola\n");
    return 0;
}