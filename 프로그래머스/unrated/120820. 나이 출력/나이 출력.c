#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int age) {
    int answer = 0;
     if (age > 0 && age <= 120) {
        age += 1;
        answer = 2023 -age + 1;
    }

    return answer;
}