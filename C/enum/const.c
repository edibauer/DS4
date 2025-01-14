#include <stdio.h>

// function
void printMessage(const char* msg) {
    printf("Message: %s\n", msg);
}

int main() {
    const char* str = "I dont make mistakes";
    printMessage(str);

    return 0;
}