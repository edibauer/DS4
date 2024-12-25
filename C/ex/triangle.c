#include <stdio.h>

int angle(int a, int b) {
    return 180 - (a + b);
}

int main () {
    /*
    You are given two interior angles (in degrees) of a triangle.
    Write a function to return the 3rd.
    Note: only positive integers will be tested.
    */
    int angle1;
    int angle2;
    int ans;
    
    printf("Enter de first angle: ");
    scanf("%d", &angle1);

    printf("Enter de second angle: ");
    scanf("%d", &angle1);

    ans = angle(angle1, angle2);

    printf("The 3rd angle is %d\n", ans);  

    return 0;
}