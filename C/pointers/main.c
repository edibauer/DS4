#include <stdio.h>

void play(int* n) {
    /*
    n = (n + 3) * 2 - 1;
    printf("%d\n", n);
    */
    int y = *n; // obtains the value of the memory
    y = (y + 2) / 2 + 2 - (3 * y);
    *n = y; // assigns the new value into value mem

}

int main() {
    int num = 9;
    play(&num);
    printf("Number = %d\n", num);
    return 0;
}