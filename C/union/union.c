#include <stdio.h>

union my_union {
    int entero;
    float flotante;
};


int main() {
    union my_union u;
    u.entero = 123456789;
    u.flotante = 3.69; // this variable changes the first one
    return 0;
}
