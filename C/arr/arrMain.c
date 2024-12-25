#include <stdio.h>

int main() {
    int edades[6];
    for (int i = 0; i < 6; i++) {
        printf("Introduce la edad %d: ", i + 1);
        scanf("%d", &edades[i]);
    }

    for (int i = 0; i < 6; i++) {
        printf("edades[%d] = %d\n", i, edades[i]);
    }
    
    return 0;
}